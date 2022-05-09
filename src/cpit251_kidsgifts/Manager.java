/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_kidsgifts;


public class Manager extends Seller {

    public Manager(int Phone, char password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }

   
    
    

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }
    
    private void ConfirmSellerAcc(int RegistrationNumber, boolean confirmation) {
        
    }
    
    
}
