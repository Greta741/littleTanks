/**
 * @(#) HealTank.java
 */

package tanks;

public class HealTank implements IHealthOrder
{
    private int amount;

    private Tank tank;

    public HealTank( Tank tank, int amount )
    {
        this.tank = tank;
        this.amount = amount;
    }

    public void execute( )
    {
        tank.updateLives(amount);
    }
}
