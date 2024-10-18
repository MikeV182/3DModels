package com.project.Main.models;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@RequiredArgsConstructor
public class ClientPrincipal implements UserDetails {
    @Autowired
    private final Client client;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return client.getPassword();
    }

    @Override
    public String getUsername() {
        return client.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; //TODO
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; //TODO
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; //TODO
    }

    @Override
    public boolean isEnabled() {
        return true; //TODO
    }
}
