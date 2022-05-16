/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 96654
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Customer.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Customer instance = null;
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String LastName = "";
        Customer instance = null;
        instance.setLastName(LastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class Customer.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Customer instance = null;
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class Customer.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String Phone = "";
        Customer instance = null;
        instance.setPhone(Phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Customer instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ItemOperation method, of class Customer.
     */
    @Test
    public void testItemOperation() {
        System.out.println("ItemOperation");
        String filePath = "";
        String searchTerm = "";
        int position = 0;
        String delimiter = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Customer.ItemOperation(filePath, searchTerm, position, delimiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterItem method, of class Customer.
     */
    @Test
    public void testFilterItem() {
        System.out.println("FilterItem");
        Customer instance = null;
        instance.FilterItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddItemToCart method, of class Customer.
     */
    @Test
    public void testAddItemToCart() {
        System.out.println("AddItemToCart");
        Customer instance = null;
        instance.AddItemToCart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCart method, of class Customer.
     */
    @Test
    public void testUpdateCart() {
        System.out.println("updateCart");
        String Item_Id = "";
        Customer instance = null;
        boolean expResult = false;
        boolean result = instance.updateCart(Item_Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddReview method, of class Customer.
     */
    @Test
    public void testAddReview() {
        System.out.println("AddReview");
        Customer instance = null;
        instance.AddReview();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReviewOperation method, of class Customer.
     */
    @Test
    public void testReviewOperation() {
        System.out.println("ReviewOperation");
        String filePath = "";
        String searchTerm = "";
        int position = 0;
        String delimiter = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Customer.ReviewOperation(filePath, searchTerm, position, delimiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
