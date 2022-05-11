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
public class Payment {
    public int paymentNumber;
    public char CVV;
    public char CardName;

    public Payment(int paymentNumber, char CVV, char CardName) {
        this.paymentNumber = paymentNumber;
        this.CVV = CVV;
        this.CardName = CardName;
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


  
    //Check method info
    
    public void ConfirmOrder () { //depends on check 
        
    }
    
    
    
}