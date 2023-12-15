package com.eshop.gateway.helper;

import com.eshop.gateway.security.JwtAuthConverterProperties;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimNames;

public class JwtHelper {

    public static String getUsername(Jwt jwt, JwtAuthConverterProperties properties) {
        String claimName = JwtClaimNames.SUB;
        if (properties.getPrincipalAttribute() != null) {
            claimName = properties.getPrincipalAttribute();
        }
        return jwt == null ? null : jwt.getClaim(claimName);
    }
}

