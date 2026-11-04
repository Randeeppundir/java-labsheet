# Lab Sheet-10 — MCA203P
## Object Oriented Programming Using Java

This package contains source code solutions for all 10 practical questions.

### Requirements
- JDK 8 or newer (JDK 11/17/21 recommended)
- No external libraries required

### Compile all programs
Open a terminal in the extracted project folder:

```bash
cd src
javac *.java
```

### Run a program
```bash
java Q01_StudentArrayList
java Q04_ProductTreeSet
java Q10_DepartmentTeacherCollections
```

Run each other practical using its class name (without `.java`).

### Question-wise mapping

| Q.No. | Topic | Source file |
|---:|---|---|
| 1 | Student class with ArrayList: add, remove, iterate | `Q01_StudentArrayList.java` |
| 2 | Person–Employee inheritance with LinkedList and search | `Q02_PersonEmployeeLinkedList.java` |
| 3 | Book HashSet duplicate prevention by ID | `Q03_BookHashSet.java` |
| 4 | Product Comparable and TreeSet price sorting | `Q04_ProductTreeSet.java` |
| 5 | Student records in HashMap: add, remove, display | `Q05_StudentHashMap.java` |
| 6 | Shape–Circle inheritance with ArrayList polymorphism | `Q06_ShapeCircleArrayList.java` |
| 7 | Customer encapsulation with Vector | `Q07_CustomerVector.java` |
| 8 | Task management using Stack push/pop | `Q08_TaskStack.java` |
| 9 | Patient waiting list using Queue and LinkedList | `Q09_PatientQueue.java` |
| 10 | Department and Teacher with ArrayList + HashMap | `Q10_DepartmentTeacherCollections.java` |

### Concepts demonstrated
- ArrayList, LinkedList, HashSet, TreeSet, HashMap
- Vector, Stack, Queue
- Inheritance, encapsulation and polymorphism
- Comparable, `equals()` and `hashCode()`
- Iteration, searching, sorting and FIFO/LIFO operations

### Notes
- The Book class overrides both `equals()` and `hashCode()` so books with the same ID are treated as duplicates by HashSet.
- Product comparison sorts by price; product ID is used as a tie-breaker so products with equal prices are not accidentally discarded by TreeSet.
- The Department class uses department ID for equality and hashing so it can be used reliably as a HashMap key.
- In Question 10, Teacher extends Department as requested, while the teacher map associates each Department with a list of Teacher objects.
