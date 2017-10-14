/**
 * @(#) TankDecorator.java
 */

package tanks;

public abstract class TankDecorator implements ITank
{
    protected ITank decoratedTank;
    
    public TankDecorator(ITank decoratedTank) {
        this.decoratedTank = decoratedTank;
    }
    
    public void update( )
    {
        decoratedTank.update();
    }	
}
