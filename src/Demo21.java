import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = SCANNER.nextInt();
    SCANNER.skip("\n");
    System.out.print("Enter your name: ");
    String name = SCANNER.nextLine();

    System.out.println(STR."Your name is : \{name}, and your age is : \{age}");
}