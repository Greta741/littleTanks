/**
 * @(#) FileLogger.java
 */

package tanks;

public class FileLogger extends AbstractLogger
{
        private String fileName;
    
	public FileLogger( int level, String fileName )
	{
            this.level = level;
            this.fileName = fileName;
	}
        
        @Override
        protected void write(String score) {
            System.out.println("File: score is: " + score + " in file: " + this.fileName);
        }
}
