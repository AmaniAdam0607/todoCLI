import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App {

    static ArrayList<Todo> todos = new ArrayList<>();
    static String[] arguments;
    static Gson gson = new Gson();
    static File todosFile = new File("todos.json");
    static Path pathToFile = todosFile.toPath();
    static TypeToken<ArrayList<Todo>> collectionType = new TypeToken<ArrayList<Todo>>(){};

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Usage java App <Command>, do java App -help to see list of all possible commands.");
            System.exit(64);
        }


        String command = args[0];
        arguments = args;

        System.out.println("");
        
        switch (command) {
            case "add":
                addTodo();
                break;
            case "update":
                updateTodo();
                break;
            case "delete":
                deleteTodo();
                break;
            case "mark-in-progress":
                markTodoInProgress();
                break;
            case "mark-done":
                markTodoDone();
                break;
            case "-help":
                System.out.print("Commands are \n1. add <todo-description> eg. add \"Buy groceries\"");
                System.out.print("\n2. delete <todo-id> eg. \"delete 1\"");
                System.out.print("\n3. update <todo-id> <todo-description> eg. update 1 \"Buy groceries and cook dinner\"");
                System.out.print("\n4. mark-in-progress <todo-id> eg. mark-in-progress 1");
                System.out.print("\n5. mark-done <todo-id>");
                System.out.print("\n6. list (this shows all todos)");
                System.out.print("\n7. list done (this shows all todos that are done)");
                System.out.print("\n8. list in-progress (this shows all todos that are in progress)");
                System.out.print("\n                            Made with ❤ by Amani Adam.");
                break;
            default:
                System.out.println("Unrecognized Command");
                break;
        }

    }

    private static void markTodoDone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'markTodoDone'");
    }

    private static void markTodoInProgress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'markTodoInProgress'");
    }

    private static void deleteTodo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTodo'");
    }

    private static void updateTodo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTodo'");
    }

    private static void addTodo() {

        checkIfArgumentsForCommandAreSupplied();

        readTodosFromFile();

        todos.add(new Todo(getTodoId(), arguments[1]));

        writeTodosToFile();
        
    }

    private static void readTodosFromFile() {
        if (Files.exists(pathToFile)) {

            try {
                todos = gson.fromJson(Files.readString(pathToFile), collectionType);
            }
            catch (IOException e) {
                System.out.println("Failed to read todos.");
            }
        }
    }

    private static String getTodoId() {
        return "" + ( 1 + todos.size());
    }

    private static void checkIfArgumentsForCommandAreSupplied() {
        if (arguments.length == 1) {
            System.out.println("Incomplete Command | Consider reading usage found by using  [java App -help] command");
            System.exit(64);
        }
    }

    private static void writeTodosToFile() {

        try {
            Files.writeString(pathToFile, gson.toJson(todos));
        } catch (IOException e) {
            System.out.println("App failed to write todos to file.");
        }
    }
}
