// Alex Edelman --- 11/30/2014 --- ThreadManager.java
// CTU Online --- IT351 --- Individual Project 2

package myServer;

import myClient.CustomerRequest;
import myClient.ProductRequest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadManager implements Runnable
{
    private Socket socket;
    private List custList;
    private List productList;
    
    public ThreadManager( Socket socket, List custList, List productList )
    {
        this.socket = socket;
        this.custList = custList;
        this.productList = productList;
    }
    
    public void ClientManager( Socket socket, List custList, List productList ) throws IOException, ClassNotFoundException
    {        
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        // Read the incoming selection
        Object incoming = in.readObject();

        // Sent the correct corresponding information for the request
        if ( incoming instanceof CustomerRequest )
        {
            CustomerRequest request = (CustomerRequest) incoming;
            out.writeObject(custList);
        } else if ( incoming instanceof ProductRequest )
        {
            ProductRequest request = (ProductRequest) incoming;
            out.writeObject(productList);
        }
    }  

    @Override
    public void run() 
    {
        try
        {
            ClientManager( socket, custList, productList );
        } catch ( IOException ex )
        {
            Logger.getLogger(ThreadManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(ThreadManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}