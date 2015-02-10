// Alex Edelman --- 02/08/2015 --- Customer.java
// CTU Online --- SWE400 --- Individual Project 5

package swe400.jdbc;

public class Customer 
{
    // Create the variables that will make up the Customer class from the table, getters/setters
    private int id;
    private String name;
    private String login;
    private String password;

    public int getId() {
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

    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public String getPassword() 
    {
        return password;       
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    
}