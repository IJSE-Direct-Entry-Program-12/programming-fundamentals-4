import java.io.Serializable;

void main(){
    Boolean myWrapperBoolean = true;
    //boolean myPrimitiveBoolean = myWrapperBoolean.booleanValue();       // Unboxing (Explicit)
    boolean myPrimitiveBoolean = myWrapperBoolean;                        // Unboxing (Implicit) -> Auto-unboxing

    //Byte myWrapperByte = (byte) 10;     // Narrowing Primitive Conversion + (Auto) Boxing Conversion
    Byte myWrapperByte = 10;              // Narrowing Primitive Conversion Optionally Followed by Boxing Conversion
    //byte myPrimitiveByte = myWrapperByte.byteValue();
    byte myPrimitiveByte = myWrapperByte;

    //Short myWrapperShort = (short) 10;
    Short myWrapperShort = 10;
    //short myPrimitiveShort = myWrapperShort.shortValue();
    short myPrimitiveShort = myWrapperShort;

    Character myWrapperCharacter = 'c';
    //char myPrimitiveChar = myWrapperCharacter.charValue();
    char myPrimitiveChar = myWrapperCharacter;

    Integer myWrapperInteger = 10;
    //int myPrimitiveInt = myWrapperInteger.intValue();
    int myPrimitiveInt = myWrapperInteger;

    Long myWrapperLong = 10L;
    //long myPrimitiveLong = myWrapperLong.longValue();     // Unboxing (Explicit) Conversion
    long myPrimitiveLong = myWrapperLong;                   // Unboxing (Implicit - Auto) -> Auto Unboxing

    Float myWrapperFloat = 2.f;
    //float myPrimitiveFloat = myWrapperFloat.floatValue();
    float myPrimitiveFloat = myWrapperFloat;

    Double myWrapperDouble = 2.;
    //double myPrimitiveDouble = myWrapperDouble.doubleValue();
    double myPrimitiveDouble = myWrapperDouble;

    // Identity Conversion
    // Widening Primitive Conversion
    // Narrowing Primitive Conversion
    // Widening Narrowing Primitive Conversion
    // Boxing Conversion
    // Unboxing Conversion
    // Widening Reference Conversion
    // Narrowing Reference Conversion

    // Boxing Conversion Optionally Followed By Widening Reference Conversion
    Short s = 10;
    Number s2 = 10;
    Object o3 = 10;
    Serializable s4 = 10;
    Comparable c5 = 10;

   // Number n = o3;

    // Unboxing Conversion Optionally Followed By Widening Primitive Conversion
    Byte b = 10;
    float f = b;

    // 1. Identity Conversion
    // 2. Widening Primitive Conversion
    // 3. Widening Reference Conversion
    // 4. Boxing Conversion Optionally Followed By Widening Reference Conversion
    // 5. Unboxing Conversion Optionally Followed By Widening Primitive Conversion
    // 6. Narrowing Primitive Conversion Optionally Followed By Boxing Conversion
}