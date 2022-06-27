public class Main {
    public static void main(String[] args) {
        ProductRepository repository= new ProductRepository();
        ProductManager manager= new ProductManager(repository);

        manager.add(new Book(15,"Книжка",100,"И.И. Иванов"));
        manager.add(new Book(16,"Учебник",150,"И.И. Петров"));
        manager.add(new Smartphone(17,"Samsung",200, "Samsung Group" ));
        manager.add(new Smartphone(18,"Samsung10", 300, "Samsung Group"));

        Product[] result = manager.searchBy("15");





    }
}
