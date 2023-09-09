package com.example.crud.product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author csc340
 */
@Service
class ProductService {

    Map<Integer, Product> products = new HashMap<>();

    /**
     * Get entire list of products.
     *
     * @return the product list.
     */
    public Collection<Product> getAllProducts() {
        if (products.isEmpty()) {
            products.put(1, new Product(1, "sample", 1.25));
        }
        return products.values();
    }

    /**
     * Get a specific product using id.
     *
     * @param productId
     * @return the product.
     */
    public Product getProductById(int productId) {
        return products.get(productId);
    }

    /**
     * Add a new product to the list.
     *
     * @param product
     */
    public void createProduct(Product product) {
        products.put(product.getProductId(), product);

    }

    /**
     * Update an existing product.
     *
     * @param product
     */
    public void updateProduct(Product product) {
        Product existing = products.get(product.getProductId());
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        products.put(product.getProductId(), existing);

    }

    /**
     * Delete a specific product using id.
     *
     * @param productId
     */
    public void deleteProduct(Integer productId) {
        products.remove(productId);
    }
}
