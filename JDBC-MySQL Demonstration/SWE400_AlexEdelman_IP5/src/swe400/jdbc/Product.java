// Alex Edelman --- 02/08/2015 --- Product.java
// CTU Online --- SWE400 --- Individual Project 5

package swe400.jdbc;

public class Product 
{
    // Create the variables that will make up the Product class from the table, getters/setters
    private int id;
    private String name;
    private String description;
    private double price;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
}