import java.util.Random;

void main(){
    int x = 10;                 // Identity Conversion
    short s = (short) x;        // Narrowing Primitive Conversion Followed By Identity Conversion

    final int y = 10;
    byte b = y;                 // Implicit Narrowing Primitive Conversion

    final int z = new Random().nextInt();
    // byte b2 = z;             // This is not a compile-time constant expression

    byte b3 =  10;
    // float f = 10.;               // Even though this is a compile-time constant expression
                                    // this rule does not apply to floating point numbers
}