import java.awt.*;
import java.util.Scanner;
public class PointsAndRectangles {
    public static void main(String[] args){

        Scanner coordinates= new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int xcoordinate=  coordinates.nextInt();

        System.out.print("Enter the y coordinates: ");
        int ycoordinate= coordinates.nextInt();

        System.out.print("Enter the Length: ");
        int length= coordinates.nextInt();

        System.out.print("Enter the Width: ");
        int width= coordinates.nextInt();

        Point jane= new Point( xcoordinate, ycoordinate);
        System.out.println(jane);

        Dimension joella= new Dimension( length, width);
        System.out.println(joella);

        Rectangle jolanda= new Rectangle(jane, joella);
        System.out.print(jolanda);

        










    }

}
