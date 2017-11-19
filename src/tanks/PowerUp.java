/**
 * @(#) PowerUp.java
 */

package tanks;

public class PowerUp implements IPowerUp
{
    private String type;

    private int x;

    private int y;

    public PowerUp( String type, int x, int y )
    {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public void apply()
    {
        System.out.printf("Powerup got applied\n");
    }
}
