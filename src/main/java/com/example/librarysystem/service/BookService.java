package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;
import com.example.librarysystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

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
    public Book updateBook(int id, Book updatedBook){
        //Find the book by id
        Optional<Book> existingBookOpt = bookRepository.findById(id);

        //update the book
        if (existingBookOpt.isPresent()){
            Book existingBook = existingBookOpt.get();

            // Update book details
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setIsbn(updatedBook.getIsbn());
            existingBook.setStatus(updatedBook.getStatus());

            // Save and return the updated book
            return bookRepository.save(existingBook);
        }
        else{
            throw new RuntimeException("Book not found with ID " + id);
        }
    }
}
