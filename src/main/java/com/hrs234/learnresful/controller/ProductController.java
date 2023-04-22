package com.hrs234.learnresful.controller;

import com.hrs234.learnresful.model.GenericResponse;
import com.hrs234.learnresful.model.Product;
import com.hrs234.learnresful.model.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to RESTful API";
    }

    @PostMapping("/product")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody final Product product) {
        System.out.println(product);
        ProductResponse res = new ProductResponse(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(res);
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        List<Product> res = new ArrayList<>();

        res.add(new Product(UUID.randomUUID().toString(),"baba", new BigDecimal(5000)));
        res.add(new Product(UUID.randomUUID().toString(),"bebe", new BigDecimal(3000)));
        res.add(new Product(UUID.randomUUID().toString(),"bobo", new BigDecimal(10000)));

        return res;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable final String id) {
        System.out.println(id);
        return new Product(id, "this your product", new BigDecimal(30000));
    }

    @PatchMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        System.out.println(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable final String id) {
        System.out.println(id);
    }
}
