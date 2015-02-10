// Alex Edelman --- 11/30/2014 --- Server.java
// CTU Online --- IT351 --- Individual Project 2

package myServer;

// Yay for imports...
import myClient.Customer;
import myClient.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Server 
{  
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        // Initialize the server's socket
        System.out.println("Starting Server...");
        ServerSocket server = new ServerSocket(67);
        
        // Create lists to hold the objects
        List<Customer> custList = readCust();
        List<Product> productList = readProduct();
        
        // Looping keeps the server open
        while( true )
        {
            System.out.println("Waiting for Client...");
            Socket socket = server.accept();
            System.out.println("Client Connected!  Throwing through ThreadManager!");
            
            ThreadManager manager = new ThreadManager( socket, custList, productList );
            Thread t = new Thread(manager);
            t.start();
        }
    }
    
    private static List<Customer> readCust()
    {                
        List<Customer> custList = new ArrayList<Customer>();
        Customer cust = new Customer();        
        
        // Initialize tokenizer to read space delimiters
        StringTokenizer tokenizer;
        String line;
        
        try 
        {
            FileReader fr = new FileReader( "customers.txt" );
            BufferedReader inFile = new BufferedReader( fr );
            line = inFile.readLine();
            
            while( line != null )
            {                
                tokenizer = new StringTokenizer( line, " " );
                
                // Save information in appropriate areas
                cust.setfName(tokenizer.nextToken());
                cust.setlName(tokenizer.nextToken());
                cust.setPhoneNum(tokenizer.nextToken());
                
                custList.add(cust);
                
                line = inFile.readLine();
            }                         
            inFile.close();
        } catch ( Exception e )
        {
            System.out.println( "An error with customers.txt has occured!" );
        }        
        
        return custList;
    }
    
    private static List<Product> readProduct()
    {        
        List<Product> productList = new ArrayList<Product>();
        Product prod = new Product();     
        
        // Initialize tokenizer to read space delimiters
        StringTokenizer tokenizer;
        String line;
        
        try 
        {
            FileReader fr = new FileReader( "products.txt" );
            BufferedReader inFile = new BufferedReader( fr );
            line = inFile.readLine();
            
            while( line != null )
            {                
                tokenizer = new StringTokenizer( line, " " );
                
                // Save information in appropriate areas
                prod.setName(tokenizer.nextToken());
                prod.setPrice(Float.parseFloat(tokenizer.nextToken()));
                productList.add(prod);
                
                line = inFile.readLine();
            }                         
            inFile.close();
        } catch ( Exception e )
        {
            System.out.println( "An error with products.txt has occured!" );
        }         
        
        return productList;        
    }
}