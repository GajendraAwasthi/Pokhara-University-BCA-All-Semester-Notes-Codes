1\. Introduction \& Architecture



* Define database and DBMS. What are the advantages of using DBMS over a file management system? (Includes defining data/information). duplicate : 2 times 2025 Spring (Old) / 2024 Spring
* Explain the three levels of data abstraction in a DBMS with suitable examples. How does data independence relate to these levels? duplicate : 3 times 2025 Spring (New) / 2025 Spring (Old) / 2025 Pre-University
* Define database schema and Instances. duplicate : 2 times 2025 Spring (New) / 2025 Pre-University
* Explain the two-tier and three-tier database architecture with diagrams. duplicate : 2 times 2025 Spring (New) / 2025 Pre-University
* What is a data model? Explain the components of the ER model with an example. (2024 Spring)



2\. ER Diagrams \& Relationships



* Draw an ER diagram for a hospital system (Patient, Doctor, Appointment, Room) with appropriate relationships and cardinalities. (2025 Spring New)
* Draw an ER diagram for an "online food ordering system" using extended features like generalization and specialization. (2025 Spring Old)
* Design an ER diagram for a Library Management System (Members, Books, Borrow/Return tracking). (2025 Pre-University)
* Write a short note on: Generalization VS Aggregation. (2025 Spring New)



3\. Relational Algebra, SQL \& Views



* Write relational algebra expressions for given schemas (Student/Course, Employee/Project, etc.). duplicate : 3 times 2025 Spring (New) / 2024 Spring / 2025 Pre-University
* Write SQL queries/statements for given database schemas. duplicate : 3 times 2025 Spring (New) / 2025 Spring (Old) / 2025 Pre-University
* What is a view? Explain the applications/importance of a view in DBMS with its syntax. duplicate : 3 times 2025 Spring (New) / 2025 Spring (Old) / 2024 Spring
* What is a JOIN? Differentiate between inner join and outer join (explain types with syntax/examples). duplicate : 2 times 2025 Spring (New) / 2024 Spring
* What are Set Operations in DBMS? Explain UNION and INTERSECTION. (2025 Spring Old)
* Write a short note on QBE (Query By Example). (2024 Spring)



4\. Constraints \& Triggers



* What are integrity constraints, and why do we need them? Explain in detail (domain, entity, and referential integrity) with examples. duplicate : 4 times 2025 Spring (New) / 2025 Spring (Old) / 2024 Spring / 2025 Pre-University
* Explain trigger and assertion with examples. (2025 Pre-University)





5\. Normalization \& Dependencies



* Why do we need normalization? Differentiate 2NF and 3NF with appropriate examples. duplicate : 2 times 2024 Spring / 2025 Pre-University
* Convert a given 2NF relation into 3NF. Check if any insertion, updation, or deletion anomaly occurs. (2025 Spring Old)
* What is denormalization? When and why is it used in database design? (2025 Spring New)
* What is functional dependency? Explain the types of functional dependency. (2025 Pre-University)



6\. Query Processing



* What is query processing/optimization? Explain the need and steps involved in query processing. duplicate : 4 times 2025 Spring (New) / 2025 Spring (Old) / 2024 Spring / 2025 Pre-University



7\. Transaction \& Concurrency Control



* What is concurrency control? Explain how two-phase locking (2PL) and timestamp-based protocols are used to control concurrency. duplicate : 2 times 2025 Spring (Old) / 2025 Pre-University
* Define Serializability. Explain conflict serializability and view serializability with examples (or lock-based protocols). duplicate : 2 times 2025 Spring (New) / 2025 Pre-University
* What are transaction schedules? Explain serial schedule and non-serial schedule. (2024 Spring)
* Write short notes on: ACID properties of transaction. duplicate : 2 times 2024 Spring / 2025 Pre-University



8\. Backup \& Recovery System



* What is checkpoint and transaction rollback? Explain log-based recovery (and backup systems) with a suitable example/causes of failure. duplicate : 4 times 2025 Spring (New) / 2025 Spring (Old) / 2024 Spring / 2025 Pre-University
* Write short notes on: Failure Classifications. (2025 Spring New)



