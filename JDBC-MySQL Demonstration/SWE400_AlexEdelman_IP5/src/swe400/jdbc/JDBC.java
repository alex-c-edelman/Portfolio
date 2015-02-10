// Alex Edelman --- 02/08/2015 --- JDBC.java
// CTU Online --- SWE400 --- Individual Project 5

package swe400.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC implements DAO
{
    private Connection connection;
    
    // Connect to the table
    public JDBC() throws SQLException
    {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sales", 
                "ctuonline", 
                "student");
    }
    
    // Create a new Record
    @Override
    public void pCreate(Product p) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "insert into product (id, name, description, price) "+ 
                "values (" + p.getId() + ", '" + p.getName() + "', '" + 
                p.getDescription() + "', "+ p.getPrice() + ")";
        int count = statement.executeUpdate(sql);
    }
    
    // Load the records
    @Override
    public List<Product> pReadAll() throws SQLException
    {
        Statement statement = connection.createStatement();
        
        ResultSet results = statement.executeQuery("select * from product");
        
        List<Product> products = new ArrayList<Product>();
        while (results.next())
        {
            Product p = new Product();
            p.setId(results.getInt("id"));
            p.setName(results.getString("name"));
            p.setDescription(results.getString("description"));
            p.setPrice(results.getDouble("price"));
            products.add(p);
        }
        return products;
    }
    
    // Update a record from the ID
    @Override
    public void pUpdate(Product p) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "update product set name='" + p.getName() + "', description='" + 
                p.getDescription() + "', price='" + p.getPrice() + "' where id="
                + p.getId();
        
        int count = statement.executeUpdate(sql);
    }

    // Delete a record from the ID
    @Override
    public void pDelete(int id) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "delete from product where id = " + id;
        int count = statement.executeUpdate(sql);
    }
    
    // Create a new customer record
    @Override
    public void cCreate(Customer c) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "insert into customer (id, name, login, password) "+ 
                "values (" + c.getId() + ", '" + c.getName() + "', '" + 
                c.getLogin() + "', '"+ c.getPassword() + "')";
        int count = statement.executeUpdate(sql);
    }

    // Load the customer table
    @Override
    public List<Customer> cReadAll() throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        ResultSet results = statement.executeQuery("select * from customer");
        
        List<Customer> customers = new ArrayList<Customer>();
        while (results.next())
        {
            Customer c = new Customer();
            c.setId(results.getInt("id"));
            c.setName(results.getString("name"));
            c.setLogin(results.getString("login"));
            c.setPassword(results.getString("password"));
            customers.add(c);
        }
        return customers;
    }

    // Update a customer record
    @Override
    public void cUpdate(Customer c) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "update customer set name='" + c.getName() + "', login='" + 
                c.getLogin() + "', password='" + c.getPassword() + "' where id="
                + c.getId();
        
        int count = statement.executeUpdate(sql);
    }

    // Delete a customer record
    @Override
    public void cDelete(int id) throws SQLException 
    {
        Statement statement = connection.createStatement();
        
        String sql = "delete from customer where id = " + id;
        int count = statement.executeUpdate(sql);
    }
}
