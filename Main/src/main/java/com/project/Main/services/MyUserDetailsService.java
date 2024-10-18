package com.project.Main.services;

import com.project.Main.models.Client;
import com.project.Main.models.ClientPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private final ClientService clientService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = clientService.getClientByEmail(email);

        if (client == null) {
            throw new UsernameNotFoundException("User with email: " + email + " not found!");
        }

        return new ClientPrincipal(client);
    }
}
