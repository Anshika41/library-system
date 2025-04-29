# 📚 Library Management System
A simple CRUD-based Library Management System built with Java, Spring Boot, Hibernate, and MySQL.

🚀 **Features**
📖 View available books
➕ Add a book (Admin)
✏️ Update book information
❌ Delete a book
📥 Borrow a book
📤 Return a book

📦 **Tech Stack:** Java 17, Spring Boot, Spring Data JPA (Hibernate), MySQL, Postman (for API testing)

🧪 **API Endpoints**
| Method | URL                   | Description          |
|--------|-----------------------|----------------------|
| GET    | `/api/books/available` | View available books |
| POST   | `/api/books`          | Add a book (Admin)   |
| PUT    | `/api/books/{id}`     | Update book details  |
| DELETE | `/api/books/{id}`     | Delete a book        |
| POST   | `/api/borrow`         | Borrow a book        |
| POST   | `/api/return`         | Return a book        |

