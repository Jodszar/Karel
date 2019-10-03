import java.awt.*;
public class GrowSquarePrinter {
    public static void main(String[] args){

        int length=50;

        Rectangle square= new Rectangle(100,100,50,50);
        System.out.println(square);
        square.grow(25,25);
        square.translate(25,25);
        System.out.print(square);

    }
}
