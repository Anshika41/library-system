package com.example.librarysystem.controller;

import com.example.librarysystem.entity.Borrow;
import com.example.librarysystem.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @PostMapping
    public Borrow borrowBook(@RequestParam int bookId, @RequestParam int userId){
        return borrowService.borrowBook(bookId, userId);
    }

    @PostMapping("/return")
    public Borrow returnBook(@RequestParam int borrowId){
        return borrowService.returnBook(borrowId);

    }
}
