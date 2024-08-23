package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(new Book(1,"Bhagavathgita", 1800, 1),
            new Book(2, "Ramayanam", 1800, 2),
            new Book(3, "MahaBharatam", 2500, 3),
            new Book(4, "Vedas", 10000, 4));

    public static Optional<Book> getBookById(Integer bookId) {
        return books.stream().filter(b -> b.id.equals(bookId)).findFirst();
    }
}
