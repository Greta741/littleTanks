/**
 * @(#) Score.java
 */

package tanks;

public class Score
{
    private int state;
    
    public Score()
    {
        state = 0;
    }

    public void setState(int points)
    {
        Expression currentState = new PointExpression(state);
        Expression newPoints = new PointExpression(Math.abs(points));
        Expression action;
                
        if(points >= 0) {
            action = new PlusExpression(currentState, newPoints);
        } else {
            action = new MinusExpression(currentState, newPoints);
        }
        state = action.execute();
    }

    public int getState()
    {
        return state;
    }

    public Memento saveStateToMemento()
    {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento)
    {
        state = memento.getState();
    }	
}
