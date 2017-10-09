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
        
        private TankFactory tankFactory;
        
        public Game() {
            gameMap = MapSingleton.getInstance();
            MapGraphics gameGraphics = new MapGraphics();
            gameMap.getGameMap().add(gameGraphics);
            
            tankFactory = new TankFactory();
            tankCommander = new TankCommander();
            // --- For testing only
//            ITank testTank1 = new Tank();
//            ITank testTank2 = new Tank();
            
            ITank player = tankFactory.createTank("PLAYER");    
            ITank enemy = tankFactory.createTank("ENEMY");
            
            tankCommander.register(player);
            tankCommander.register(enemy);
            tankCommander.notifyTanks();
            
//            tankCommander.register(testTank1);
//            tankCommander.register(testTank2);
//            tankCommander.notifyTanks();
//            tankCommander.unregister(testTank2);
//            tankCommander.notifyTanks();
            // ---
            
        }

	public void draw( )
	{
		
	}
		
}
