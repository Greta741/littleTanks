/**
 * @(#) LevelFactory.java
 */

package tanks;

public class LevelFactory
{
    private static String[] levelNames = {"Beginner", "Easy", "Medium", "Hard"};

    public static AbstractLevel getLevel(String name)
    {
        for(String level : levelNames)
            if(level.equalsIgnoreCase(name))
                return new RealLevel(name);
        return new NullLevel();
    }	
}
