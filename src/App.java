

public class App {

    public static void main(String[] args) throws Exception {

        Todo todo = new Todo();

        if (args.length == 0) {
            System.out.println("Usage: java App <Command>. Type java App -help to see list of all possible commands.");
            System.exit(64);
        }

        String command = args[0];
        
        switch (command) {
            case "print":
                System.out.println(todo);
                break;
            case "-help":
                System.out.println("Commands are \"print\"(to show the only available todo.)");
                break;
            default:
                System.out.println("Unrecognized Command");
                break;
        }

    }
}
