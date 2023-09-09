package com.example.crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author csc340
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public Object getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/id={productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product) {

        if (product == null) {
            product = new Product(1, "sample", 1.25);
        }
        productService.createProduct(product);

    }

    @PutMapping("/id={productId}")
    public void upateProduct(@PathVariable int productId, @RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/id={productId}")
    public void deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }
}
