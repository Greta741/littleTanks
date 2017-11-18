/**
 * @(#) Game.java
 */

package tanks;

public class Game
{
	private MapSingleton gameMap;

	private ITank moveAroundMapEdgeEnemyTank;

	private ITank moveTowardsPlayerEnemyTank;

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
            System.out.println("Factory design pattern");
            System.out.println("Creation of tanks:");
            playerTank = tankFactory.createTank("PLAYER", null);    
            moveAroundMapEdgeEnemyTank = tankFactory.createTank("ENEMY", "MAP");
            moveTowardsPlayerEnemyTank = tankFactory.createTank("ENEMY", "TOWARDSPLAYER");
            System.out.println("");
            
            Weapon laser = weaponFactory.createWeapon("LASER");
            Weapon cannon = weaponFactory.createWeapon("CANNON");
            /* End of factory */
            
            /* Observer */
            System.out.println("Observer design pattern");
            tankCommander = new TankCommander();
            System.out.println("Notify all tanks:");
            tankCommander.register(playerTank);
            tankCommander.register(moveAroundMapEdgeEnemyTank);
            tankCommander.register(moveTowardsPlayerEnemyTank);
            tankCommander.notifyTanks();
            System.out.println("Notify only enemy tanks:");
            tankCommander.unregister(playerTank);
            tankCommander.notifyTanks();
            System.out.println("");
            /* End of observer */
            
            /* Strategy */
            System.out.println("Strategy design pattern");
            System.out.println("Movement strategy of moveAroundMapEdgeEnemyTank:");
            ((Enemy)moveAroundMapEdgeEnemyTank).drive(gameMap.getGameMap());
            System.out.println("Movement strategy of moveTowardsPlayerEnemyTank:");
            ((Enemy)moveTowardsPlayerEnemyTank).drive(gameMap.getGameMap());
            System.out.println("");
            /* End of strategy */
            
            /* Adapter */
            System.out.println("Adapter design pattern");
            Weapon multitoolWeapon = new Weapon();
            multitoolWeapon.shoot("laser");
            multitoolWeapon.shoot("bullet");
            multitoolWeapon.shoot("rocket");
            multitoolWeapon.shoot("grenade");
            System.out.println();
            /* End of adapter */
            
            /* Facade */
            System.out.println("Facade design patten");
            System.out.println("Map before decorating:");
            Tile[][] map = gameMap.getGameMap();
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
            System.out.println("Decorator design pattern");
            System.out.println("Update shielded tank:");
            ITank shieldedTank = new ShieldedTankDecorator(playerTank);
            shieldedTank.update();
            System.out.println("");
            /* End of decorator */
            
            /* Command */
            System.out.println("Command design pattern");
            System.out.println("Update tank health:");
            
            healthInvoker = new HealthInvoker();
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
            System.out.println("Prototype design pattern");
            Enemy enemyPrototype = new Enemy(new MoveTowardsPlayer());
            Enemy enemyClone = (Enemy) enemyPrototype.clone();
            enemyPrototype.update();
            enemyClone.update();
            System.out.println("");
            /* End of prototype */
            
            /* Template method */
            /* End of template method */
            
            /* Composite */
            /* End of composite */
            
            /* Flyweight */
            /* End of flyweight */
            
            /* State */
            /* End of state */
            
            /* Proxy */
            System.out.println("Proxy design pattern");
            Mine mine = new ProxyMine(5);
            mine.explode();
            mine.explode();
            /* End of proxy */
        }

	public void draw( )
	{
		
	}
		
}
