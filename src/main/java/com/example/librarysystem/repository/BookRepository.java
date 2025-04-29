package com.example.librarysystem.repository;

import com.example.librarysystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByStatus(String status);

    //Book findAll(Book book); --JPA already provided findAll() so no need to write

    Optional<Book> findById(int id);


}