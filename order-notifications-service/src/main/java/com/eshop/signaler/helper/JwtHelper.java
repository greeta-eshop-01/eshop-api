package com.eshop.signaler.helper;

import com.eshop.signaler.security.JwtAuthConverterProperties;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimNames;

public class JwtHelper {

    public static String getPrincipalClaimName(Jwt jwt, JwtAuthConverterProperties properties) {
        String claimName = JwtClaimNames.SUB;
        if (properties.getPrincipalAttribute() != null) {
            claimName = properties.getPrincipalAttribute();
        }
        return claimName;
    }
}

