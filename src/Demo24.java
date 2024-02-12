void main(){
    byte b = 10;
    int x = b;              // Widening primitive conversion

    short s = b;            // Widening primitive conversion

    int y = x;              // Identity Conversion
    char c = 'c';
    x = c;                  // Widening primitive conversion

    long l = y;             // Widening primitive conversion
    long l2 = 20;           // Widening primitive conversion

    float f = 10;           // Widening primitive conversion
    // Although the bit sizes are same here, we still call this as a widening primitive conversion
    // But Why?

    float f2 = l;           // Widening primitive conversion
    // A float bit size is 32 bits and a long bit size is 64 bits
    // How the heck does this still refer as a widening primitive conversion?
}