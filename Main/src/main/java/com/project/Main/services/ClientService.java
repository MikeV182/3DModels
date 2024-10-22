package com.project.Main.services;

import com.project.Main.models.Client;
import com.project.Main.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public void createClient(Client client) {
        log.info("Adding new user");
        client.setPassword(encoder.encode(client.getPassword()));
        clientRepository.save(client);
    }

    public Client getClientByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    public Client getClientById(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }

    public Client getClientByEmailAndPassword(Client client) {
        Client existingClient = clientRepository.findByEmail(client.getEmail());
        if (existingClient == null)
            return null;

        if (!Objects.equals(existingClient.getPassword(), client.getPassword()))
            return null;

        return existingClient;
    }

    public void updateClient(Client newClientData) {
        Client oldClient = getClientById(newClientData.getId());
        if (oldClient != null) {
            log.info("Updating existing Client {}", oldClient);
        }
        else {
            oldClient = new Client();
            log.info("Creating new Client {}", newClientData);
        }
        oldClient.setEmail(newClientData.getEmail());
        oldClient.setName(newClientData.getName());
        oldClient.setSurname(newClientData.getSurname());
        oldClient.setPassword(newClientData.getPassword());
        createClient(oldClient);
    }

    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

}
