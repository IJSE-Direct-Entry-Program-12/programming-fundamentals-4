void main(){
    int x = 10;
    int y = 20;

    // 1. Identity Conversion
    System.out.println(x + y);      // int + int
    System.out.println(2.5 + 3.);   // double + double

    // 2. Widening Primitive Conversion
    System.out.println(x + 2.);     // int + double => double + double
    System.out.println(y + 2l + 2.f);
    /*  (y) int     + (2l) long     + (2.f) float
             ↓          ↓               ↓
        (y) long    + (2l) long     + (2.f) float
                   ↓                    ↓
        (y + 2l) long               + (2.f) float
                   ↓                    ↓
        (y + 2l) float              + (2.f) float -> float
     */

    // 3. Unboxing Conversion Optionally Followed By Widening Primitive Conversion
    Integer i = 10;
    Byte b = 20;
    System.out.println(i + b + 2.);
    /*  (i) Integer     + (b) Byte      + (2.) double
              ↓               ↓                 ↓
        (i) int         + (b) byte      + (2.) double
              ↓               ↓                 ↓
        (i) int           (b) int       + (2.) double
                    ↓                           ↓
        (i+b) int                       + (2.) double
                    ↓                           ↓
        (i+b) double                    + (2.) double -> double
     */

    Character n = 10;
    System.out.println(n + 10);

}