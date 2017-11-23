/**
 * @(#) PointExpression.java
 */

package tanks;

public class PointExpression implements Expression
{
    private int point;

    public PointExpression(int point)
    {
        this.point = point;
    }	

    @Override
    public int execute()
    {
        return point;
    }	
}
