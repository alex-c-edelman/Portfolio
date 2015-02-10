// Alex Edelman --- 02/08/2015 --- DAO.java
// CTU Online --- SWE400 --- Individual Project 5

package swe400.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface DAO 
{
    // Throw methods to the JDBC file for SQL integration
    public void pCreate(Product p) throws SQLException;
    
    public List<Product> pReadAll() throws SQLException;
    
    public void pUpdate(Product p) throws SQLException;
    
    public void pDelete(int id) throws SQLException;
    
    public void cCreate(Customer c) throws SQLException;
    
    public List<Customer> cReadAll() throws SQLException;
    
    public void cUpdate(Customer c) throws SQLException;
    
    public void cDelete(int id) throws SQLException;
}
