import java.util.Scanner;

public class SeparatingDigits {
    public static int quotient( int entered){
        int number= entered/10;
        return number;
    }
    public static int remainder (int entered) {
        int number= entered%10;
        return number;
    }
    public static void main(String [] arges ){
        Scanner sd= new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int total = sd.nextInt();
        int first= remainder(total);
        int firstremainder= quotient(total);
        int second= remainder(firstremainder);
        int secondremainder= quotient(firstremainder);
        int third= remainder(secondremainder);
        int thirdremainder= quotient(secondremainder);
        int fourth= remainder(thirdremainder);
        int fr= quotient(thirdremainder);
        System.out.print(fourth+" "+third+" "+second+" "+first);





    }

}
