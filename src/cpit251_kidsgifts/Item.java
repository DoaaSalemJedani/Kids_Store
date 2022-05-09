/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_kidsgifts;


public class Item extends Seller {
    
    public int ItemID;
    public double Price;

    public Item(int Phone, char password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }

  

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getStoreName() {
        return StoreName;
    }
    
    
    
}
