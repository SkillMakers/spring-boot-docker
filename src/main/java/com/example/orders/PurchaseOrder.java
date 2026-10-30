package com.example.orders;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orders")
public class PurchaseOrder {
    @Id @GeneratedValue Long id;
    String customer;
    BigDecimal total;
    public Long getId() { return id; }
    public String getCustomer() { return customer; }
    public BigDecimal getTotal() { return total; }
}
