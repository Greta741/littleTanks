/**
 * @(#) Game.java
 */

package tanks;

public class Game
{
	private MapSingleton gameMap;

	private Enemy randomMovementTank;

	private Enemy consistentMovementTank;

	private Player playerTank;

	private TankCommander tankCommander;
        
        public Game() {
            gameMap = MapSingleton.getInstance();
            MapGraphics gameGraphics = new MapGraphics();
            gameMap.getGameMap().add(gameGraphics);
            
            tankCommander = new TankCommander();
            // --- For testing only
            ITank testTank1 = new Tank();
            ITank testTank2 = new Tank();
            tankCommander.register(testTank1);
            tankCommander.register(testTank2);
            tankCommander.notifyTanks();
            tankCommander.unregister(testTank2);
            tankCommander.notifyTanks();
            // ---
            
        }

	public void draw( )
	{
		
	}
		
}
