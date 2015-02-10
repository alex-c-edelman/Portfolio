// Alex Edelman --- 11/30/2014 --- Customer.java
// CTU Online --- IT351 --- Individual Project 2

package myClient;

import java.io.Serializable;

public class Customer implements Serializable
{
    private String fName;
    private String lName;
    private String phoneNum;
    
    @Override
    public String toString()
    {
        return "Customer Name: " + fName + " " + lName + ", Phone Number: " + phoneNum;
    }

    public String getfName() 
    {
        return fName;
    }

    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getlName() 
    {
        return lName;
    }

    public void setlName(String lName) 
    {
        this.lName = lName;
    }

    public String getPhoneNum() 
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) 
    {
        this.phoneNum = phoneNum;
    }
}
