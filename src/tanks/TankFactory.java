/**
 * @(#) TankFactory.java
 */

package tanks;

public class TankFactory extends AbstractFactory
{
    @Override
    public Tank createTank( String tank )
    {
        switch(tank)
        {
            case "PLAYER":
                return new Player();
            case "ENEMY":
                return new Enemy(new ConsistentMovement());
            default:
                return null;
        }   
    }	
	
}
