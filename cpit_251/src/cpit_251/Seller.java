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
import java.util.*;


public class Seller extends User {

  
    

    public String StoreName;
    public int RegistrationNumber;
    public int Item_Id ;
    public int price_item;

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

    public void AddItemToStore(  int quantity , String itemName ) {
       int addItemLimt=100;
        
        for ( int i=1;i<=addItemLimt; i++){
            
            Item_Id=i;//to string for store name 
            Scanner input= new Scanner (System.in);
            System.out.println(" set the price for  this id number "+ Item_Id + ":" );
            price_item = input.nextInt();
            System.out.println(" set the quantity  for  this id number "+ Item_Id + ":" );
            quantity = input.nextInt();  
            System.out.println(" set the item name   for  this id number "+ Item_Id + ":" );
            itemName = input.nextLine();  
        }

    }
    public void CheckReview() { //not sure

    }

}