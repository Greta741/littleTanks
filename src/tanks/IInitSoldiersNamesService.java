/**
 * @(#) IInitGameService.java
 */

package tanks;

public interface IInitSoldiersNamesService
{
	void initialize( );
	
        String getBossName();
        
        String getBoosSoldierName();
        
        String getSoldierCompanionName(int soldier);
	
}
