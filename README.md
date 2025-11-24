# Student Management System (Java + JDBC Project)

A simple **Student Management System** built using **Java**, **MySQL**, and **JDBC**.  
This console-based application performs full **CRUD operations** on student data.

============================================================================

## 🚀 Features

### 👨‍🎓 Student Operations
- ➕ Add Student  
- 👀 View All Students  
- ✏️ Update Student Course  
- ❌ Delete Student  
- Search by ID (optional)

### 💾 Database (MySQL)
Stored permanently in a `students` table.

### 🔒 Secure Database Coding
- Uses **PreparedStatement**
- Prevents SQL injection

===============================================================================

## 🛠 Tech Stack
- Java  
- JDBC  
- MySQL  
- VS Code / IntelliJ / Eclipse  
- MySQL Connector JAR  

================================================================================

## 📁 Project Structure
StudentProject/
│── Student.java
│── StudentDAO.java
│── Main.java

=================================================================================

## 🗄 Database Setup

Run in MySQL:

```sql-
CREATE DATABASE IF NOT EXISTS sms;
USE sms;

CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);```
===================================================================================
```▶️ How to Run
	1.	Clone the repo
	2.	Add MySQL Connector JAR
	3.	Update DB username/password
	4.	Run Main.java```
====================================================================================
    📌 Sample Output
    ===== Student Management System =====
1. Add Student
2. View Students
3. Update Student Course
4. Delete Student
5. Exit

👤 Author

Arman Khan
