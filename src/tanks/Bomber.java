/**
 * @(#) Bomber.java
 */

package tanks;

public class Bomber extends Plane
{
    public Bomber(String model) {
        super(model);
    }

    @Override
    public void flyRight() {
        System.out.println(getModel() + " bomber took off");
    }

    @Override
    public void fire() {
        System.out.println(getModel() + " bomber thrown bomb");
    }

    @Override
    public void flyLeft() {
        System.out.println(getModel() + " bomber came back and landed");
    }	
}
