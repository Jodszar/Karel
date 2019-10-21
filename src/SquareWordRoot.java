import java.util.Scanner;
/*
Jodie Azar
October 16, 2019
 */

public class SquareWordRoot {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String srw= word.next();   // swr means square root word.
        double sqrtednum= Math.sqrt(srw.length())+0.5; // the 0.5 is to round the number to a whole number.
        String sqrtedword= srw.substring((int)(sqrtednum),(int)(sqrtednum)+1);
        System.out.print("The \"square root\" of "+srw+" is "+sqrtedword);

    }
}
