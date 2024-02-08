void main() {
    String str = "Kasun Sampath";
    System.out.println(str.substring(2));
    // start index: inclusive
    // end index: exclusive
    System.out.println(str.substring(2, 5));
    System.out.println(str.contains("un"));
    System.out.println(str.contains("Sam"));
    System.out.println(str.contains("Sup"));
}