# BIT1123 Object-Oriented Programming Assignment 1

## Student information

- **Name:** Ghaith Al-Dain Gamil Qasem
- **Student ID:** 202501010660
- **Class code:** 202605F0782
- **Programme:** BCSSE
- **Course:** BIT1123 Object-Oriented Programming (Java)

## Course description

BIT1123 introduces object-oriented programming through Java. The tutorials cover Java syntax, decision making, classes and objects, encapsulation, inheritance, polymorphism, abstraction, collections, file handling, exception handling, and graphical user interfaces.

## Repository structure

```text
Ghaith-Al-Dain-Gamil-Qasem_-202501010660_-Java/
|-- README.md
|-- myreport.pdf
|-- week_1/
|-- week_2/
|-- week_3-4/
|-- week_5/
|-- week_6/
|-- week_7/
|-- week_8-9/
`-- week_10/
```

## Tutorial summary

### Week 1: Java fundamentals

The first tutorial introduces the structure of a Java program through `HelloWorld.java`. `StudentGrade.java` uses variables, conditional statements, and console output to calculate and display a grade.

### Week 2: Classes and objects

This tutorial defines a `Student` class with attributes, a constructor, and methods. The `Main` class creates an object and calls its methods to display information, study, and take an examination.

### Weeks 3-4: Inheritance and polymorphism

The project uses `Person` as a parent class and extends it through `Student` and `Lecturer`. Method overriding demonstrates how objects can respond differently to the same `introduce()` method.

### Week 5: Encapsulation

The `Student` class keeps its fields private and provides getters and setters to control access. The main program assigns and displays the student's ID, name, CGPA, and programme.

### Week 6: Inheritance with constructors

The `Lecturer` class extends `Employee` and calls the parent constructor with `super`. The example separates general employee information from lecturer-specific details such as subject and department.

### Week 7: Abstraction

An abstract `Appliances` class defines shared behaviour and an abstract `operate()` method. `WashingMachine` and `Refrigerator` provide their own implementations of that method.

### Weeks 8-9: Collections and file handling

The task manager stores user input in an `ArrayList`, writes the tasks to `task.txt`, and reads them back using buffered file streams. The program also handles possible input/output errors.

### Week 10: Java Swing GUI

The final tutorial creates a quiz application with Java Swing. It uses a frame, labels, buttons, event listeners, and a separate `Questions` class to check the selected answer.

## Technologies used

- Java Development Kit (JDK)
- Java Swing
- Git
- GitHub
- A Java IDE or text editor

## How to run the projects

1. Install a Java Development Kit.
2. Clone or download this repository.
3. Open a terminal in the required week folder.
4. Compile all Java files in that folder. For example:

   ```bash
   javac *.java
   ```

5. Run the class that contains the `main` method. For example:

   ```bash
   java Main
   ```

For weeks 3-4, 5, and 6, run `java main` because the class is named with a lowercase `m`.

## Reflection summary

These tutorials helped me move from writing basic Java statements to designing programs with multiple related classes. The practical exercises improved my understanding of encapsulation, inheritance, polymorphism, abstraction, collections, file handling, and event-driven programming. More detail about my progress, difficulties, and future learning plans is provided in the self-reflective report.

## Repository link

https://github.com/8voux/Ghaith-Al-Dain-Gamil-Qasem_-202501010660_-Java
