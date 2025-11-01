
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

<img width="1491" height="844" alt="Screenshot 2025-10-31 143011" src="https://github.com/user-attachments/assets/f6a6ec1d-5240-4daa-97b5-9aa6888659ff" />

<img width="1663" height="866" alt="Screenshot 2025-10-31 143046" src="https://github.com/user-attachments/assets/361b2dec-7721-41bb-8613-a9063e3b21c4" />

<img width="1132" height="643" alt="Screenshot 2025-10-31 143100" src="https://github.com/user-attachments/assets/35ede4db-95f0-4297-b4b1-432da0980e32" />

<img width="1376" height="788" alt="Screenshot 2025-10-31 143113" src="https://github.com/user-attachments/assets/3804219b-32a4-493f-9a97-76ec05b2ee3e" />

<img width="1362" height="711" alt="Screenshot 2025-10-31 143130" src="https://github.com/user-attachments/assets/6d7b3d0d-a2b2-4b0e-a655-0fd1484bc36d" />




## Demo

https://github.com/user-attachments/assets/ed657302-b9cb-4e7b-8b29-d6ab11f914a9

