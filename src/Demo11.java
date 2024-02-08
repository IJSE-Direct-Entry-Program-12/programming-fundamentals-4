void main(){
    String str1 = "This is a string";
    System.out.println(str1.toLowerCase());
    System.out.println(str1.toUpperCase());
    System.out.println(str1);
    char firstChar = str1.charAt(0);
    System.out.println(firstChar);
    char lastChar = str1.charAt(str1.length() - 1);
    System.out.println(lastChar);
    for (int i = 0; i < str1.length(); i++) {
        System.out.println(str1.charAt(i));
    }
    System.out.println("-----------------");
    System.out.println(str1.indexOf("i"));
    System.out.println(str1.lastIndexOf("i"));
    System.out.println(str1.indexOf("st"));
}