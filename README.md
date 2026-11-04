# Lab Sheet 09 — MCA203P
## Object Oriented Programming Using Java

This package contains solutions for all 30 Java Collections practical questions.

### Requirements
- JDK 8 or newer (JDK 11/17/21 recommended)
- No external libraries required

### Compile all programs
Open a terminal in the extracted folder:

```bash
cd src
javac *.java
```

### Run a program
```bash
java Q01_ArrayListPrint
java Q17_TreeSetSort
java Q27_SortStudentsComparator
```

Run any other question using its class name (without `.java`).

### Question-wise file mapping

| Q.No. | Program | Source file |
|---:|---|---|
| 1 | Create and print ArrayList | `Q01_ArrayListPrint.java` |
| 2 | ArrayList size | `Q02_ArrayListSize.java` |
| 3 | Insert at index | `Q03_ArrayListInsert.java` |
| 4 | Remove by index and value | `Q04_ArrayListRemove.java` |
| 5 | Update element | `Q05_ArrayListUpdate.java` |
| 6 | For-each iteration | `Q06_ArrayListForEach.java` |
| 7 | Iterator iteration | `Q07_ArrayListIterator.java` |
| 8 | Sort ArrayList | `Q08_ArrayListSort.java` |
| 9 | Reverse string list | `Q09_ReverseStringList.java` |
| 10 | Create and print LinkedList | `Q10_LinkedListPrint.java` |
| 11 | Add at beginning and end | `Q11_LinkedListAddEnds.java` |
| 12 | Remove first and last | `Q12_LinkedListRemoveEnds.java` |
| 13 | Retrieve first and last | `Q13_LinkedListRetrieveEnds.java` |
| 14 | HashSet duplicate behavior | `Q14_HashSetDuplicates.java` |
| 15 | Remove from HashSet | `Q15_HashSetRemove.java` |
| 16 | HashSet Iterator | `Q16_HashSetIterator.java` |
| 17 | TreeSet sorted order | `Q17_TreeSetSort.java` |
| 18 | TreeSet contains | `Q18_TreeSetContains.java` |
| 19 | LinkedHashSet insertion order | `Q19_LinkedHashSetOrder.java` |
| 20 | Compare Set types | `Q20_CompareSets.java` |
| 21 | Add to PriorityQueue | `Q21_PriorityQueueAdd.java` |
| 22 | PriorityQueue removal order | `Q22_PriorityQueueRemove.java` |
| 23 | PriorityQueue peek | `Q23_PriorityQueuePeek.java` |
| 24 | Queue interface with LinkedList | `Q24_QueueLinkedList.java` |
| 25 | Queue add/remove/peek | `Q25_QueueOperations.java` |
| 26 | Custom Student objects + Iterator | `Student.java`, `Q26_CustomObjectIterator.java` |
| 27 | Sort Student objects with Comparator | `Student.java`, `Q27_SortStudentsComparator.java` |
| 28 | Convert List to Set | `Q28_ListToSet.java` |
| 29 | Convert Set to List | `Q29_SetToList.java` |
| 30 | Clear List, Set and Queue | `Q30_ClearCollections.java` |

### Important observations
- `ArrayList` maintains insertion order and permits duplicates.
- `LinkedList` supports efficient insertion/removal at both ends.
- `HashSet` removes duplicates but does not guarantee iteration order.
- `LinkedHashSet` removes duplicates and maintains insertion order.
- `TreeSet` removes duplicates and sorts elements by natural order (or comparator).
- `PriorityQueue` exposes its head according to priority; printing the queue does not necessarily display all elements in sorted order. Repeated `poll()`/`remove()` shows priority order.
- `Queue` generally follows FIFO behavior; `PriorityQueue` orders by priority.

### Practical submission
Submit the `src` folder containing `.java` files. The ZIP includes all source code and this README.
