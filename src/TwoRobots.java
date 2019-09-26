import becker.robots.*;

import javax.swing.text.Caret;
import java.util.concurrent.Callable;

public class TwoRobots {

    public static void main(String[] args) {

        City NewYork = new City();

        Robot karel = new Robot(NewYork, 0, 0, Direction.SOUTH, 1);
        Robot Carl= new Robot(NewYork,  0, 3, Direction.EAST, 0);

        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        Carl.pickThing();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.move();
        Carl.move();
        Carl.putThing();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.move();
        Carl.move();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();





    }
}
