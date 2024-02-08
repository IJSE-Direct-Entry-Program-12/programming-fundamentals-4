void main(){
    String myStr1 = "   This is a string    ";
    System.out.println(myStr1.length());
    System.out.println(myStr1);
    System.out.println(myStr1.trim());
    System.out.println(myStr1.strip());
    System.out.println(myStr1.stripLeading());
    System.out.println(myStr1.stripTrailing());
    System.out.println(myStr1.length());
    System.out.println(myStr1.strip().length());

    String myStr2 = myStr1.strip();
    System.out.println(myStr1);
    System.out.println(myStr2);
}