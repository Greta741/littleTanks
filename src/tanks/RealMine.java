/**
 * @(#) RealMine.java
 */

package tanks;

public class RealMine implements Mine
{
	private int power;
	
	private int radius;
	
	private int damage;
	
	public RealMine( int power )
	{
		this.power = power;
                calculateProperties();
	}
	
	public void explode( )
	{
            System.out.println("Mine is exploding. Radius: " + radius + " Damage: " + damage);
	}
	
	private void calculateProperties( )
	{
		radius = power * 3;
                damage = power * 5;
	}
		
}
