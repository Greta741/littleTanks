/**
 * @(#) Jet.java
 */

package tanks;

public class Jet extends Plane
{
    public Jet(String model) {
        super(model);
    }

    @Override
    public void flyRight() {
        System.out.println(getModel() + " jet took off");
    }

    @Override
    public void fire() {
        System.out.println(getModel() + " jet fired at enemy");
    }

    @Override
    public void flyLeft() {
        System.out.println(getModel() + " jet came back and landed");
    }	
}
