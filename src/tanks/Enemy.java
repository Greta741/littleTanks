/**
 * @(#) Enemy.java
 */

package tanks;

public class Enemy extends Tank
{
    private IMovementAlgorithm movement;
    
    public Enemy(IMovementAlgorithm movement)
    {
        System.out.println("Enemy tank");
        this.movement = movement;
    }
    
    public IMovementAlgorithm getMovement()
    {
        return this.movement;
    }
}
