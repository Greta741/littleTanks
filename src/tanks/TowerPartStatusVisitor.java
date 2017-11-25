/**
 * @(#) TowerPartStatusVisitor.java
 */

package tanks;

public class TowerPartStatusVisitor implements TowerPartVisitor
{
        @Override
	public void visit( Tower tower )
	{
            System.out.println("Visiting tower, name: " + tower.name);
	}
	
        @Override
	public void visit( TowerKeeper towerKeeper )
	{
            System.out.println("Visiting tower keeper, name: " + towerKeeper.name);
	}
	
        @Override
	public void visit( TowerCannon towerCannon )
	{
            System.out.println("Visiting tower cannon, type: " + towerCannon.type);		
	}
	
	
}
