## OOP Book System

# Project Overview
This Java project is designed to demonstrate the core principles of Object-Oriented Programming (OOP): Abstraction, Encapsulation, and Inheritance. The project simulates a simple book management system that includes an abstract Book class and two concrete subclasses: FictionBook and NonFictionBook.

# Key Concepts

1. Abstraction:
The Book class is defined as an abstract class that specifies common attributes and behaviors for all book types but does not provide full implementations.

2. Encapsulation:
The project encapsulates the internal state of the Book class by making its fields private and providing public getter and setter methods for controlled access.

3. Inheritance:
FictionBook and NonFictionBook extend the Book class, inheriting its properties and methods while providing specific implementations for their unique behaviors.

# The project consists of the following classes:

<b>Book:<b> An abstract class that serves as a template for all book types.
<b>FictionBook:<b> A subclass of Book representing fiction books.
<b>NonFictionBook:<b> A subclass of Book representing non-fiction books.
<b>Main:<b> The entry point of the application that demonstrates the functionality of the book system.