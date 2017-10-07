/**
 * @(#) TankCommander.java
 */

package tanks;

import java.util.ArrayList;
import java.util.List;

public class TankCommander
{
	private List<ITank> tanksList = new ArrayList<ITank>();
	
	public void register( ITank tank )
	{
		tanksList.add(tank);
	}
	
	public void unregister( ITank tank )
	{
		tanksList.remove(tank);
	}
	
	public void notifyTanks( )
	{
            for (ITank tank: tanksList) {
                tank.update();
            }
	}
		
}
