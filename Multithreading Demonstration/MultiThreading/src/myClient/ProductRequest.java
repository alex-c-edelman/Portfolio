// Alex Edelman --- 11/30/2014 --- ProductRequest.java
// CTU Online --- IT351 --- Individual Project 2

package myClient;

import java.io.Serializable;

public class ProductRequest implements Serializable
{
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
