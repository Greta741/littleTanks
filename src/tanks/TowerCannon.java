/**
 * @(#) TowerCannon.java
 */

package tanks;

public class TowerCannon implements TowerParts
{
        public String type = "7";
        
        @Override
	public void accept( TowerPartVisitor towerPartVisitor )
	{
            towerPartVisitor.visit(this);
	}
}
