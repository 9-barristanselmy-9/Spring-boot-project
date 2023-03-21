package com.example.eshope.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data@AllArgsConstructor@NoArgsConstructor
public class Payment implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idPayment;
    public float amount;
    public LocalDateTime paymentDate;
    
}