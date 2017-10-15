/**
 * @(#) HealthInvoker.java
 */

package tanks;

import java.util.ArrayList;
import java.util.List;

public class HealthInvoker
{
    private List<IHealthOrder> orders = new ArrayList<IHealthOrder>(); 
    
    public void takeOrder(IHealthOrder order){
        orders.add(order);		
    }
    
    public void placeOrders(){
      for (IHealthOrder order : orders) {
         order.execute();
      }
      orders.clear();
   }
}
