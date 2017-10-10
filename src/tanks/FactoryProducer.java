/**
 * @(#) FactoryProducer.java
 */

package tanks;

public class FactoryProducer
{
	public static AbstractFactory getFactory( String type )
	{
	    switch(type) {
                case "TANK":
                    return new TankFactory();
                case "WEAPON":
                    return new WeaponFactory();
                default:
                    return null;
            }
	}
}
