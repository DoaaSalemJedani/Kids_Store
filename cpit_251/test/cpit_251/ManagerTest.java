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
 * @author duaas
 */
public class ManagerTest {
    
    public ManagerTest() {
    }

    Manager manager = new Manager();
    
    
    @Test
    public void isValidSellerTest()
    {
        assertTrue(manager.isValidSeller("0511111111"));
    }
    
}
