package com.csi.controller;


import com.csi.model.Product;
import com.csi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/getallproduct")
public ResponseEntity<List<Product>> getAllData(){
    return ResponseEntity.ok(productServiceImpl.getAllProduct());
    }

    @PostMapping("/savealldata")

    public ResponseEntity<Product> saveData(@RequestBody Product product){
        return ResponseEntity.ok(productServiceImpl.saveData(product));
    }
}

