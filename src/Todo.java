import java.time.LocalDateTime;

public class Todo {

    String id;
    String description;
    boolean status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Todo() {
        id = "toBeGenerated";
        description = "Create a Todo CLI";
        status = true; // make it an enum
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    public String toString() {
        return "ID" + "()" + "\nDesc: " + description + "\nStatus: " + status + "\nCreated at: " + createdAt + "\nUpdated at: ";
    }

}
