# Group Assignment 3: Data Structure
## 📚 Overview

The FSKTM Student Enrollment System is a Java-based console application that simulates a real-world student records management system. It allows the storage, retrieval, searching, sorting, and analysis of student data using structured data types like Binary Search Trees (BST), recursion, and file handling mechanisms.

The system is modularly developed by 6 group members, where each person is responsible for one key functional component. The code is organized in a single Java class: `FSKTMStudentEnrollment.java`.

## Group Members & Task Distribution
| Member Name           | Matric ID     | Task |
|-----------------------|---------------|------|
| Student 1: Choon Yi Keith | 24004553/1 | Student Records Storage (Binary Search Tree implementation) |
| Student 2: Ong Yi Hao     | 24004516/1 | Student Search Engine (Exact/Partial/Range search functions) |
| Student 3: Chan Yi Ern    | 24004495/1 | Student Sorting Algorithms (Multi-field sorting and performance comparison) |
| Student 4: Julius Ng      | 24004608/1 |Recursion (Total count, filtering, CGPA average, balance factor, etc.) |
| Student 5: Shen Li        | 23093206   | User Interface & Integration (Text-based menu, CSV I/O, Undo/Redo, Input Validation) |
| Student 6: Wan Khai Yeu   | 23103751   | User Interface & Integration (Text-based menu, CSV I/O, Undo/Redo, Input Validation) |

## Code Structure

The code is organized into inner static classes within the main class file:
- **`StudentNode`**: Represents a student record node in the BST.
- **`StudentBST`**: Handles student insertion, deletion, and in-order traversal.
- **`StudentSearch`**: Allows searching students by ID, name, programme, and CGPA range.
- **`StudentSorter`**: Sorts student records by different fields and compares performance.
- **`StudentRecursion`**: Implements recursive functions to analyze student records.
- **`MenuSystem`**: Provides user interface, file operations, input validation, and history tracking.
- **`main()` method**: Launches the program by invoking the menu system.

---

## 📂 Features Implemented
Student 1:
### Key Points:
StudentNode class:
Data storage: Holds all student info—IDs, personal, address segments, programme, CGPA.

UUID (userID): Generates a universal unique ID for each record—useful even if matricID changes.

left, right pointers: Link to the left and right child nodes in your BST.

Constructor: Initializes fields and ensures the node starts without children.

More details: https://docs.google.com/document/d/13n46YckwDmVyOaNpIm1m77KxVj7TAlw3ZljmGoaQ4lE/edit?usp=sharing

Student 2: https://docs.google.com/document/d/1KxDgFjrZCCxNmYtsc05okg5CLOrvHR_G24eAHqrZ4w8/edit?usp=sharing
Student 3: https://docs.google.com/document/d/1EhLb0ddmGn32eJt70WWIoHv8cUdChdL9pl9riikxfMI/edit?usp=sharing
Student 4: https://docs.google.com/document/d/1V0RpJqGO5t3GwyO83etIqDojpQ9-FcqhBOtbtQiVjhE/edit?tab=t.0
Student 5: https://docs.google.com/document/d/1b5O2qge8f6a9zvTx7RZu6JKoX3jTro90HL6edC7_B5I/edit?usp=sharing
Student 6: https://docs.google.com/document/d/1zA1SGFusDFz7hwY7csChBEHrSBa_D49iJlx-dxlyfdw/edit?usp=sharing


## Chatgpt reflection
Embarking on the FSKTM Student Enrollment System project was a significant learning milestone for our group. The assignment required us to collaboratively design, develop, and integrate a complete student record system using Java, showcasing our understanding of core data structure concepts—especially binary search trees, recursion, sorting, and file integration. Through this experience, we gained not only technical skills but also project coordination and modular software design knowledge.

The implementation of the Binary Search Tree (BST) as the core data structure helped us solidify our understanding of node-based storage, traversal, and operations like insert, delete, and search. By assigning each student record a unique UUID and organizing them by Matric ID, we saw firsthand how BSTs can optimize both storage and search efficiency, offering guaranteed O(log n) performance in ideal conditions. We also learned to handle edge cases like duplicate insertions and unbalanced trees.

On the search functionality, we expanded beyond exact matches to include partial matches and range queries, such as finding students from specific districts or within a CGPA range. This involved a combination of recursion, conditional logic, and string matching—skills directly tied to real-world software use cases like building filters in web applications.

For the sorting component, we implemented multi-field and user-driven sorting methods. This required understanding and applying custom comparator logic in Java, and allowed users to choose sorting orders (ascending/descending) based on fields like Name, CGPA, or Address. Moreover, the task of comparing the performance of different sorting techniques deepened our understanding of algorithm efficiency (e.g., bubble sort vs. merge sort) and their impact on runtime and memory usage.

Recursion was another highlight of this project. It was used to compute various statistics like total student count, programme distribution, and average CGPA. We also implemented balance factor calculations at different nodes of the BST, which gave us insight into how unbalanced trees could affect performance, and how algorithms like AVL or Red-Black trees might be necessary in real-world systems to address that.

From an integration and usability perspective, we developed a menu-based text interface that allows users to interact with the system through the terminal. File handling via CSV enabled persistent data storage, while undo/redo logic using stack principles mimicked modern editing tools—helping us bridge the gap between theory and practical UI behavior. Input validation and duplicate checks further reinforced the need for robust error handling in real-world software.

Collaboratively, the project taught us valuable lessons in modular programming. By dividing responsibilities across five core modules—storage, search, sort, recursion, and integration—we were able to work in parallel while maintaining consistent structure and communication. Each member took ownership of their section but also contributed to system-wide decisions such as object modeling, naming conventions, and testing strategies.

While the technical implementation was challenging, especially in balancing recursive logic and BST traversal, the support we received from our group discussion, GitLab version control, and AI assistance (including ChatGPT) helped us overcome many hurdles. For example, debugging recursive errors or refining comparator logic was made easier with guided suggestions. ChatGPT was particularly helpful in converting abstract algorithm logic into clean Java structure, allowing us to focus on refining our understanding and customizing it to our needs.

Summary of Key Lessons:
Deep understanding of BST operations in a practical use case (student records).

Recursive algorithms used not just for searching but also for statistical analysis.

Modular and maintainable code design, with clear separation of concerns.

Real-world readiness through file I/O handling, undo/redo, and user interaction.

Collaboration and task ownership, where each member contributed a critical module.

Code traceability and version control, which we practiced using GitLab and integrated documentation.

In conclusion, this project was not just a coding assignment but a simulation of how real-world systems are built—modularly, collaboratively, and with performance and user experience in mind. It challenged us to think critically, communicate effectively, and apply our classroom knowledge in a meaningful, applied setting.

## ✅ Acknowledgement

This project was developed as part of our Group Assignment 3 (GA3) for the Data Structures and Algorithms course in Semester 2, Universiti Malaya.


