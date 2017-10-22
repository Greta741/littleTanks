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
    
    public void drive(Tile[][] map)
    {
        this.movement.Move(map);
    }
    
    @Override
    public void update() {
        if (movement instanceof MoveAroundMapEdge) {
            super.update();
            System.out.println("This is enemy tank that moves around map edge");
        } else {
            super.update();
            System.out.println("This is enemy tank that moves towards player");
        }
    }

    @Override
    public Object clone() {
        if (movement instanceof MoveAroundMapEdge) {
            return new Enemy(new MoveAroundMapEdge());
        } else {
            return new Enemy(new MoveTowardsPlayer());
        }
    }
}