9\. Database Security



* Differentiate between authentication and authorization. Discuss the importance of security and how encryption/decryption occurs. duplicate : 3 times 2025 Spring (Old) / 2024 Spring / 2025 Pre-University



10\. Advanced DB Concepts \& Storage



* What are the advantages of ORM databases? Compare NoSQL databases with traditional relational databases / object-oriented gap. duplicate : 3 times 2025 Spring (New) / 2025 Spring (Old) / 2025 Pre-University
* Define indexing. Explain index sequential file organization with advantages and disadvantages. duplicate : 2 times 2025 Spring (Old) / 2024 Spring
* Explain the distributed database with its advantages and disadvantages over a centralized database. duplicate : 2 times 2024 Spring / 2025 Pre-University
* Write short notes on: Hash Index. duplicate : 2 times 2025 Spring (Old) / 2024 Spring
* Write short notes on: Stored Procedure. (2025 Pre-University)



Pokhara University - 2025 Spring (New)

Relational Algebra Queries (Q2b):

Consider the database: Student (SID, Name, Age, Dept), Course (CID, CName, Credits), Enroll (SID, CID, Grade)



i. Find names of students who are enrolled in the course "Database Systems".



ii. List all students (SID, Name) who are not enrolled in any course.



iii. Retrieve courses (CID, CName) with more than 3 credits.



iv. Find the total number of students in each department.



SQL Queries (Q3b):

Consider the schema: Employees (EmpID, Name, DeptID, Salary, JoinDate), Departments (DeptID, DeptName, Location), Projects (ProjectID, ProjectName, Budget, DeptID)



i. Create the table Employees with appropriate constraints.



ii. Find the Name, Salary of employee of 'IT' department.



iii. Increase the salary of employees in the "IT" department by 10%.



iv. Delete all projects with a budget less than 40,000.



2\. Pokhara University - 2025 Spring (Old)

SQL Statements (Q2b):

Consider the schema: Students (student\_id, name, dob, gender), Courses (course\_id, course\_name, credits), Instructors (instructor\_id, name, department), Enrollments (enrollment\_id, student\_id, course\_id, instructor\_id, enrolled\_date)



i. List all courses a student named 'Sujan' is enrolled in.



ii. Find out the number of students enrolled on each course.



iii. Find the average number of credits taken by students.



iv. Show the course names starting with 'J'.



Normalization Table (Q3b):



Convert the following 2NF relation into 3NF (Consider name as PK). Also, check if any insertion, updation, or deletion anomaly occurs or not? if yes, then give an example.

(Table data provided in image: Name, Address, Phone, Salary, Post)



Specific Cryptography Question (Q5a):



How encryption and decryption occur in private key and public key cryptography?



3\. Pokhara University - 2024 Spring

Relational Algebra (Q2a):

Consider the relations: employee (eid, name, position, age), project (pid, name, duration, budget), works (eid, pid, location, salary)



i. Find all the 'Managers' who are above 30 years.



ii. Show project budget running for less than 45 days.



iii. Update the Project name to 'Business Website' where pid is P098.



iv. Get project locations where all the 'Software Developers' work.



4\. National Academy of Science and Tech - Pre-University 2025

Relational Algebraic Expressions (Q2a):

Consider the database: Employee (Empname, street, city), Works (Empname, post, cmpname, Salary), Company (cmpname, location)



i. An employee named Robert is promoted from Assistant manager to manager.



ii. Update the relation Company so that all companies located in Dhangadhi is shifted to Kathmandu.



iii. Remove all the records of employee who lives in Butwal.



iv. Display name, street, city of employee who works for 'Iris Company'.



SQL Statements (Q2b):

Consider the database: Customer (CustID, Name, Address, Phone), Orders (OrderID, CustID, OrderDate, TotalAmount), Product (ProdID, Name, Price), OrderDetails (OrderID, ProdID, Quantity)



i) Write a command to create the Orders table with appropriate constraints.



ii) Display the details of products that have never been ordered.



iii) Modify the database to change the price of a product named "IPhone" to 150000.



iv) Retrieve the names of customers who have placed orders worth more than 5000.

