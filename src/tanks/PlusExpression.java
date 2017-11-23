/**
 * @(#) PlusExpression.java
 */

package tanks;

import java.util.ArrayList;
import java.util.List;

public class PlusExpression implements Expression
{
    private List<Expression> plusExpList;

    public PlusExpression(Expression exp1, Expression exp2)
    {
        plusExpList = new ArrayList<Expression>();
        plusExpList.add(exp1);
        plusExpList.add(exp2);
    }

    @Override
    public int execute()
    {
        return plusExpList.get(0).execute() + plusExpList.get(1).execute();
    }	
}
