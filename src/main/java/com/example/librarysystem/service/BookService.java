package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;
import com.example.librarysystem.entity.Borrow;
import com.example.librarysystem.entity.User;
import com.example.librarysystem.repository.BookRepository;
import com.example.librarysystem.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowRepository borrowRepository;

    //Create Book
    public Book addBook(Book book){
        book.setStatus("Available");
        return bookRepository.save(book);
    }

    //Read Books
    public List<Book> getAllBook() {
        return bookRepository.findAll();

    }

    public List<Book> getAllAvailableBook(){
        return bookRepository.findByStatus("Available");
    }

    //Update a book
    public Book updateBook(int id, Book updatedBook) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setIsbn(updatedBook.getIsbn());
        return bookRepository.save(book);
    }

    //Delete book
    public void deleteBook(int id){
        bookRepository.deleteById(id);
    }


}
