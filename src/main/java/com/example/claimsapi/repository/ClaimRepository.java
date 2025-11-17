package com.example.claimsapi.repository;
import com.example.claimsapi.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClaimRepository extends JpaRepository<Claim, Integer>{
    // Custom method: find all claims for a given provider
    List<Claim> findByProviderId(Integer providerId);
}

// This manages Claim entities with primary key Integer
// In addition to CRUD, this also creates a method that returns all claims where
// providerID matches the one I pass in

/*
FOR EXAMPLE
claimRepository.findByProviderId(3); == SELECT * FROM claims WHERE provider_id = 3;
 */