package com.telusko.SpringEcom.service;

import com.telusko.SpringEcom.model.Product;
//import com.telusko.SpringEcom.repo.Productrepo;
//import com.telusko.SpringEcom.repo.Productrepo;
import com.telusko.SpringEcom.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private Productrepo productrepo;

    public List<Product> getAllProducts() {
        return productrepo.findAll();
    }
}
