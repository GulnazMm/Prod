import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Book book1 = new Book(15,"Книжка",100,"И.И. Иванов");
        Book book2 = new Book(16,"Учебник",150,"И.И. Петров");
        Smartphone smartphone1 = new Smartphone(17,"Samsung",200,"Samsung Group");
        Smartphone smartphone2 = new Smartphone(18,"Samsung10", 300, "Samsung Group");
    @Test

    public void addBook(){
        ProductRepository repository =  new ProductRepository();
        repository.add(book1);
        repository.add(book2);
        Product[] actyal = repository.findAll();
        Product[] expected = {book1,book2};
        Assertions.assertArrayEquals(expected,actyal);

    }
    @Test
    public void addSmartphone() {
        ProductRepository repository = new ProductRepository();
        repository.add(smartphone1);
        repository.add(smartphone2);
        Product[] actyal = repository.findAll();
        Product[] expected = {smartphone1, smartphone2};
        Assertions.assertArrayEquals(expected, actyal);
    }

    @Test
    public  void deleteProduct(){
        ProductRepository repository = new ProductRepository();
        repository.add(book1);
        repository.add(book2);
        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.deleteByQuery(18);
        repository.deleteByQuery(17);

        Product[] actyal = repository.findAll();
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actyal);

    }
    @Test


}
