/**
 * @(#) PowerUpFactory.java
 */

package tanks;

import java.util.HashMap;

public class PowerUpFactory
{
    private static final HashMap<String, IPowerUp> powerUpList = new HashMap();

    public static IPowerUp getPowerUp( String type )
    {
        PowerUp powerup = (PowerUp)powerUpList.get(type);
        
        if(powerup == null) {
           powerup = new PowerUp(type, 0, 0);
           powerUpList.put(type, powerup);
           System.out.println("Creating powerup of type : " + type);
        }
        return powerup;
    }
}
