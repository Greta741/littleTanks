/**
 * @(#) Enemy.java
 */

package tanks;

public class Enemy extends Tank
{
    private IMovementAlgorithm movement;
    
    public Enemy(IMovementAlgorithm movement)
    {
        this.movement = movement;
    }
}
