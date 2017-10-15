/**
 * @(#) Tank.java
 */

package tanks;

public class Tank implements ITank
{
    private int lives = 100;

    private int armor;

    public void update( )
    {
        System.out.printf("Hello from tank, my health is %d\n", lives);
    }

    public void draw( )
    {

    }

    public void updateLives(int amount)
    {
        lives += amount;
    }
}
