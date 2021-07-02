import java.util.Scanner;
import java.lang.reflect.Method;

public class Commands {
    public static Scanner inputs = new Scanner(System.in);

    public static void init() {
        System.out.println("\n================================================== \n" + "Enter command:");
        String check = inputs.nextLine();
        String finCheck[] = check.split(" ");
        check = finCheck[0].substring(0, 1).toUpperCase() + finCheck[0].substring(1).toLowerCase() + "s";

        try {
            switch (check) {
                case "Users":
                    if (finCheck[1].equals("list")) {
                        System.out.println(Users.list());
                    } else if (finCheck[1].equals("set")) {
                        System.out.println(Users.set());
                    }
                    break;

                case "Books":

                    if (finCheck[1].equals("list")) {
                        System.out.println(Books.list());
                    } else if (finCheck[1].equals("set")) {
                        System.out.println(Books.set());
                    }
                    break;
                case "Cmds":
                    Commands.list();
                    break;
                case "Exits":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Error, command not found");
                    break;
            }
        } catch (Exception e) {
            // System.out.println(e);
        } finally {
            System.out.println("====== End of line =======");
            Commands.init();
        }

    }

    public static void list() {
        Users users = new Users();
        Books books = new Books();
        System.out.println("\nCommand Lists:");

        System.out.println("cmd list");
        Method usersClass[] = users.getClass().getDeclaredMethods();
        for (Method user : usersClass) {
            if (user.getModifiers() == 9) {
                System.out.println("user " + user.getName());
            }
        }

        Method Books[] = books.getClass().getDeclaredMethods();
        for (Method book : Books) {
            if (book.getModifiers() == 9) {
                System.out.println("book " + book.getName());
            }
        }

        System.out.println("exit");
    }
}
