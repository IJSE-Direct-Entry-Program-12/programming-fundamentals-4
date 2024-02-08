void main(){
    System.out.println("Hello" + " IJSE");
    System.out.println("Hello".concat(" IJSE"));            // Java 11

    System.out.println("-------------------");

    System.out.println("D ".repeat(5));                 // Java 11
    System.out.println("DEP ".repeat(5));               // Java 11

    System.out.println("---------------------");

    String str = "Program";                                     // Java 11
    System.out.println(String.join("       ", "Hello", "Direct", "Entry", str, 10+""));
}