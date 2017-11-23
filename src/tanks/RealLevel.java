/**
 * @(#) RealLevel.java
 */

package tanks;

public class RealLevel extends AbstractLevel
{
    public RealLevel(String name)
    {
        this.name = name;
    }

    @Override
    public Boolean isNil( )
    {
        return false;
    }

    @Override
    public String getName( )
    {
        return name;
    }	
	
}
