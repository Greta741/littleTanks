/**
 * @(#) Game.java
 */

package tanks;

public class Game
{
	private MapSingleton gameMap;

	private ITank randomMovementEnemyTank;

	private ITank consistentMovementEnemyTank;

	private ITank playerTank;

	private TankCommander tankCommander;
        
        private AbstractFactory tankFactory;
        
        private AbstractFactory weaponFactory;
        
        public Game() {
            
            /* Singleton */
            gameMap = MapSingleton.getInstance();
            /* End of singleton */
            
            /* Abstract factory */
            tankFactory = FactoryProducer.getFactory("TANK");
            weaponFactory = FactoryProducer.getFactory("WEAPON");
            /* End of abstract factory */
            
            /* Factory */
            System.out.println("Creation of tanks:");
            playerTank = tankFactory.createTank("PLAYER", null);    
            randomMovementEnemyTank = tankFactory.createTank("ENEMY", "RANDOM");
            consistentMovementEnemyTank = tankFactory.createTank("ENEMY", "CONSISTENT");
            System.out.println("");
            
            Weapon laser = weaponFactory.createWeapon("LASER");
            Weapon cannon = weaponFactory.createWeapon("CANNON");
            /* End of factory */
            
            /* Observer */
            tankCommander = new TankCommander();
            System.out.println("Notify all tanks:");
            tankCommander.register(playerTank);
            tankCommander.register(randomMovementEnemyTank);
            tankCommander.register(consistentMovementEnemyTank);
            tankCommander.notifyTanks();
            System.out.println("Notify only enemy tanks:");
            tankCommander.unregister(playerTank);
            tankCommander.notifyTanks();
            System.out.println("");
            /* End of observer */
            
            /* Strategy */
            System.out.println("Movement strategy of randomMovementEnemyTank:");
            ((Enemy)randomMovementEnemyTank).drive('S');
            System.out.println("Movement strategy of consistentMovementEnemyTank:");
            ((Enemy)consistentMovementEnemyTank).drive('W');
            System.out.println("");
            /* End of strategy */
            
            /* Adapter */
            
            
            /* End of adapter */
            
            /* Decorator */
            System.out.println("Update shielded tank:");
            ITank shieldedTank = new ShieldedTankDecorator(playerTank);
            shieldedTank.update();
            System.out.println("");
            /* End of decorator */
            
        }

	public void draw( )
	{
		
	}
		
}
