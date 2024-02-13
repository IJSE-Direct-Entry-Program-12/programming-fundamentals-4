import java.math.BigDecimal;
import java.util.Scanner;

void main(){
    int x = 10;
    byte b = (byte) x;              // int -> byte (Narrowing Primitive Conversion)
    byte b2 = 10 + 15;              // int -> byte
    Number n = 10;
    Integer i = (Integer) n;        // Number -> Integer (Narrowing Reference Conversion)

    int y = (int) 10;                   // Identity Conversion
    long z = (long) 10;                 // Widening Primitive Conversion
    Object o = (Object) "IJSE";         // Widening Reference Conversion
    double d = 5 / 2 * 2.;
    double d2 = (double) 5 / 2 * 2.;

//    boolean flag = (boolean) (Object) "Hi Bool";
//    Number n2 = 20;
//    int i2 = (int) n2;

    Object o2 = new BigDecimal("100.25");
    Scanner s1 = (Scanner) o2;
}