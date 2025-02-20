package com.sac.backend.services;

import com.sac.backend.security.UserDetailsImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    public static UserDetailsImpl authenticated() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            return (UserDetailsImpl) auth.getPrincipal();
        }
        return null;
    }
}
