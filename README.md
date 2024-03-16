# COMP 3005 Assignment 3

Full Name: Boris Zugic

Student ID: 101223924

DEMO link: https://youtu.be/4oXAuEr2HeE

## Usage
1. Run SpringDemoApplication.java
2. Test methods using Postman or command line

Postman:
Choose one of CRUD methods and send it to appropriate path on http://localhost:8080/students as specified in StudentController.java above each method

CMD (Bash):
- POST: curl -X POST http://localhost:8080/students -H "Content-Type: application/json" -d '{"firstName":"Boris", "lastName":"Zugic", "email":"boris.zugic@example.com", "enrollmentDate":"2023-01-01"}'
- GET: curl http://localhost:8080/students
- PUT: curl -X PUT http://localhost:8080/students/2/email -H "Content-Type: application/json" -d "{\"email\":\"new.email@example.com\"}"
- DELETE: curl -X DELETE http://localhost:8080/students/1
