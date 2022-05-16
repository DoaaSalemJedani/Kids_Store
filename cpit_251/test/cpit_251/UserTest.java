/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Sara
 */
public class UserTest {
    
    User user = new User("0511111111", "0511111111", "Demo", "Demo");
    
    
    @Test
    public void phoneTest()
    {
        user.setPhone("0599999999");
        assertEquals("0599999999", user.getPhone());
    }
    
    @Test
    public void passwordTest()
    {
        user.setPassword("0599999999");
        assertEquals("0599999999", user.getPassword());
    }
    
    @Test
    public void firstNameTest()
    {
        user.setFirstName("Demo");
        assertEquals("Demo", user.getFirstName());
    }
    
    @Test
    public void lastNameTest()
    {
        user.setPhone("Demo");
        assertEquals("Demo", user.getLastName());
    }
    
    
}