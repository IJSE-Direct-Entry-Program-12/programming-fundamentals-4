import java.io.IOException;
import java.util.Scanner;

void main() throws IOException, InterruptedException {
    final var SCANNER = new Scanner(System.in);
    mainLoop:
    while (true) {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        System.out.println("=================================");
        System.out.println("++\033[30;1m   \uD83D\uDC6B WELCOME TO STUDENT DB\033[0m  ++");
        System.out.println("=================================");
        System.out.println("1. Add New Student");
        System.out.println("2. Delete Student");
        System.out.println("3. View All Students");
        System.out.println("4. Exit");
        System.out.print("\nEnter command number: ");
        switch (SCANNER.nextInt()) {
            case 1 -> {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("=================================");
                System.out.println("++\033[30;1m       ➕ ADD NEW STUDENT\033[0m     ++");
                System.out.println("=================================");
                SCANNER.skip("\n");
                while (true) {
                    System.out.print("Enter student name: ");
                    String name = SCANNER.nextLine();
                    if (name.isBlank()) System.out.println("\033[31mName can't be empty\033[0m");
                }
            }
            case 4 -> System.exit(0);
        }
    }
}