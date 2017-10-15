/**
 * @(#) Weapon.java
 */

package tanks;

public class Weapon implements IShoot
{
	private int fireRate = 1;
	
	private int damage = 1;
        
        ShootAdapter shootAdapter;

    @Override
    public void shoot(String bullet) {
        
        if (bullet.equals("laser")) {
            System.out.println("Shooting a laser shot");
        } else if (bullet.equals("bullet")) {
            System.out.println("Shooting a bullet shot");
        } else if (bullet.equals("rocket") || bullet.equals("grenade")) {
            shootAdapter = new ShootAdapter();
            shootAdapter.shoot(bullet);
        }
    }
	
	
}
