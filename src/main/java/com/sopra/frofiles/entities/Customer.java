package com.sopra.frofiles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "customers")
public class Customer {

    @Id
    private long id;
    @Column(length = 200, nullable = false)
    private String fullName;
}
