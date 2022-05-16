/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import java.util.Date;

/**
 *
 * @author Sara
 */
public class Order extends Customer {
    public int OrderNumber;
    public Date OrderDate;
    public String OrderState;

    public Order(int OrderNumber, Date OrderDate, String OrderState, String Phone, String password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
        this.OrderNumber = OrderNumber;
        this.OrderDate = OrderDate;
        this.OrderState = OrderState;
    }

   

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getOrderState() {
        return OrderState;
    }

    public void setOrderState(String OrderState) {
        this.OrderState = OrderState;
    }
    
    //get payment and get item

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }  
}