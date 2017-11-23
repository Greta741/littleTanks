/**
 * @(#) TowerPartVisitor.java
 */

package tanks;

public interface TowerPartVisitor
{
	void visit( Tower tower );
	
	void visit( TowerKeeper towerKeeper );
	
	void visit( TowerCannon towerCannon );
	
	
}
