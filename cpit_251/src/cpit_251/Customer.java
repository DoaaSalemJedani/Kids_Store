/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

/**
 *
 * @author Sara
 */
public class Customer extends User {

    public Customer(String Phone, char password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }


    
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void AddItemToCart(int ItemID) { //

    }
    
    public void SearchItem (String ItemName) {
        
        
    }

    public void AddReview (int ReviewRate, String comment) {
        
    }
    
    
}