/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_kidsgifts;

import java.util.Date;

/**
 *
 * @author duaas
 */
public class Payment extends Order{
    public int paymentNumber;
    public char CVV;
    public char CardName;

    public Payment(int Phone, char password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }

 
    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public char getCVV() {
        return CVV;
    }

    public void setCVV(char CVV) {
        this.CVV = CVV;
    }

    public char getCardName() {
        return CardName;
    }

    public void setCardName(char CardName) {
        this.CardName = CardName;
    }

    public int getOrderNumber() {
        return OrderNumber;
    }
    
    //Check method info
    
    public void ConfirmOrder () { //depends on check 
        
    }
    
    
    
}
