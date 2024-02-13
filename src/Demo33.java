import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;

void main(){
    // Assignment Context
    // 1. Identity Conversion
    int x1 = 10;
    x1 = 20 + 30;
    char c1 = 'c';
    Scanner scanner1 = new Scanner(System.in);
    String str1 = "IJSE";
    char c2 = 65;                     // char <= int (not an identity conversion)
    byte b1 = 10;                     // byte <= int (not an identity conversion)

    // 2. Widening Primitive Conversion
    int x2 = (byte) 10;
    int x3 = 'c';
    float f1 = x2;
    float f2 = 2L;

    // 3. Widening Reference Conversion
    Object o1 = "IJSE";
    CharSequence cs1 = "DEP";
    Serializable serial1 = "DEP-12";
    Object o2 = new Scanner(System.in);
    Number n1 = new BigDecimal("100.20");
    Object o3 = n1;

    // 4. Boxing Conversion Optionally Followed By Widening Reference Conversion
    Integer i1 = Integer.valueOf(10);         // Explicit Boxing
    Integer i2 = 10;                            // Implicit Boxing (Auto Boxing)
    Character c3 = 'c';
    Float f3 = 2.35f;
    // Float f4 = 10;          // int -> float -> Float (Widening Primitive Conversion + Boxing Conversion)
    // Long l3 = 10;           // int -> long -> Long
    // Double d2 = 2.2f;       // float -> double -> Double

    Number n2 = 2.35f;  // float -> Float (Boxing Conversion) + Float -> Number (Widening Reference Conversion)
    Object o4 = 1L;     // long -> Long (Boxing Conversion) + Long -> Object (Widening Reference Conversion)

    // 5. Unboxing Conversion Optionally Followed By Widening Primitive Conversion
    Integer i3 = Integer.valueOf(10);
    int i4 = i3.intValue();     // Explicit Unboxing
    int i5 =  i3;               // Implicit Unboxing (Auto Unboxing)
    long l1 = i3;       // Integer -> int (Unboxing Conversion) + int -> long (Widening Primitive Conversion)

    Character c4 = Character.valueOf('c');
    char c5 = c4.charValue();       // Explicit Unboxing
    char c6 = c4;                   // Implicit Unboxing (Auto Unboxing)
    int i6 =  c4;   // Character -> char (Unboxing Conversion) + char -> int (Widening Primitive Conversion)
    double d2 = c4; // Character -> char (Unboxing Conversion) + char -> double (Widening Primitive Conversion)

    // 6. If the expression is a compile-time constant expression of byte, short, char, int, then
    //    Narrowing Primitive Conversion Optionally Followed By Boxing Conversion
    byte b2 = 10;       // int -> byte
    Byte b3 = 10;       // int -> byte (Narrowing Primitive Conversion) + byte -> Byte (Boxing Conversion)

    byte b4 = 'c';      // char -> byte
    Byte b5 = 'c';      // char -> byte (Narrowing Primitive Conversion) + byte -> Byte (Boxing Conversion)
}