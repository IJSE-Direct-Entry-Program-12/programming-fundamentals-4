import java.io.IOException;
import java.util.Scanner;

void main() throws InterruptedException, IOException {
    final Scanner SCANNER = new Scanner(System.in);

    mainLoop:
    while (true) {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        System.out.println("==================================");
        System.out.println("           DEMO CLI APP");
        System.out.println("==================================");
        System.out.println("1. Screen 1");
        System.out.println("2. Screen 2");
        System.out.println("3. Screen 3");
        while (true) {
            System.out.print("Enter a screen number to navigate: ");
            switch (SCANNER.nextInt()) {
                case 1 -> {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                    System.out.println("==================================");
                    System.out.println("           SCREEN 1");
                    System.out.println("==================================");
                    System.out.println("1. Go Back");
                    System.out.println("2. Exit");
                    while(true) {
                        System.out.print("Enter an option: ");
                        switch (SCANNER.nextInt()) {
                            case 1 -> {
                                continue mainLoop;
                            }
                            case 2 -> System.exit(0);
                            default -> System.out.println("\033[31mInvalid option\033[0m");
                        }
                    }
                }
                case 2 -> {
                    // Todo: Display Screen 2
                }
                case 3 -> {
                    // Todo: Display Screen 3
                }
                default -> System.out.println("\033[31mInvalid Screen Number\033[0m");
            }
        }
    }
}