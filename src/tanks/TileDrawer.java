/**
 * @(#) TileDrawer.java
 */

package tanks;

public class TileDrawer
{
    private TileGraphics bushes;

    private TileGraphics empty;

    private TileGraphics wall;
    
    public TileDrawer()
    {
        bushes = new Bushes();
        empty = new Empty();
        wall = new Wall();
    }

    public void drawBushes( )
    {
        bushes.draw();
    }

    public void drawEmpty( )
    {
        empty.draw();
    }

    public void drawWall( )
    {
        wall.draw();
    }	
}
