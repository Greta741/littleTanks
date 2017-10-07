/**
 * @(#) MapSingleton.java
 */

package tanks;

import javax.swing.JFrame;

public final class MapSingleton
{	
	private static MapSingleton instance = new MapSingleton();
        private JFrame gameMap;
        
        private MapSingleton()
        {
            gameMap = new JFrame();
            gameMap.setBounds(10, 10, 700, 600);
            gameMap.setTitle("Little tanks");
            gameMap.setResizable(false);
            gameMap.setVisible(true);
            gameMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        }
        
	public static MapSingleton getInstance( )
	{
            return instance;
	}
        
        public JFrame getGameMap()
        {
            return gameMap;
        }
	
}
