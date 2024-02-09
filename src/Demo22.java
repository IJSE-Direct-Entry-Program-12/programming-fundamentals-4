void main(){
    int myInt = 10;

    // Any Data Type -> String
    String myStr = myInt + "";
    String myStr2 = String.valueOf(myInt);

    String myStr3 = "-250";
    int myInt2 = Integer.valueOf(myStr3);
    int myInt3 = Integer.parseInt(myStr3);
    System.out.println(myInt2);
    System.out.println(myInt3);


}