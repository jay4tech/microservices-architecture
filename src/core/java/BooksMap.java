package core.java;

import java.util.HashMap;
import java.util.Map;

public class BooksMap {

    public static void main(String[] args) {
        Books book1 = new Books(101, "The Psychology of Money", "Morgan Housel", "A JAICO BOOK", 100);
        Books book2 = new Books(102, "The Art Of War", "SUN TZU", "BookBuggs", 200);
        Books book3 = new Books(103, "The Indian way", "S. JaiShankar", "Harper Collins", 300);
        Books book4 = new Books(233, "Nationalism", "Rabindranath Tagore", "Edu Gorilla", 400);
        Map<Integer, Books> map = new HashMap<>();
        map.put(book1.id, book1);
        map.put(book2.id, book2);
        map.put(book3.id, book3);
        map.put(book4.id, book4);
        System.out.println("All the books ");
        map.forEach((k, v) -> {
            System.out.println(v);
        });

        System.out.println("After doubling the quantity");
        map.forEach((k, v) -> {
            v.quantity *= 2;
            map.put(k, v);
            System.out.println(v);
        });

        System.out.println("After merging");
        map.merge(233, map.get(233), (oldBook, newBook) -> {
            newBook.publisher += " USA";
            return newBook;
        });
        System.out.println(map.get(233));
    }
}
