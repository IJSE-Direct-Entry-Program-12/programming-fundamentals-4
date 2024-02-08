void main(){
    System.out.printf("Welcome to string formatting \n");

    int x = 10;
    int y = 20;

    System.out.println("x=" + x + " ,y=" + y);
    System.out.println(STR."x=\{x}, y=\{y}");       // Since Java 21 (Text Interpolation)
    System.out.printf("x=%10s, y=%10s", x, y);
}