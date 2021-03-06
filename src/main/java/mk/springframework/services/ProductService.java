package mk.springframework.services;

import mk.springframework.commands.ProductForm;
import mk.springframework.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
