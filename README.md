# 📚 Library Management System

A simple CRUD-based Library Management System built with **Java, Spring Boot, Hibernate, and MySQL**.

🚀 Features
-📖 View available books
-➕ Add a book (Admin)
-✏️ Update book information
-❌ Delete a book
-📥 Borrow a book
-📤 Return a book

## 🚀 Tech Stack

![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-6DB33F?style=for-the-badge&logo=spring-boot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36?style=for-the-badge&logo=apache-maven)
![Lombok](https://img.shields.io/badge/Lombok-%231E90FF?style=for-the-badge&logo=lombok)

## 🧪 API Endpoints

| Method | URL                   | Description           |
|--------|------------------------|-----------------------|
| GET    | `/api/books/available` | View available books  |
| POST   | `/api/books`           | Add a book (Admin)    |
| PUT    | `/api/books/{id}`      | Update book details   |
| DELETE | `/api/books/{id}`      | Delete a book         |
| POST   | `/api/borrow`          | Borrow a book         |
| POST   | `/api/return`          | Return a book         |
