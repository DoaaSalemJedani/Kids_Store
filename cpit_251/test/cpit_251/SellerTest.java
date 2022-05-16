/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara
 */
public class SellerTest {
    
    public SellerTest() {
    }

    Seller seller = new Seller("0511111111", "0511111111", "Demo", "Demo");
  
    
    @Test
    public void phoneTest()
    {
        seller.setPhone("0599999999");
        assertEquals("0599999999", seller.getPhone());
    }
    
    @Test
    public void passwordTest()
    {
        seller.setPassword("0599999999");
        assertEquals("0599999999", seller.getPassword());
    }
    
    @Test
    public void firstNameTest()
    {
        seller.setFirstName("Demo");
        assertEquals("Demo", seller.getFirstName());
    }
    
    @Test
    public void lastNameTest()
    {
        seller.setPhone("Demo");
        assertEquals("Demo", seller.getLastName());
    }
    
    @Test
    public void addItemToStoreTest()
            
    {
        seller.setStoreName("Dummy Store");
        Seller.Item_Id = "5" + seller.getStoreName();
        Seller.ProductType = "g";
        seller.setItemName("demo");
        Seller.price_item = 1.99;
        
        int totalItemsInStore = seller.getTotalItemsInStore();
        seller.updateStore();
        
        assertEquals(totalItemsInStore + 1, seller.getTotalItemsInStore());
    }
    
}
//S
