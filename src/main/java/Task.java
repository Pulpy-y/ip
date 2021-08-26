import java.time.format.DateTimeFormatter;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println("Yayyyy done yayyy~~");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ( "|" + getStatusIcon() + "| "+ this.description);
    }

    public String toStoredString() {
        return "";
    }

}