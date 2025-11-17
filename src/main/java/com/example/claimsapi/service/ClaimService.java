/*
The service layer sits between:
- Controller (HTTP layer)
- Repository (database layer)

In here we want to put business logic, for now just:
1. submitClaim(Claim claim)
- Check provider exists
- Check amount > 0
- Save claim

2. getClaims()
- Return all claims

3. getClaimsByProvider(providerId)
- Return claims for a specific provider
 */

package com.example.claimsapi.service;
import com.example.claimsapi.model.Claim;
import com.example.claimsapi.repository.ClaimRepository;
import com.example.claimsapi.repository.ProviderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClaimService {

    // claimRepository --> saves and queries claims
    // providerRepository --> lets us check if provider exists
    private final ClaimRepository claimRepository;
    private final ProviderRepository providerRepository;

    public ClaimService(ClaimRepository claimRepository, ProviderRepository providerRepository) {
        this.claimRepository = claimRepository;
        this.providerRepository = providerRepository;
    }

    // Submit a new claim with some validation
    public Claim submitClaim(Claim claim) {
        // 1) Checking if provider exists
        if (!providerRepository.existsById(claim.getProviderId())){
            throw new IllegalArgumentException("Provider does not exist: " + claim.getProviderId());
        }

        // 2) Check that amount is positive
        if (claim.getAmount() == null || claim.getAmount() <= 0){
            throw new IllegalArgumentException("Claim amount must be positive.");
        }

        // 3) Save the claim to the database
        return claimRepository.save(claim);
    }

    // Get all claims
    public List<Claim> getClaims() {
        return claimRepository.findAll();
    }

    // Get all claims for a specific provider
    public List<Claim> getClaimsByProvider(Integer providerId) {
        return claimRepository.findByProviderId(providerId);
    }
}
