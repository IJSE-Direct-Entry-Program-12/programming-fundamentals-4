import java.math.BigDecimal;
import java.util.Scanner;

void main(){
    // 1. Identity Conversion
    myMethod1(10);
    myMethod2('a');
    myMethod3(new Scanner(System.in));
    myMethod4("IJSE");

    // 2. Widening Primitive Conversion
    myMethod5(10);           // int -> long
    myMethod6(10L);         // long -> double
    myMethod6('c');         // char -> double

    // 3. Widening Reference Conversion
    myMethod7(new BigDecimal(10));
    myMethod8(new BigDecimal(10));
    myMethod8("Ijse");
    myMethod8(new Scanner(System.in));

    // 4. Boxing Conversion Optionally Followed By Widening Reference Conversion
    myMethod9('c');     // char -> Character
    myMethod10(10.25);  // double -> Double
    myMethod7(10);      // int -> Integer -> Number
    myMethod8(10.2f);   // float -> Float -> Object

    // 5. Unboxing Conversion Optionally Followed By Widening Primitive Conversion
    myMethod1(Integer.valueOf(10));
    myMethod2(Character.valueOf('c'));
    myMethod5(Integer.valueOf(20)); // Integer -> int -> long
    myMethod6(Character.valueOf('c'));  // Character -> char -> double

    // Narrowing Primitive Conversion ❌
//    myMethod0(10);
//    myMethod2(10);
}

void myMethod0(byte b){}
void myMethod1(int x){}
void myMethod2(char c){}
void myMethod3(Scanner scanner){}
void myMethod4(String str){}
void myMethod5(long l){}
void myMethod6(double d){}
void myMethod7(Number n){} void myMethod8(Object o){} void myMethod9(Character c){}
void myMethod10(Double d){}
