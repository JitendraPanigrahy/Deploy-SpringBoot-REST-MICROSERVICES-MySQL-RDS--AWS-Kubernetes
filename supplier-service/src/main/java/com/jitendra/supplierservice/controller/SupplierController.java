package com.jitendra.supplierservice.controller;

import com.jitendra.supplierservice.model.Supplier;
import com.jitendra.supplierservice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/all")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
}