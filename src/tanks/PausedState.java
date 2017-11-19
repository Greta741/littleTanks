/**
 * @(#) PausedState.java
 */

package tanks;

public class PausedState implements GameState
{
    public void changeGameState(Context c) {
        System.out.println("Game resumed.");
        c.setState(new PlayingState());
    }
}
