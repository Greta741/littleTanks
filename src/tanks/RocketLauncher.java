/**
 * @(#) RocketLauncher.java
 */

package tanks;

public class RocketLauncher implements IBombShoot
{
    @Override
    public void launchRocket() {
        System.out.println("Launching a rocket");
    }

    @Override
    public void launchGrenade() {
    }
}
