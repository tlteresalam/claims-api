// Look in Provider.java for full details on code

package com.example.claimsapi.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "claims")


// Database entities (rows) for Claims
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimId;
    private Integer providerId;
    private String patientName;
    private String diagnosisCode;
    private Double amount;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructors
    public Claim(){}

    public Claim(Integer providerID, String patientName, String diagnosisCode, Double amount){
        this.providerId = providerID;
        this.patientName = patientName;
        this.diagnosisCode = diagnosisCode;
        this.amount = amount;
    }

    // Getters and Setters
    public Integer getClaimID(){
        return claimId;
    }

    public void setClaimID(Integer claimID){
        this.claimId = claimID;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
