/**
 * @(#) AbstractLogger.java
 */

package tanks;

public abstract class AbstractLogger
{
        public static int CONSOLE = 1;
        public static int FILE = 2;
        
        protected int level;
        
        protected AbstractLogger nextLogger;
         
	public void setNextLogger( AbstractLogger nextLogger )
	{
            this.nextLogger = nextLogger;
	}
	
	public void logScore(int level, String score )
	{
            if (this.level == level) {
                write(score);
            }
            if (nextLogger != null) {
                nextLogger.logScore(level, score);
            }
	}
	
	abstract protected void write( String score );
	
}
