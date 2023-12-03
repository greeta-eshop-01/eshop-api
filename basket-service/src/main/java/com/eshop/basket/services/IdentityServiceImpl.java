package com.eshop.basket.services;

import com.eshop.basket.helper.JwtHelper;
import com.eshop.basket.security.JwtAuthConverterProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IdentityServiceImpl implements IdentityService {

  private final JwtAuthConverterProperties jwtAuthConverterProperties;

  @Override
  public String getUserIdentity() {
    return SecurityContextHolder.getContext().getAuthentication().getName();
  }

  @Override
  public String getUserName() {
    var token = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return JwtHelper.getUsername(token, jwtAuthConverterProperties);
  }
}
