/**
 * @(#) MapSingleton.java
 */

package tanks;

public final class MapSingleton
{	
	private static MapSingleton instance = new MapSingleton();
        
        /* 0 - empty
           1 - wall
           2 - bushes */
        private Tile[][] gameMap = new Tile[][] {
            {new Tile(1), new Tile(1), new Tile(1), new Tile(1), new Tile(1)},
            {new Tile(1), new Tile(0), new Tile(0), new Tile(0), new Tile(1)},
            {new Tile(1), new Tile(0), new Tile(2), new Tile(2), new Tile(1)},
            {new Tile(1), new Tile(0), new Tile(0), new Tile(0), new Tile(1)},
            {new Tile(1), new Tile(1), new Tile(1), new Tile(1), new Tile(1)},
        };
        
        private MapSingleton() {}
        
	public static MapSingleton getInstance( )
	{
            return instance;
	}
        
        public Tile[][] getGameMap() {
            return instance.gameMap;
        }
}
