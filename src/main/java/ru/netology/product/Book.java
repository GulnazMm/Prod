package ru.netology.product;

import ru.netology.product.Product;

public class Book extends Product {
    private String avtor;

    public Book(int id, String name, int price, String avtor) {
        super(id, name, price);
        this.avtor = avtor;
    }
    @Override
    public boolean matches(String query){
        if (super.matches(query)){
            return true;
        }
        if (avtor.contains(query)){
            return true;
        }

         return false;
        }


}

