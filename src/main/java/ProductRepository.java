public class ProductRepository {
    private Product[] products = new Product[0];

    public void add(Product product) {
        Product[] x = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            x[i] = products[i];
        }
        x[x.length - 1] = product;
        products = x;
    }

    public Product[] findAll() {
        return products;
    }


    public Product[] deleteByQuery(int id) {
        int length = products.length - 1;
        Product[] x = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id)
                x[index] = product;
            index++;
        }
        products = x;

        return products;
    }

        }






