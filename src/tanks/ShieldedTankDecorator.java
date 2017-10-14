/**
 * @(#) ShieldedTankDecorator.java
 */

package tanks;

public class ShieldedTankDecorator extends TankDecorator
{
    public ShieldedTankDecorator(ITank decoratedTank) {
        super(decoratedTank);
    }
    
    @Override
    public void update() {
        System.out.println("Updating decorated tank");
        updateShield();
    }
    
    public void updateShield( )
    {
        System.out.println("Update shield");
    }
	
	
}
