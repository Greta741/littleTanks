/**
 * @(#) RandomMovement.java
 */

package tanks;
import java.util.Random;

public class RandomMovement implements IMovementAlgorithm
{
    @Override
    public void Move(char direction)
    {
        Random rand = new Random();
        switch(rand.nextInt(2)) {
            case 0:
                switch(direction) {
                    case 'S':
                        System.out.println("Enemy moved one position down");
                        break;
                    case 'W':
                        System.out.println("Enemy moved one position to the left");
                        break;
                    case 'N':
                        System.out.println("Enemy moved one position up");
                        break;
                    case 'E':
                        System.out.println("Enemy moved one position to the right");
                        break;
                    default:
                        System.out.println("Bad direction");
                        break;
                }
                break;
            case 1:
                switch(direction) {
                    case 'S':
                        System.out.println("Enemy moved two positions down");
                        break;
                    case 'W':
                        System.out.println("Enemy moved two positions to the left");
                        break;
                    case 'N':
                        System.out.println("Enemy moved two positions up");
                        break;
                    case 'E':
                        System.out.println("Enemy moved two positions to the right");
                        break;
                    default:
                        System.out.println("Bad direction");
                        break;
                }
        }
    }	
}
