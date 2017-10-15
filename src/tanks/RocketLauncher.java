/**
 * @(#) RocketLauncher.java
 */

package tanks;

public class RocketLauncher implements IBombShoot
{
    public void launchRocket() {
        System.out.println("Launching a rocket");
    }

    @Override
    public void launchGrenade() {
    }
}
