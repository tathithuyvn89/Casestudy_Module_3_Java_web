package codegym.dao;

import codegym.model.Product;

import java.util.List;

public interface IProductDao {
    List<Product> findAll();
    void saveProduct (Product product);
    Product selectById(int id);
    boolean removeProduct(int id);
    boolean updateProduct(Product product);
    Product searchByName(String productName);
}