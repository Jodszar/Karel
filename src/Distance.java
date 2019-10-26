import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {

        Scanner Dis= new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        int firstx= Dis.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int firsty= Dis.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int secondx=Dis.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int secondy= Dis.nextInt();
        double xcoord= Math.pow(secondx-firstx,2);
        double ycoord= Math.pow(secondy-secondx,2);
        double distance= Math.sqrt(xcoord+ycoord);
        System.out.println("The distance between ("+firstx+ " , " +firsty+") and (" +secondx+ " , " +secondy+ ") is " +distance);

    }
}
