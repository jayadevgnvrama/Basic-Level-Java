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
The Task List Application is designed to simplify task management through a text-based user interface. Developed in Java, this application allows users to interact with their task list by adding, removing, and listing tasks. The simplicity of the interface makes it accessible to users who prefer a command-line environment for task organization.

## 2. Features
### 2.1 Add Task
The "Add Task" feature enables users to input a task description via the command line. The application then appends the task to an ArrayList, which serves as the underlying data structure for the task list. Upon successful addition, users receive a confirmation message, enhancing the user experience.

### 2.2 Remove Task
The "Remove Task" functionality involves displaying the current tasks with corresponding numbers. Users can then select a task number to remove. The application performs input validation to ensure the user's selection is within the valid range. It then removes the selected task, providing immediate feedback to the user on the success or failure of the removal process.

### 2.3 List Tasks
The "List Tasks" feature displays the current tasks in the task list, presenting each task with its associated number. This provides users with a quick overview of their tasks. Additionally, the application checks whether the task list is empty and appropriately notifies the user.

### 2.4 Exit
The "Exit" option allows users to gracefully terminate the application. Upon choosing this option, the program displays a farewell message and exits, ensuring a smooth user experience.

## 3. Usage <a name="usage"></a>
The usage section provides a step-by-step guide for users on how to interact with the application. It outlines the process of running the application, choosing menu options, and following prompts to perform specific tasks. This section serves as a practical guide for users unfamiliar with the application.
To use the Task List Application, follow these steps:
1. Run the application.
2. Choose from the menu options (Add Task, Remove Task, List Tasks, Exit) by entering the corresponding number.
3. Follow the prompts to add, remove, or list tasks.

## 4. Code Structure <a name="code-structure"></a>
The code structure section explains the organization of the code into different methods within the TaskListApp class. It highlights the responsibilities of each method, such as managing the menu, adding tasks, removing tasks, and listing tasks. This modular structure enhances code readability, maintainability, and allows for future extensions.

The code is organized into the following components:
- **TaskListApp class:** The main class that contains the main method. It initializes the task list, scanner, and manages the menu and user input.
- **displayMenu method:** Displays the menu options and handles user input.
- **addTask method:** Prompts the user to enter a task and adds it to the task list.
- **removeTask method:** Displays the current tasks, prompts the user to choose a task to remove, and removes it from the list.
- **listTasks method:** Displays the current tasks in the list.

## 5. How to Run <a name="how-to-run"></a>
This section provides clear instructions on compiling and running the Java application. Users can follow these steps to ensure a smooth execution of the Task List Application on their Java-enabled environment.
To run the Task List Application, ensure you have a Java development environment set up. Compile the code using a Java compiler and run the compiled class file.

Example:
```bash
javac TaskListApp.java
java TaskListApp
```

## 6. Sample Output <a name="sample-output"></a>
The sample output section presents an example of the application's behavior during execution. It illustrates how the application interacts with the user, displaying menu options, processing user input, and providing feedback based on the chosen actions. This gives users a preview of what to expect when using the application.

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



## 7. Future Enhancements <a name="future-enhancements"></a>
The future enhancements section outlines potential improvements and additional features that could be incorporated into the application. Suggestions include implementing save/load functionality for persistent task lists, introducing task prioritization, and exploring user authentication for personalized task management.

Possible future enhancements include:

Save and Load: Implement functionality to save the task list to a file and load it upon application startup.

Task Priority: Allow users to set priorities for tasks.

User Authentication: Implement user authentication for personalized task lists.

## 8. Conclusion <a name="conclusion"></a>
The conclusion summarizes the key aspects of the Task List Application and emphasizes its current strengths and areas for improvement. It serves as a reflection on the application's capabilities and sets the stage for future development and refinement.

The Task List Application provides a basic yet functional task management system. Users can easily interact with the application through the text-based interface, making it a straightforward tool for managing tasks. Further improvements can be made to enhance its functionality and usability.
