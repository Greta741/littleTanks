/**
 * @(#) Tower.java
 */

package tanks;

public class Tower implements TowerParts
{
	private TowerParts[] parts;
        public String name = "Test tower";
	
	public Tower( )
	{
		parts = new TowerParts[] {new TowerCannon(), new TowerKeeper()};
	}
	
        @Override
	public void accept( TowerPartVisitor towerPartVisitor )
	{
            for (int i = 0; i < parts.length; i++) {
                parts[i].accept(towerPartVisitor);
            }
            towerPartVisitor.visit(this);
	}
	
}
