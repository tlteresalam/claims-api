package com.example.claimsapi.controller;
import com.example.claimsapi.model.Claim;
import com.example.claimsapi.service.ClaimService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claims")
public class ClaimController {
    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    // POST /claims --> submit a new claim
    // @PostMapping → handles HTTP POST for /claims
    // @RequestBody Claim → Spring converts JSON from the request body into a Claim object

    @PostMapping
    public Claim submitClaim(@RequestBody Claim claim){
        return claimService.submitClaim(claim);
    }

    //GET /claims --> get all claims
    @GetMapping
    public List<Claim> getClaims() {
        return claimService.getClaims();
    }

    // Get claims for a specific provider
    @GetMapping(params = "providerId")
    public List<Claim> getClaimsByProvider(@RequestParam Integer providerId){
        return claimService.getClaimsByProvider(providerId);
    }
}
