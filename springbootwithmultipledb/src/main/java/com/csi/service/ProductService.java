package com.csi.service;

import com.csi.model.Product;
import com.csi.repo.product.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepoImpl;


    public Product saveData(Product product){
        return productRepoImpl.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepoImpl.findAll();
    }
}
