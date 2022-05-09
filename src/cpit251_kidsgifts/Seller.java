/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_kidsgifts;

/**
 *
 * @author duaas
 */
public class Seller extends User {

  
    

    public String StoreName;
    public int RegistrationNumber;

    public Seller(int Phone, char password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(int RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
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

    public void AddItemToStore(String Item) {

    }

    public void CheckReview() { //not sure

    }

}
