package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String firstName, String lastName,
                            String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
