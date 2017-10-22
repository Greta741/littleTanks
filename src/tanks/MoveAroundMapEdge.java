/**
 * @(#) RandomMovement.java
 */

package tanks;
import java.util.Random;

public class MoveAroundMapEdge implements IMovementAlgorithm
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
        
        if(map[startPositionX + 1][startPositionY].getTile() == 0
                && isNearWall(map, startPositionX + 1, startPositionY)) {
            startPositionX++;
            System.out.println("Enemy tank moved one tile down");
        } else if(map[startPositionX][startPositionY + 1].getTile() == 0
                && isNearWall(map, startPositionX, startPositionY + 1)) {
            startPositionY++;
            System.out.println("Enemy tank moved one tile right");
        } else if(map[startPositionX - 1][startPositionY].getTile() == 0
                && isNearWall(map, startPositionX - 1, startPositionY)) {
            startPositionX--;
            System.out.println("Enemy tank moved one tile up");
        } else if(map[startPositionX][startPositionY - 1].getTile() == 0
                && isNearWall(map, startPositionX, startPositionY - 1)) {
            startPositionY--;
            System.out.println("Enemy tank moved one tile left");
        } else {
            System.out.println("Enemy tank is stunk between walls");
        }
    }
    
    private boolean isNearWall(Tile[][] map, int x, int y) {
        if (map[x + 1][y].getTile() == 1)
            return true;
        else if (map[x - 1][y].getTile() == 1)
            return true;
        else if (map[x][y + 1].getTile() == 1)
            return true;
        else return map[x][y - 1].getTile() == 1;
    }
}
