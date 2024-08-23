package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
    public static List<Author> authors = Arrays.asList(new Author(1, "Lord Krishna"),
            new Author(2, "Valmiki"),
            new Author(3, "Veda Vyas"),
            new Author(4, "Pothana"));

    public static Optional<Author> getAuthorById(Integer authorId) {
        return authors.stream().filter(b -> b.id.equals(authorId)).findFirst();
    }
}
