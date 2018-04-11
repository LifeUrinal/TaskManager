public class Task {

    public String title;
    public String description = null;
    public boolean finished = false;
    //public Date dueDate;
    public static int numberOfTasks = 0;
    public int taskNumber = 0;

    public Task(String title) {
        numberOfTasks += 1;
        this.taskNumber = numberOfTasks;
        this.title = title;
    }

    public Task(String title, String description) {
        numberOfTasks += 1;
        this.taskNumber = numberOfTasks;
        this.title = title;
        this.description = description;
    }

    public Task(String title, String description, boolean finished) {
        numberOfTasks += 1;
        this.taskNumber = numberOfTasks;
        this.title = title;
        this.description = description;
        this.finished = finished;
        //this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return finished;
    }

    public String isCompleted() {
        if (finished) {
            return "Completed";
        } else {
            return "Uncompleted";
        }
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void completeTask() {
        setFinished(true);
    }

    public static int getNumberOfTasks() {
        return numberOfTasks;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String toString() {
        return taskNumber + ";" + title + ";" + description + ";" + isFinished();
    }
}
