# 🧪 Laboratory Exercise 7 – Order Management System (Java)

This repository contains a **Java console application** developed for **Laboratory Exercise 7**.  
The activity focuses on applying **abstraction and encapsulation principles** in Java through the implementation of a simple **Order Management System**.

---

## 🎯 Objectives

- Apply abstraction using abstract classes and interfaces
- Implement encapsulation using access modifiers and controlled data access
- Use enums to represent fixed system states safely
- Organize classes logically using packages
- Manage and traverse collections using ArrayList and Iterator

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList and Iterator
- Console-based application

---

## 📂 Project Structure

com.store.order  
com.store.payment  
com.store.main  

### Program Description:
- Uses **packages** to separate system responsibilities
- Implements **abstract classes** and **interfaces**
- Applies **encapsulation** through private fields and getters/setters
- Uses **enum** to represent order status
- Manages multiple orders using collections

---

## ⚙️ System Components

### 📦 Order Package (`com.store.order`)
- `Order` (abstract class)
- `OrderStatus` (enum)

### 💳 Payment Package (`com.store.payment`)
- `Payable` (interface)

### 🏪 Main Package (`com.store.main`)
- `OnlineOrder` (concrete class)
- `OrderApp` (main application)

---

## ▶️ How to Run the Program

1. Ensure **Java JDK** is installed.
2. Open a terminal or command prompt.
3. Compile all Java files:
   ```bash
   javac com/store/**/*.java
Run the main program:

bash
Copy code
java com.store.main.OrderApp
🧠 Concepts Applied
Abstraction (abstract classes, interfaces)

Encapsulation (private fields, getters/setters)

Enums

Packages

ArrayList

Iterator

Polymorphism

Data validation

📌 Notes
This activity is part of a Java programming laboratory requirement

Emphasizes clean architecture and proper OOP design

Demonstrates safe data handling and collection traversal

Avoids direct access to internal object data

👨‍🎓 Author
Airon A. Ursua
BS Computer Science

📄 License
This project is for educational purposes only.
