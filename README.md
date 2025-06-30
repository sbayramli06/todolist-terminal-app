Todo List Application

A simple command-line todo list application written in Java that allows users to manage their daily tasks efficiently.
Features

    View Tasks: Display all current tasks in a numbered list
    Add Tasks: Add new tasks to your todo list
    Remove Tasks: Delete tasks you no longer need
    Mark Tasks as Complete: Mark tasks as done with a completion indicator
    Interactive Menu: Easy-to-use menu-driven interface
    Input Validation: Prevents empty tasks and invalid selections

Requirements

    Java 8 or higher
    No external dependencies required

Installation

    Clone or download the TodoList.java file
    Ensure you have Java installed on your system
    Compile the program:

    bash

    javac TodoList.java

Usage

    Run the compiled program:

    bash

    java TodoList

    The application will display a menu with the following options:

    1. Show all the tasks
    2. Add tasks
    3. Remove tasks
    4. Mark tasks
    5. Exit

    Enter the number corresponding to your desired action and follow the prompts.

How It Works
Adding Tasks

    Select option 2 from the main menu
    Enter your task description
    The task will be added to your list (empty tasks are not allowed)

Viewing Tasks

    Select option 1 to see all your current tasks
    Tasks are displayed in a numbered list
    If no tasks exist, you'll see a friendly "No tasks pending :)" message

Removing Tasks

    Select option 3 from the main menu
    View your current tasks and choose the number of the task to remove
    The task will be permanently deleted from your list

Marking Tasks as Complete

    Select option 4 from the main menu
    Choose the task number you want to mark as done
    The task will be updated with a completion indicator: [you did this one)))]

Exiting

    Select option 5 to exit the application

Example Session

TODO LIST
1. Show all the tasks
2. Add tasks
3. Remove tasks
4. Mark tasks
5. Exit
Enter your choice: 2
Enter your new task: 
Buy groceries
Task added!

1. Show all the tasks
2. Add tasks
3. Remove tasks
4. Mark tasks
5. Exit
Enter your choice: 1
ALL TASKS
1. Buy groceries

1. Show all the tasks
2. Add tasks
3. Remove tasks
4. Mark tasks
5. Exit
Enter your choice: 4
ALL TASKS
1. Buy groceries
Enter the number of the task you want to mark as done: 
1

1. Show all the tasks
2. Add tasks
3. Remove tasks
4. Mark tasks
5. Exit
Enter your choice: 1
ALL TASKS
1. Buy groceries [you did this one)))]

Code Structure

The application consists of a single TodoList class with the following key methods:

    run(): Main application loop
    showMenu(): Displays the menu options
    getChoice(): Gets user input for menu selection
    showTasks(): Displays all current tasks
    addTasks(): Adds a new task to the list
    removeTasks(): Removes a selected task
    markTasks(): Marks a task as completed

Error Handling

The application includes basic error handling for:

    Empty task entries
    Invalid task numbers when removing or marking tasks
    Invalid menu choices

Future Enhancements

Potential improvements could include:

    Task priorities
    Due dates
    Task categories
    Data persistence (save/load from file)
    Better completion status management
    Undo functionality

License

This project is open source and available under standard terms.
Contributing

Feel free to fork this project and submit pull requests for any improvements or bug fixes.
