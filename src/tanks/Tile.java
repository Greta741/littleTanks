/**
 * @(#) Tile.java
 */

package tanks;

public class Tile
{
    private TileDrawer tileDrawer;

    private int type;
    
    public Tile(int type)
    {
        this.type = type;
        tileDrawer = new TileDrawer();
    }

    public int getTile( )
    {
        return type;
    }

    public void drawTile( )
    {
        switch(type){
            case 0:
                tileDrawer.drawEmpty();
                break;
            case 1:
                tileDrawer.drawWall();
                break;
            case 2:
                tileDrawer.drawBushes();
                break;
            default:
                break;
        }
    }	
}
