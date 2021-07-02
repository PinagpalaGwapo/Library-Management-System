import java.util.Scanner;

public class Users {
    private static String stored[][] = new String[10][2];

    public static String list() {
        String[][] users = Users.stored;
        Scanner read = new Scanner(System.in);
            String username;
            
        for (int i = 0; i < users.length; i++) {
            if (users[i][0] != null) {
            System.out.println("\n===== Search Username =======");
            System.out.print("Username: ");
            username=read.nextLine();
            System.out.println();
            System.out.println(users[i][0]);

            } else if (users[0][0] == null) {
                System.out.println("\nNO USERS HAVE BEEN ADDED YET");
                break;
            }
        }

        return "";
    }

    public static String set() {
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        for (int x = 0; x < Users.stored.length; x++) {
            for (int y = 0; y < Users.stored[x].length; y++) {
                if (Users.stored[x][y] == null) {
                    if (counter == 1) {
                        System.out.println("\nPlease enter the new username : ");
                        Users.stored[x][y] = scan.nextLine();
                        counter++;
                    }
                }
            }
            if (counter > 1) {
                break;

            }
            System.out.println();
        }
        return "";
    }

}
