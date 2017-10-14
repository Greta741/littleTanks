/**
 * @(#) MapSingleton.java
 */

package tanks;

public final class MapSingleton
{	
	private static MapSingleton instance = new MapSingleton();
        
        private MapSingleton(){}
        
	public static MapSingleton getInstance( )
	{
            return instance;
	}
}
