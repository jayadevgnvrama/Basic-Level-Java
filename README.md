# Task List Application Documentation

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Usage](#usage)
4. [Code Structure](#code-structure)
5. [How to Run](#how-to-run)
6. [Sample Output](#sample-output)
7. [Future Enhancements](#future-enhancements)
8. [Conclusion](#conclusion)

## 1. Introduction <a name="introduction"></a>
The Task List Application is a simple Java program designed to help users manage their tasks. It provides a text-based user interface.

## 2. Features
### 2.1 Add Task
Users can add tasks to the task list by entering a task description. The application then adds the task to the list and confirms the successful addition.

### 2.2 Remove Task
Users can remove tasks from the task list by selecting the task number to be removed. The application displays the current tasks, and users can choose a task to remove. The program validates the input and removes the selected task, providing feedback on the success or failure of the removal.

### 2.3 List Tasks
Users can view the current tasks in the list. The application displays each task along with its corresponding number in the list. If the task list is empty, the application notifies the user.

### 2.4 Exit
Users can exit the application at any time. The program provides a clean exit message and terminates.

## 3. Usage 
To use the Task List Application, follow these steps:
1. Run the application.
2. Choose from the menu options (Add Task, Remove Task, List Tasks, Exit) by entering the corresponding number.
3. Follow the prompts to add, remove, or list tasks.

## 4. Code Structure <a name="code-structure"></a>
The code is organized into the following components:
- **TaskListApp class:** The main class that contains the main method. It initializes the task list, scanner, and manages the menu and user input.
- **displayMenu method:** Displays the menu options and handles user input.
- **addTask method:** Prompts the user to enter a task and adds it to the task list.
- **removeTask method:** Displays the current tasks, prompts the user to choose a task to remove, and removes it from the list.
- **listTasks method:** Displays the current tasks in the list.

## 5. How to Run <a name="how-to-run"></a>
To run the Task List Application, ensure you have a Java development environment set up. Compile the code using a Java compiler and run the compiled class file.

Example:
```bash
javac TaskListApp.java
java TaskListApp
```

## 6. Sample Output <a name="sample-output"></a>

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Exit
Enter your choice: 1
Enter the task: Complete documentation
Task added successfully!

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Exit
Enter your choice: 3
Task List:
1. Complete documentation

...

## 7. Future Enhancements <a name="future-enhancements"></a>
Possible future enhancements include:

Save and Load: Implement functionality to save the task list to a file and load it upon application startup.

Task Priority: Allow users to set priorities for tasks.

User Authentication: Implement user authentication for personalized task lists.

## 8. Conclusion <a name="conclusion"></a>
The Task List Application provides a basic yet functional task management system. Users can easily interact with the application through the text-based interface, making it a straightforward tool for managing tasks. Further improvements can be made to enhance its functionality and usability.
