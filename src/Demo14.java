void main(){
    String str = "Contact1: 077-1234567, Contact2: 088-1234567, Contact3: 055-1234567";
    String newStr1 = str.replaceFirst("\\d{3}-\\d{7}", "+94(11)-1234567");
    String newStr2 = str.replaceAll("\\d{3}-\\d{7}", "+94(11)-1234567");
    System.out.println(newStr1);
    System.out.println(newStr2);

    System.out.println("------------------");

    String str2 = "This is a string";
    System.out.println(str2.replace('i', 'e'));
    System.out.println(str2);
    System.out.println(str2.replace("is", "dep"));
}