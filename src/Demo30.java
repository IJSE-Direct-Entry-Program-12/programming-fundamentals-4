import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Scanner;

void print(byte b){}

void main(){
    int x = (int) 10;               // Identity Conversion, optional
    byte b1 = (byte) 10;            // int->byte Narrowing Primitive Conversion, optional
    byte b2 = (byte) x;             // int->byte Narrowing Primitive Conversion, mandatory
    double d = (double) 10.25;      // Identity Conversion, optional
    double d2 = (double) x;         // int->double Widening Primitive Conversion, optional
    double d3 = (double) x / 3 * 3; // int->double Widening Primitive Conversion, mandatory
    byte b3 = (byte) 2.;            // double->byte Narrowing Primitive Conversion, mandatory
    int y = (int) (byte) 5.;
    // 1. double->byte Narrowing Primitive Conversion, mandatory
    // 2. byte->int Widening Primitive Conversion, optional
    int a = (int) (int) 3.;
    // 1. double->int Narrowing Primitive Conversion, mandatory
    // 2. int->int Identity Conversion, optional

    //============================================================================================

   // boolean flag1 = (boolean) 5.3;
   // boolean flag2 = (boolean) 1;

   // int myInt = (int) "ijse";     // use parseInt or valueOf, casting can't be used in this context
    String str = "10";
    // int myInt2 = (int) str;

    Object o1 = true;
    Object o2 = 10;
    Object o3 = 10.25;
    Object o4 = "IJSE";
    Object o5 = 125l;

    int myPrimitiveInt = 10;
    Integer myWrapperInt = Integer.valueOf(myPrimitiveInt);     // Boxing Conversion
    int myPrimitiveInt2 = myWrapperInt.intValue();              // Unboxing Conversion

    //Scanner myScanner = (Scanner) (Object) 10;
//    short myShort2 = 10;
//    Short myShort = 10;

   // String str2 = (String) new Scanner(System.in);
//    Number n = 55;
//    Integer i = (Integer) n;
//    Number n2 = i;

//    Scanner scanner = null;
//    String str3 = (String) scanner;
//    BigDecimal bd = (BigDecimal) null;

    byte b4 = 10;
    long l = (Byte) b4;

    long l2 = 20;
    int i3 = (int) (long) l2;

    Integer myInt = 20;
    Long myLong = (Long) (long) (int) myInt;
}