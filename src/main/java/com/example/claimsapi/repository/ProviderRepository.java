// Repository layers bridges together the Entities (models) --> Provider, Claim
// and Database tables --> providers, claims

package com.example.claimsapi.repository;
import com.example.claimsapi.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Provider, Integer> → a generic interface from Spring Data
// Provider = entity type (which table)
// Integer = the primary key type (providerID is an Integer)
public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}

// This is a repository that manages Provider entities who ID type is Integer
// + give all standard CRUD methods for free such as (save(entity) --> INSERT or UPDATE