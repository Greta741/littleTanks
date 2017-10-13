/**
 * @(#) TankFactory.java
 */

package tanks;

public class TankFactory extends AbstractFactory
{
    @Override
    public Tank createTank( String tank, String movement )
    {
        switch(tank)
        {
            case "PLAYER":
                return new Player();
            case "ENEMY":
                switch(movement)
                {
                    case "RANDOM":
                        return new Enemy(new RandomMovement());
                    case "CONSISTENT":
                        return new Enemy(new ConsistentMovement());
                }
            default:
                return null;
        }   
    }
}
