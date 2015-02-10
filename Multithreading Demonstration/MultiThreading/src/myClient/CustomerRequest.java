// Alex Edelman --- 11/30/2014 --- CustomerRequest.java
// CTU Online --- IT351 --- Individual Project 2

package myClient;

import java.io.Serializable;

public class CustomerRequest implements Serializable
{
    private Customer cust;

    public Customer getCust() {
        return cust;
    }

    public void setCustomer(Customer cust) {
        this.cust = cust;
    }
}
