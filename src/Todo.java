import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {

    String id;
    String description;
    TodoProgress progress;
    String createdAt;
    String updatedAt;

    public Todo(String id, String description) {
        this.id = id;
        this.description = description;
        this.progress = TodoProgress.TODO;
        createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a"));
        updatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a"));
    }

    public String toString() {
        return "ID" + "()" + "\nDesc: " + description + "\nStatus: " + progress + "\nCreated at: " + createdAt + "\nUpdated at: ";
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
        update();
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setInProgress() {
        this.progress = TodoProgress.INPROGRESS;
        update();
    }

    public void setDone() {
        this.progress = TodoProgress.DONE;
        update();
    }

    public void update() {
        setUpdatedAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a")));
    }
}
