import java.util.Scanner;
public class FindThePower {
    public static void main(String[] args) {

        Scanner BE= new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base= BE.nextInt();
        System.out.println("Enter the exponent: ");
        int expo= BE.nextInt();
        double mp= Math.pow(base,expo);
        System.out.println(base+"^"+expo+"= "+mp);

    }
}
