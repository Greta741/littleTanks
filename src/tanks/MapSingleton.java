/**
 * @(#) MapSingleton.java
 */

package tanks;

public final class MapSingleton
{	
	private static MapSingleton instance = new MapSingleton();
        
	public static MapSingleton getInstance( )
	{
            return instance;
	}
}
