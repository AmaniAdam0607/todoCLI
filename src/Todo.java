import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {

    String id;
    String description;
    boolean status;
    String createdAt;
    String updatedAt;

    public Todo(String id, String description) {
        this.id = id;
        this.description = description;
        status = true; // make it an enum
        createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a"));
        updatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a"));
    }


    public Todo updateTodo(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy h:m:s a"));
        return this;
    }

    public String toString() {
        return "ID" + "()" + "\nDesc: " + description + "\nStatus: " + status + "\nCreated at: " + createdAt + "\nUpdated at: ";
    }



    public String getId() {
        return id;
    }



    public String getDescription() {
        return description;
    }



    public boolean isStatus() {
        return status;
    }



    public String getCreatedAt() {
        return createdAt;
    }



    public String getUpdatedAt() {
        return updatedAt;
    }

}
