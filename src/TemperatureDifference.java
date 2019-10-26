import java.util.Scanner;
public class TemperatureDifference {
    public static void main(String[] args) {


        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter the first temperature: " );
        int t1= temperature.nextInt();
        System.out.println("Enter the second temperature: ");
        int t2= temperature.nextInt();
        int change= t1-t2;
        System.out.println("The temperature changed " + Math.abs(change)+ " degrees");


    }
}
