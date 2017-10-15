/**
 * @(#) DamageTank.java
 */

package tanks;

public class DamageTank implements IHealthOrder
{
    private int amount;

    private Tank tank;

    public DamageTank( Tank tank, int amount )
    {
        this.tank = tank;
        this.amount = amount;
    }

    public void execute( )
    {
        tank.updateLives(-amount);
    }
}
