import java.awt.*;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class RectangleFun {
    public static void main(String[] args) {

        Scanner rf= new Scanner(System.in);
        System.out.println("Width: ");
        int width= rf.nextInt();
        System.out.println("Height: ");
        int height= rf.nextInt();
        System.out.println("X: ");
        int x= rf.nextInt();
        System.out.println("Y: ");
        int y= rf. nextInt();

        Rectangle r= new Rectangle(x,y,width,height);
        double perimeter= (r.getWidth()+ r.getHeight())*2;
        System.out.println("Perimeter= " + perimeter);
        r.setLocation(x-4, y+4);
        System.out.println("New Location is "+ "("+r.getX()+","+r.getY()+")");


        



    }
}
