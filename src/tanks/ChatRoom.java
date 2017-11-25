/**
 * @(#) ChatRoom.java
 */

package tanks;

import java.util.Date;

public class ChatRoom
{
    public static void showMessage( Player player, String message ){
      System.out.println(new Date().toString() + " [" + player.getName()+ "] : " + message);
   }
}
