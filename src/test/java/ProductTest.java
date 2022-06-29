import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.*;


public class ProductTest {

    Book book1 = new Book(15,"Книжка",100,"И.И. Клюшкин");
        Book book2 = new Book(16,"Учебник",150,"И.И. Плюшкин");
        Smartphone smartphone1 = new Smartphone(17,"Samsung",200,"Samsung Group");
        Smartphone smartphone2 = new Smartphone(18,"Samsung10", 300, "Samsung Group");
    @Test

    public void addBook(){
        ProductRepository repository =  new ProductRepository();
        repository.add(book1);
        repository.add(book2);
        Product[] actual = repository.findAll();
        Product[] expected = {book1,book2};
        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void addSmartphone() {
        ProductRepository repository = new ProductRepository();
        repository.add(smartphone1);
        repository.add(smartphone2);
        Product[] actual = repository.findAll();
        Product[] expected = {smartphone1, smartphone2};
        Assertions.assertArrayEquals(expected, actual);
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

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actual);

    }
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    @Test
    public void managerAdd(){


            manager.add(book1);
            manager.add(book2);
            manager.add(smartphone1);
            manager.add(smartphone2);

            Product[] actual = repository.findAll();
            Product[] expected = {book1, book2, smartphone1,smartphone2};
            Assertions.assertArrayEquals(expected,actual);


        }

        @Test
        public void searchBy(){
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.searchBy("Sam");
            Product[]actual = manager.searchBy("Sam");
            Product[]expected = {smartphone1,smartphone2};
            Assertions.assertArrayEquals (expected,actual);

        }

    @Test
    public void searchByWord(){
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        manager.searchBy("hj");


        Product[] actual = manager.searchBy("hj");
        Product[]expected = {};
        Assertions.assertArrayEquals(expected,actual);

    }


        @Test
    public void matches(){
            manager.add(book1);
            manager.add(book2);
            manager.add(smartphone1);
            manager.add(smartphone2);

            manager.matches(book1,"кин");
            Product[] actual = repository.findAll();
            boolean expected = true;


        }



    }




