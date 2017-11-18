/**
 * @(#) ProxyMine.java
 */

package tanks;

public class ProxyMine implements Mine
{
	private int power;
	
	private RealMine realMine;
	
	public ProxyMine( int power )
	{
            this.power = power;
	}
	
	public void explode( )
	{
            if (realMine == null) {
                System.out.println("Create mine");
                realMine = new RealMine(power);
            }
            realMine.explode();
	}
	
}
