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
        
        private HealthInvoker healthInvoker;
        
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
            Weapon multitoolWeapon = new Weapon();
            multitoolWeapon.shoot("laser");
            multitoolWeapon.shoot("bullet");
            multitoolWeapon.shoot("rocket");
            multitoolWeapon.shoot("grenade");
            System.out.println();
            /* End of adapter */
            
            /* Facade */
            System.out.println("Map before decorating:");
            Tile[][] map = gameMap.getInstance().getGameMap();
            for (Tile[] map1 : map) {
                for (Tile map11 : map1) {
                    System.out.print(map11.getTile());
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("Map after decorating:");
            for (Tile[] map1 : map) {
                for (Tile map11 : map1) {
                    map11.drawTile();
                }
                System.out.println("");
            }
            System.out.println("");
            /* End of facade */
            
            /* Decorator */
            System.out.println("Update shielded tank:");
            ITank shieldedTank = new ShieldedTankDecorator(playerTank);
            shieldedTank.update();
            System.out.println("");
            /* End of decorator */
            
            /* Command */
            System.out.println("Update tank health:");
            
            HealthInvoker healthInvoker = new HealthInvoker();
            HealTank healTankOrder = new HealTank((Tank) playerTank, 10);
            DamageTank damageTankOrder = new DamageTank((Tank) playerTank, 12);
            
            healthInvoker.takeOrder(damageTankOrder);
            healthInvoker.takeOrder(healTankOrder);
            healthInvoker.takeOrder(damageTankOrder);
            
            playerTank.update();
            healthInvoker.placeOrders();
            playerTank.update();
            System.out.println("");
            /* End of command */
            
            /* Prototype */
            Enemy enemyPrototype = new Enemy(new ConsistentMovement());
            Enemy enemyClone = (Enemy) enemyPrototype.clone();
            enemyPrototype.update();
            enemyClone.update();
            /* End of prototype */
        }

	public void draw( )
	{
		
	}
		
}
