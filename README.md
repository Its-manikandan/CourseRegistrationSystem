
# Course Registration System

The Course Registration System is a web application built using Java, Spring Boot, and MySQL to simplify and automate the student course enrollment process. It allows users to register, view available courses, and manage enrollments efficiently through a secure and scalable platform.


## Features

•COURSE REGISTRATION MODULE – To register new students and selected courses into the system.

•AVAILABLE COURSES PAGE – To display all the active courses fetched from the MySQL database.

•ENROLLED STUDENTS LIST – To view all registered students and their enrolled courses.

•DATA VALIDATION – To verify student and course details before submission.

•CRUD OPERATIONS – To Create, Read, Update, and Delete course or student records.

•SPRING BOOT API – To handle backend operations efficiently through RESTful APIs.

•MYSQL DATABASE INTEGRATION – To store and manage course and enrollment data.

•SCALABLE ARCHITECTURE – To maintain modularity and easy future upgrades.


## Installation

Install my-project with npm

```bash
  npm install my-project
  cd my-project
```
INSTALLATION:

Download or Clone the Repository to your local machine.

1. Prerequisites

Install Java JDK 11+, Maven, MySQL, VS Code (with Live Server), and Postman.
Make sure MySQL is running.

2. Setup Database
CREATE DATABASE course_registration;

3. Configure Backend

Open application.properties and update:

spring.datasource.url=jdbc:mysql://localhost:3306/course_registration
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
server.port=8080

4. Run Backend
mvn clean install
mvn spring-boot:run
→ App runs on http://localhost:8080

5. Test APIs (Postman)

Example endpoints:

GET  localhost:8080/courses → View available courses

POST localhost:8080/register → Register a course

GET  localhost:8080/enrolled → View enrolled students

6. Run Frontend

Open frontend folder in VS Code.

paste the code in the separate pages.

Right-click index.html → Open with Live Server

It runs on http://127.0.0.1:5500

7. View Result

Open browser → Live Server URL → Interact with the system.
Use Postman or browser to test full workflow.
## Screenshots


!("https://github.com/user-attachments/assets/8c45a340-054c-4f79-863a-18246000d5e5")

!("https://github.com/user-attachments/assets/8ee8651b-3ab2-4e4b-a6b2-24aade539f57")

("https://github.com/user-attachments/assets/00421704-4444-4426-a4cc-98b2fdd4d005")

!("https://github.com/user-attachments/assets/ed8842ea-96b4-4fb9-a7e1-d8b7d41793d4")

!("https://github.com/user-attachments/assets/971c09b6-9bf3-43f7-aed4-679422c79bd7")


## Demo

https://github.com/user-attachments/assets/ed657302-b9cb-4e7b-8b29-d6ab11f914a9

