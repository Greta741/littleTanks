/**
 * @(#) WeaponFactory.java
 */

package tanks;

public class WeaponFactory extends AbstractFactory
{
        @Override
	public Weapon createWeapon( String weapon )
	{
	    switch(weapon) {
                case "LASER":
                    return new Laser();
                case "CANNON":
                    return new Cannon();
                default:
                    return null;
            }
	}
        
        @Override
        public Tank createTank(String tank) {
            return null;
        }
}
