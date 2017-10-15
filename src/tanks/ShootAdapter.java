/**
 * @(#) ShootAdapter.java
 */

package tanks;

public class ShootAdapter implements IShoot
{
    private IBombShoot bombShoot;

    public void shoot( String bullet )
    {
        if (bullet.equals("grenade")) {
            bombShoot = new GrenadeLauncher();
            bombShoot.launchGrenade();
        } else if (bullet.equals("rocket")) {
            bombShoot = new RocketLauncher();
            bombShoot.launchRocket();
        }
    }
}
