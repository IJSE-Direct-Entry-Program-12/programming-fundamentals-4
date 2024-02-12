void main(){
    int x = 10;
    int y = 20;
    byte b = 20;

    System.out.println(x + y);          // Identity Conversion
    System.out.println(x + b);          // Not an identity conversion
                                        // Widening Primitive Conversion

    System.out.println(b + x + 5.2 + 3.5);

    System.out.println(7 / 2 * 2.);

    int x2 = 5;
    int y2 = 2;
    float f = x2 / y2 * 2.f;
    System.out.println(f);
}