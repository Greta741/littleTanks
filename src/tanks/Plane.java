/**
 * @(#) Plane.java
 */

package tanks;

public abstract class Plane
{
	private String name;
	
	public Plane( String name )
	{
		
	}
	
	public abstract void fly( );
	
	public abstract void flyRight( );
	
	public abstract void fire( );
	
	public abstract void flyLeft( );
	
	
}
