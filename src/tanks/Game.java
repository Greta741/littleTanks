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
            System.out.println("Template design pattern");
            Plane bomber = new Bomber("B25J");
            bomber.fly();
            System.out.println("");
            Plane jet = new Jet("F-22");
            jet.fly();
            System.out.println("");
            /* End of template method */
            
            /* Composite */
            
            /* End of composite */
            System.out.println("Composite design pattern");
            PlaneComposite boss = new PlaneComposite(new Jet("F-11: Boss"));
            
            PlaneComposite bossSoldier1 = new PlaneComposite(new Jet("F-10: BossSoldier_1"));
            PlaneComposite bossSoldier2 = new PlaneComposite(new Jet("F-9: BossSoldier_2"));
            
            PlaneComposite soldier1Companion1 = new PlaneComposite(new Jet("F-8: Soldier_1_Companion_1"));
            PlaneComposite soldier1Companion2 = new PlaneComposite(new Jet("F-7: Soldier_1_Companion_2"));
            
            PlaneComposite soldier2Companion1 = new PlaneComposite(new Jet("F-6: Soldier_2_Companion_1"));
            PlaneComposite soldier2Companion2 = new PlaneComposite(new Jet("F-5: Soldier_2_Companion_2"));
            
            boss.add(bossSoldier1);
            boss.add(bossSoldier2);
            
            bossSoldier1.add(soldier1Companion1);
            bossSoldier1.add(soldier1Companion2);
            
            bossSoldier2.add(soldier2Companion1);
            bossSoldier2.add(soldier2Companion2);
            
            boss.printModel();
            for (PlaneComposite bossSoldier : boss.getPlanes())
            {
                bossSoldier.printModel();
                for (PlaneComposite soldierCompanion : bossSoldier.getPlanes())
                    soldierCompanion.printModel();
            }
            
            System.out.println("");
            /* Flyweight */
            System.out.println("Flyweight design pattern");
            PowerUpFactory powerupFactory = new PowerUpFactory();
            PowerUp shieldPowerup = (PowerUp)powerupFactory.getPowerUp("SHIELD");
            shieldPowerup.apply();
            /* End of flyweight */
            
            /* State */
            System.out.println();
            System.out.println("State design pattern");
            Context gameContext = new Context();
            gameContext.changeGameState();
            gameContext.changeGameState();
            gameContext.changeGameState();
            gameContext.changeGameState();
            System.out.println();
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
