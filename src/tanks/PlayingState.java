/**
 * @(#) PlayingState.java
 */

package tanks;

public class PlayingState implements GameState
{
    public void changeGameState(Context c) {
        System.out.println("Game stopped.");
        c.setState(new PausedState());
    }
}
