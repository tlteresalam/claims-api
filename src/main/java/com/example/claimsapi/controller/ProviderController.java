/*
Controller:
1. Receives HTTP request
2. Calls the service layer to do the work
3. Returns a response (usually JSON)
 */

package com.example.claimsapi.controller;
import com.example.claimsapi.model.Provider;
import com.example.claimsapi.service.ProviderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController --> this class handles REST (HTTP) requests and returns JSON
@RestController

// @RequestMapping --> this sets the base path for all endpoints inside the controller
// POST /providers
// GET /providers
@RequestMapping("/providers")
public class ProviderController {
    private final ProviderService providerService;

    // Constructor injection
    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    // POST /providers --> create a provider
    @PostMapping
    public Provider addProvider(@RequestBody Provider provider) {
        return providerService.addProvider(provider);
    }

    // GET /providers
    @GetMapping
    public List<Provider> getProviders() {
        return providerService.getAllProvider();
    }
}
