/**
 * @(#) ConsoleLogger.java
 */

package tanks;

public class ConsoleLogger extends AbstractLogger
{
	public ConsoleLogger( int level )
	{
            this.level = level;
	}
        
        @Override
        protected void write(String score) {
            System.out.println("Console: score is: " + score);
        }
}
