/*
The service layer sits between:
- Controller (HTTP layer)
- Repository (database layer)

In here we want to put business logic, for now just:
- Add a provider
- Get all providers
 */

package com.example.claimsapi.service;
import com.example.claimsapi.model.Provider;
import com.example.claimsapi.repository.ProviderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

// @Service tells Spring this class is a service bean, manage it for me
@Service
public class ProviderService {

    // This repository talks to the DB
    private final ProviderRepository providerRepository;

    // Constructor, Spring will give us an instance of ProviderRepository
    // Saves a provider --> INSERT or UPDATE
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    // Create a new provider
    public Provider addProvider(Provider provider){
        return providerRepository.save(provider);
    }

    // Get all provider
    // List<Provider> --> SELECT * FROM providers
    public List<Provider> getAllProvider(){
        return providerRepository.findAll();
    }
}
