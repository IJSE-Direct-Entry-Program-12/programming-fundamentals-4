void main(){
    int x = 10;
    int y = 20;
    String str = String.format("x=%05d, y=%05d", x, y);
    // String format = String.format("x=%s, y=%s", x, y);
    System.out.println(str);
}