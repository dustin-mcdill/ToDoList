class UnitTest {
    private ToDoList toDoList;

    void setUp() {
        toDoList = new ToDoList();
    }

    void testAddTask() {
        toDoList.addTask("Buy groceries");
        toDoList.showTasks();
    }

    void testAddEmptyTask() {
        toDoList.addTask("");
    }

    void testMarkTaskComplete() {
        toDoList.addTask("Go for a run");
        toDoList.taskComplete(0);
        toDoList.showTasks();
    }

    void testMarkInvalidTaskComplete() {
        toDoList.taskComplete(0);
    }

    void testShowTasksWhenEmpty() {
        toDoList.showTasks();
    }
}