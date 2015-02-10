// Alex Edelman --- 11/30/2014 --- Product.java
// CTU Online --- IT351 --- Individual Project 2

package myClient;

import java.io.Serializable;

public class Product implements Serializable
{
    private String name;
    private float price;
    
    @Override
    public String toString()
    {
        return "Product: " + name + ", Priced at: $" + price;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public float getPrice() 
    {
        return price;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }
}
