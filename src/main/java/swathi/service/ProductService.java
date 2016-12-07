package swathi.service;

import swathi.model.Product;

import java.util.List;

/**
 * Created by Le on 1/24/2016.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
