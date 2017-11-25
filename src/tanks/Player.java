/**
 * @(#) Player.java
 */

package tanks;

public class Player extends Tank
{
    private String name;
    
    public Player()
    {
        System.out.println("Player tank");
    }
    
    public void Move( )
    {

    }
    
    public void SetName( String name )
    {
        this.name = name;
    }
    
    public String getName( )
    {
        return this.name;
    }
    
    public void sendMessage( String message )
    {
        ChatRoom.showMessage(this, message);
    }
}
