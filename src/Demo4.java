void main(){
    int myInt = 10;
    double myDouble = 15.25;
    String myStr = "IJSE";
    short myShort = -15265;

    System.out.printf("INT FORMATTING: %+07d \n", myInt);
    System.out.printf("DOUBLE FORMATTING: %-+7.3f \n", myDouble);
    System.out.printf("STRING FORMATTING: %-7s \n", myStr);
    System.out.printf("SHORT FORMATTING: %+,010d \n", myShort);
    System.out.printf("FORMATTING:% d \n", myInt);
}