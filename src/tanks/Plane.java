/**
 * @(#) Plane.java
 */

package tanks;

public abstract class Plane
{
    private final String model;

    public Plane(String model)
    {
        this.model = model;
    }

    public abstract void flyRight();

    public abstract void fire();

    public abstract void flyLeft();
    
    public final String getModel()
    {
        return model;
    }

    public final void fly()
    {
        flyRight();
        fire();
        flyLeft();
    }	
}
