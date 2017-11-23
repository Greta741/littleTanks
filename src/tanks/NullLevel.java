/**
 * @(#) NullLevel.java
 */

package tanks;

public class NullLevel extends AbstractLevel
{
    @Override
    public Boolean isNil()
    {
        return true;
    }

    @Override
    public String getName()
    {
        return "Level is not available";
    }	
}
