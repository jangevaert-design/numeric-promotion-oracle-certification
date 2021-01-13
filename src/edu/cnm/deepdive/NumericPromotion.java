package edu.cnm.deepdive;

public class NumericPromotion {

  public static void main(String[] args) {
    // promotion is converting smaller primitive types into bigger primitive types.
    int x = 5;
    double y = 10.55;
    System.out.println("x + y = " + (x + y));// gives 10.55 because of promotion of int 5 to
    //to double 5.0.

    byte b = 10;
    int c = 5;
    double d = 4.5;

    double result = b + c + d;
    System.out.println("result = " + result); // gives 19.5 because byte and int promoted to double.

    //casting is the opposite of promotion.
    //casting is converting a bigger primitive type into a smaller primitive type.
    double myDouble = 4.55;
    //int myInt = 4 + myDouble; gives a compilation error because double does not fit in int.
    int myInt = 4 + (int) myDouble;// we have cast the double into an int and 4.55 has been
    //truncated to 4; so result is 8.

    int anotherInt = 125;
    byte myByte = 15;

    int intResult = anotherInt + myByte; //no compilation error because byte is widened to int
    //byte byteResult = anotherInt + myByte; gives compilation error because we try to fit an int
    // into a byte. Solution below:
    byte byteResult = (byte) (anotherInt + myByte);

    System.out.println("intResult = " + intResult);// gives 140 because 125 + 15 = 140.
    System.out.println("byteResult = " + byteResult); // gives -116 because byte can only hold
    //values to 127, so after 127 it overflows to -128 and start counting further the missing
    // 13 (140 - 127) towards zero with a result of -116.

  }

}
