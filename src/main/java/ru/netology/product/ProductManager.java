package ru.netology.product;

import ru.netology.product.Product;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] x = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    x[i]= result[i];
                }
                x[x.length - 1] = product;
                result = x;
            }
        }
        return result;
    }
    public boolean matches(Product product, String search) {

            return product.getName().contains(search);

    }
}
