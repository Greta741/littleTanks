/**
 * @(#) GrenadeLauncher.java
 */

package tanks;

public class GrenadeLauncher implements IBombShoot
{
    @Override
    public void launchGrenade() {
        System.out.println("Launching a grenade");
    }

    @Override
    public void launchRocket() {
    }
}
