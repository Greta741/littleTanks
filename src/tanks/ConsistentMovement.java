/**
 * @(#) ConsistentMovement.java
 */

package tanks;

public class ConsistentMovement implements IMovementAlgorithm
{
    @Override
    public void Move(char direction)
    {
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
    }
	
}
