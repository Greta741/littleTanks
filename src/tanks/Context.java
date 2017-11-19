/**
 * @(#) Context.java
 */

package tanks;

public class Context
{
    private GameState state;

    public Context() {
        setState(new PlayingState());
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public GameState getState() {
        return state;
    }
    
    public void changeGameState() {
        state.changeGameState(this);
    }
}
