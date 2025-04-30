package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;
import com.example.librarysystem.entity.Borrow;
import com.example.librarysystem.entity.User;
import com.example.librarysystem.repository.BookRepository;
import com.example.librarysystem.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BorrowService {

    @Autowired
    private BorrowRepository borrowRepository;

    @Autowired
    private BookRepository bookRepository;

    //borrow book
    public Borrow borrowBook(int bookId, int userId){
        //Find the Book:
        Book book = bookRepository.findById(bookId)
                .orElseThrow(()
                        -> new RuntimeException("Book not found"));
        //Check Availability:
        if(!book.getStatus().equals("Available")){
            throw new RuntimeException("Book is not available");

        }
        //Update Book Status:
        book.setStatus("Borrowed");
        bookRepository.save(book);

        //Create Borrow Record:
        Borrow borrow = new Borrow();
        borrow.setBook(book);
        borrow.setUser(new User(userId));
        borrow.setBorrowDate(LocalDate.now());

        //Save Borrow Record:
        return borrowRepository.save(borrow);

    }

    public Borrow returnBook(int borrowId){
        //Find the Book:
        Borrow borrow = borrowRepository.findById(borrowId)
                .orElseThrow(() -> new RuntimeException("Borrow record not found"));

        Book book = borrow.getBook();
        book.setStatus("Available");
        bookRepository.save(book);

        borrow.setReturnDate(LocalDate.now());
        return borrowRepository.save(borrow);


    }
}
