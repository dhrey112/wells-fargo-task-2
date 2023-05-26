package com.wellsfargo.counselor.entity;

import javax.persistence.*;


@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioID;
    @ManyToOne
    private Client client;
    private String name;

    public Portfolio() {
    }

    public Portfolio(Client client, String name) {
        this.client = client;
        this.name = name;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}