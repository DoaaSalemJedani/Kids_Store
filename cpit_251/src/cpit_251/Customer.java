/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import java.util.Scanner;

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

    public void AddItemToCart(int ItemID) { //Ghaidaa
        

    }
    
    public void FilterItem (String ItemName) { //Noor
        
        
    }

public void AddReview (String OrderState ) { 
        
        
    if(Order.OrderState=="Delevird"){
           Scanner inputREVIEW=new Scanner(System.in);
           System.out.println("-----------------------------------------------------");
           System.out.println(" review the seller shop");
           System.out.println("-----------------------------------------------------");
           System.out.println("fastest delivery:  ");
           System.out.println("--------------------");
           System.out.println("1 : for the too long delivery days");
           System.out.println("2 : for the on time delivery ");
           System.out.println("3 : for the fastest delivery ");
           System.out.print("Enter your review : ");
           int fastest_delivery= inputREVIEW.nextInt();
           System.out.println("--------------------");
           System.out.println("customer service:  ");
           System.out.println("--------------------");
           System.out.println("1 : for the too long response to customer ");
           System.out.println("2 : for the long response to customer");
           System.out.println("3 : for the on time response to customer ");
           System.out.print("Enter your review : ");
           int customer_service= inputREVIEW.nextInt();
           System.out.println("--------------------");
           System.out.println("quality of items :  ");
           System.out.println("--------------------");
           System.out.println("1 : was too bad quality ");
           System.out.println("2 : was a good quality");
           System.out.print("Enter your review : ");
           int quality_of_items= inputREVIEW.nextInt();
           System.out.println("-----------------------------------------------------");
           
           // item review , we must complete add item to cart method
           //making an array and print it in the shop file information 
  
    }else {
           System.out.println(" wait until it Delevird ");
       }
       
       
        
    }
    
}