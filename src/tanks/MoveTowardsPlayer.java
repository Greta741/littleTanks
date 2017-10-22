/**
 * @(#) ConsistentMovement.java
 */

package tanks;

import static java.lang.Math.abs;

public class MoveTowardsPlayer implements IMovementAlgorithm
{
    @Override
    public void Move(Tile[][] map)
    {
        int startPositionX = -1;
        int startPositionY = -1;
        
        outerloop:
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j].getTile() == 0) {
                    startPositionX = j;
                    startPositionY = i;
                    break outerloop;
                }
            }
        }
        int playerX = 1;
        int playerY = 3;        
        
        int distanceX = playerX - startPositionX;
        int distanceY = playerY - startPositionY;
        int moves = abs(distanceX) + abs(distanceY);
        
        System.out.println("Enemy tank will reach player tank within: " + moves + " moves");
    }
	
}
