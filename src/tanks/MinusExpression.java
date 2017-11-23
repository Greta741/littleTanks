/**
 * @(#) MinusExpression.java
 */

package tanks;

import java.util.ArrayList;
import java.util.List;

public class MinusExpression implements Expression
{
    private List<Expression> minusExpList;

    public MinusExpression(Expression exp1, Expression exp2)
    {
        minusExpList = new ArrayList<Expression>();
        minusExpList.add(exp1);
        minusExpList.add(exp2);
    }

    @Override
    public int execute()
    {
        return minusExpList.get(0).execute() - minusExpList.get(1).execute();
    }
}
