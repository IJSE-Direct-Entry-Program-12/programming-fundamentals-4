void main(){
    String str = "This is a new string";
    System.out.println(str.startsWith("Th"));
    System.out.println(str.startsWith("Ab"));

    System.out.println(str.endsWith("ing"));
    System.out.println(str.endsWith("es"));

    System.out.println("--------");
    System.out.println(str.startsWith("is"));
    System.out.println(str.startsWith("is", 2));
}