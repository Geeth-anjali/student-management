# Student Management System (Full Stack Project)

This is a **full-stack web application** built using **Spring Boot**, **Spring MVC**, **Hibernate (JPA)**, **MySQL**, and **Thymeleaf**.  
It allows users to **add**, **view**, **edit**, and **delete** student records from a database via a user-friendly web interface.

---

## ✨ Features

- Add new student records  
- View all student details in a styled table  
- Edit existing student records  
- Delete student records  
- Responsive UI using **Bootstrap**

---

## 💻 Tech Stack

- **Backend:** Java, Spring Boot, Spring MVC, Spring Data JPA, Hibernate  
- **Frontend:** HTML, CSS, Bootstrap, Thymeleaf  
- **Database:** MySQL  
- **IDE Used:** Spring Tool Suite (STS)  
- **Version Control:** Git & GitHub

---

## 📂 Project Structure
Student-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── StudentManagementSystem/
│   │   │       ├── student.java                            // Entity class representing the Student table
│   │   │       ├── studentController.java           // Controller class for handling web requests (GET, POST)
│   │   │       ├── studentService.java                // Service class containing business logic
│   │   │       ├── StudentRepository.java         // Repository interface to interact with the database
│   │   │       └── StudentManagementSystemApplication.java // Main class to run the Spring Boot application
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── students.html                 // Displays the list of students
│   │       │   └── studentform.html              // Form to add or edit student details
│   │       └── application.properties            // Configuration file (DB connection, Hibernate settings)
│
├── src/test/java/                                // Test classes (currently empty or default)
├── pom.xml                                        // Maven build configuration file

---

---
## 📐 Architecture Diagram (Text-based)
[User (Browser)]
       ⬇
[Thymeleaf HTML Views]
       ⬇
[StudentController.java]
   (Handles HTTP requests)
       ⬇
[StudentService.java]
   (Business logic)
       ⬇
[StudentRepository.java]
   (Database access layer - JPA)
       ⬇
[MySQL Database]
   (Stores student data)
---

## 🛠️ How to Run the Project

1. Clone the repository  
   ```bash
   git clone https://github.com/Geeeth-anjali/student-management.git

2. Open the project in Spring Tool Suite or IntelliJ IDEA


3. Configure your MySQL credentials in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


4. Run the application (StudentManagementSystemApplication.java)


5. Open your browser and go to:
http://localhost:8080/students




---

🎯 Use Cases

Can be submitted as a college mini project

Useful for learning CRUD operations with Spring Boot and MySQL

Can be extended into a larger school/institution portal



---

📘 What I Learned

Spring Boot project setup and structure

Using Thymeleaf templates

CRUD operations with Spring MVC and JPA

Connecting Spring Boot with MySQL

Styling using Bootstrap

How to handle form data and error debugging



---

📌 Author

Anjali 
Student & Full Stack Developer

---

⭐ If you found this project helpful, feel free to give it a star!

---
