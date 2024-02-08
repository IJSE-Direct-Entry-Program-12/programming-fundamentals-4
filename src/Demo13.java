void main(){
    String str1 = "";
    System.out.println(str1.length());
    System.out.println(STR."Is Empty: \{str1.isEmpty()}");
    System.out.println(STR."Is Blank: \{str1.isBlank()}");

    String str2 = "Some text";
    System.out.println(str2.length());
    System.out.println(STR."Is Empty: \{str2.isEmpty()}");
    System.out.println(STR."Is Blank: \{str2.isBlank()}");

    String str3 = "    ";
    System.out.println(str3.length());
    // str3.strip().length() == 0 && str3.strip().length() == str3.length()
    // True: Empty+Blank
    // False: Blank
    System.out.println(STR."Is Empty: \{str3.isEmpty()}");  // str3.length() == 0
    System.out.println(STR."Is Blank: \{str3.isBlank()}");
    System.out.println(str3.strip().length() == 0 && str3.strip().length() == str3.length() ? "EMPTY+BLANK": "BLANK");
}