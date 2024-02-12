void main(){
    boolean myPrimitiveBoolean = true;
    // Boolean myWrapperBoolean = new Boolean(myPrimitiveBoolean);
    Boolean myWrapperBoolean = Boolean.valueOf(myPrimitiveBoolean);     // Boxing

    byte myPrimitiveByte = 10;
    // Byte myWrapperByte = Byte.valueOf(myPrimitiveByte);               // Boxing
    Byte myWrapperByte = myPrimitiveByte;                               // Autoboxing

    short myPrimitiveShort = 20;
    // Short myWrapperShort = Short.valueOf(myPrimitiveShort);
    Short myWrapperShort = myPrimitiveShort;

    char myPrimitiveChar = 'c';
    // Character myWrapperCharacter = Character.valueOf(myPrimitiveChar);
    Character myWrapperCharacter = myPrimitiveChar;

    int myPrimitiveInt = 10;
    //Integer myWrapperInteger = Integer.valueOf(myPrimitiveInt);
    Integer myWrapperInteger = myPrimitiveInt;

    long myPrimitiveLong = 20;
    // Long myWrapperLong = Long.valueOf(myPrimitiveLong);      // Boxing (Explicit)
    Long myWrapperLong = myPrimitiveLong;                       // Boxing (Implicit = Auto) -> Autoboxing

    float myPrimitiveFloat = 2.f;
    // Float myWrapperFloat = Float.valueOf(myPrimitiveFloat);
    Float myWrapperFloat = myPrimitiveFloat;

    double myPrimitiveDouble = 23.;
    // Double myWrapperDouble = Double.valueOf(myPrimitiveDouble);
    Double myWrapperDouble = myPrimitiveDouble;

}