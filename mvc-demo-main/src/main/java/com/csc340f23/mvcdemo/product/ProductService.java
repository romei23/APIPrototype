package com.csc340f23.mvcdemo.product;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author csc340-f23
 */
@Service
public class ProductService {

    NavigableMap<Integer, Product> products = new TreeMap<>(Map.of(1,
            new Product(1,
                    "sample", 1.25)));

    /**
     * Get entire list of products.
     *
     * @return the product list.
     */
    public Collection getAllProducts() {
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
     * Delete a specific product using id.
     *
     * @param productId
     */
    public void deleteProduct(Integer productId) {
        products.remove(productId);
    }

    public Product generateRandomProduct() {
        Entry<Integer, Product> lastEntry = products.lastEntry();
        int index = lastEntry.getKey() + 1;
        return new Product(index, "Random Product " + index,
                1.25*index);
    }
}
