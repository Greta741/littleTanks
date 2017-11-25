/**
 * @(#) CareTaker.java
 */

package tanks;

import java.util.ArrayList;

public class CareTaker
{
    private ArrayList<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento)
    {
        mementoList.add(memento);
    }

    public Memento get(int index)
    {
        return mementoList.get(index);
    }
}
