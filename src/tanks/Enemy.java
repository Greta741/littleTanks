/**
 * @(#) Enemy.java
 */

package tanks;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Enemy extends Tank implements IClone
{
    private IMovementAlgorithm movement;
    
    public Enemy(IMovementAlgorithm movement)
    {
        System.out.println("Enemy tank");
        this.movement = movement;
    }
    
    public void drive(char direction)
    {
        this.movement.Move(direction);
    }
    
    @Override
    public void update() {
        if (movement instanceof RandomMovement) {
            super.update();
            System.out.println("This is enemy tank with random movement");
        } else {
            super.update();
            System.out.println("This is enemy tank with consistent movement");
        }
    }

    @Override
    public Object clone() {
        if (movement instanceof RandomMovement) {
            return new Enemy(new RandomMovement());
        } else {
            return new Enemy(new ConsistentMovement());
        }
    }
}
