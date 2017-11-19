/**
 * @(#) PlaneComposite.java
 */

package tanks;

import java.util.ArrayList;
import java.util.List;

public class PlaneComposite
{
    private Plane plane;

    private List<PlaneComposite> planeList;

    public PlaneComposite(Plane plane)
    {
        this.plane = plane;
        planeList = new ArrayList<PlaneComposite>();
    }

    public void add(PlaneComposite p)
    {
        planeList.add(p);
    }

    public void remove(PlaneComposite p)
    {
        planeList.remove(p);
    }

    public List<PlaneComposite> getPlanes()
    {
        return planeList;
    }
    
    public void printModel()
    {
        System.out.println(plane.getModel());
    }
}
