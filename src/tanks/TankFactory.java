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
                    case "MAP":
                        return new Enemy(new MoveAroundMapEdge());
                    case "TOWARDSPLAYER":
                        return new Enemy(new MoveTowardsPlayer());
                }
            default:
                return null;
        }   
    }
}
