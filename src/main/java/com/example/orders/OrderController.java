package com.example.orders;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
class OrderController {
    private final OrderRepository repository;
    OrderController(OrderRepository repository) { this.repository = repository; }
    @GetMapping({"/orders", "/commandes"}) List<PurchaseOrder> all() { return repository.findAll(); }
}
