import java.util.Scanner;

public class Books {
    private static String stored[][] = new String[10][3];

    // DO NOT USE STATIC METHOD IF YOU DONT NEED IT IN THE LIST OF COMMANDS
    public static String list() {
        String[][] books = Books.stored;
        Scanner scan = new Scanner(System.in);
        String book;
        // System.out.println(Arrays.deepToString(books));

        for (int i = 0; i < books.length; i++) {
            if (books[i][0] != null) {
                System.out.println("\n===== Search Book =======");
                System.out.print("Book: ");
                book=scan.nextLine();
                System.out.println("Name: " + books[i][0]);
                System.out.println("Author: " + books[i][1]);
                System.out.println("Date: " + books[i][2]);
            } else if (books[0][0] == null) {
                System.out.println("\nNO BOOKS HAVE BEEN ADDED YET");
                break;
            }
        }

        return "";
    }

    public static String set() {
        Scanner inputs = new Scanner(System.in);

        int counter = 1;
        for (int i = 0; i < Books.stored.length; i++) {
            for (int j = 0; j < Books.stored[i].length; j++) {
                if (Books.stored[i][j] == null) {
                    if (counter == 1) {
                        System.out.println("\nPlease enter the book title:");
                        Books.stored[i][j] = inputs.nextLine();
                        counter++;
                    } else if (counter == 2) {
                        System.out.println("\nPlease enter the book author:");
                        Books.stored[i][j] = inputs.nextLine();
                        counter++;
                    } else if (counter == 3) {
                        System.out.println("\nPlease enter the date:");
                        Books.stored[i][j] = inputs.nextLine();
                        counter++;
                    }
                }
            }
            if (counter > 3) {
                break;

            }
            System.out.println();
        }

        return "";
    }
}
