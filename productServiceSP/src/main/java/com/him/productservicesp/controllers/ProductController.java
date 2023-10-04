package com.him.productservicesp.controllers;
import com.him.productservicesp.dtos.ProductDTO;
import com.him.productservicesp.models.Product;
import com.him.productservicesp.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping()
    public String getAllProducts(){
        return "Getting All Products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId")  Long productId){
        return "Returning Single Product with Id " +productId ;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDTO productdto){
        return "Adding a new product "+productdto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId")  Long productId, @RequestBody ProductDTO productdto){
        return "Updating product with Id: " +productId+ ", updated to "+ productdto;
    }

    @DeleteMapping ("/{productId}")
    public String deleteProduct(@PathVariable("productId")  Long productId){
        return "Deleting a product with Id" +productId;
    }
}
