/**
 * @(#) TowerKeeper.java
 */

package tanks;

public class TowerKeeper implements TowerParts
{
        public String name = "Tom";

        @Override
	public void accept( TowerPartVisitor towerPartVisitor )
	{
            towerPartVisitor.visit(this);		
	}
}
