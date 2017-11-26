/**
 * @(#) InitGameService.java
 */

package tanks;

public class InitSoldiersNamesService implements IInitSoldiersNamesService
{
        private int bossCount;
        private int bossSoldiersCount;
        private int companionSoldiersCount;
        private String[] names = {"F-11", "F-10", "F-9", "F-8", "F-7", "F-6", "F-5", "F-4", "F-3", "F-2", "F-1"};
        
	public void initialize( )
	{
            this.bossCount = 0;
            this.bossSoldiersCount = 0;
            this.companionSoldiersCount = 0;
	}
        
        @Override
        public String getBossName()
        {
            bossCount++;
            return names[bossCount + bossSoldiersCount + companionSoldiersCount - 1] + ": Boss";
        }
        
        @Override
        public String getBoosSoldierName()
        {
            return names[bossCount + bossSoldiersCount++ + companionSoldiersCount] + ": BossSoldier_" + bossSoldiersCount;
        }
        
        @Override
        public String getSoldierCompanionName(int soldier)
        {
            return names[bossCount + bossSoldiersCount + companionSoldiersCount++] + ": Soldier_" + soldier + "_Companion_" + (companionSoldiersCount - (soldier - 1) * bossSoldiersCount);
        }
	
}
