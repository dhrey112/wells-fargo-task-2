package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private FinancialAdvisor advisor;
    private String name;
    private String address;
    private String phone;

    protected Client() {
        // Default constructor (secured)
    }

    public Client(FinancialAdvisor advisor, String name, String address, String phone) {
        this.advisor = advisor;
        this.name = name;
        this.address = address;
        this.phone = phone;
}

// Getters and setters

public Long getClientID() {
    return clientID;
}

public FinancialAdvisor getAdvisor() {
    return advisor;
}

public void setAdvisor(FinancialAdvisor advisor) {
    this.advisor = advisor;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}
}
