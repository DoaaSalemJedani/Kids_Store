/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Customer extends User {

    public Customer(String Phone, String password, String FirstName, String LastName) {
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

  public void AddReview() {

        
            File myObj = new File("Reviews.txt");

    
        Scanner inputREVIEW = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("\n-----------------------------------------------------");
                System.out.println("Review the store ");
                System.out.print("Enter the store name: ");
                String StoreNameReview = inputREVIEW.nextLine();

             
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Fastest delivery:  ");
                    System.out.println("--------------------");
                    System.out.println("1 : for the too long delivery days");
                    System.out.println("2 : for the on time delivery ");
                    System.out.println("3 : for the fastest delivery ");
                    System.out.print("Enter your review : ");
                    int fastest_delivery = inputREVIEW.nextInt();
                    System.out.println("--------------------");
                    System.out.println("Customer service:  ");
                    System.out.println("--------------------");
                    System.out.println("1 : for the too long response to customer ");
                    System.out.println("2 : for the long response to customer");
                    System.out.println("3 : for the on time response to customer ");
                    System.out.print("Enter your review : ");
                    int customer_service = inputREVIEW.nextInt();
                    System.out.println("--------------------");
                    System.out.println("Quality of items :  ");
                    System.out.println("--------------------");
                    System.out.println("1 : was too bad quality ");
                    System.out.println("2 : was a good quality");
                    System.out.print("Enter your review : ");
                    int quality_of_items = inputREVIEW.nextInt();
                    System.out.println("-----------------------------------------------------");
                    System.out.println(StoreNameReview + " will check the review as soon as possible");
                    System.out.println("Thank you");

                    try {
                        FileWriter myWriter = new FileWriter("Reviews.txt", true);

                        myWriter.write("\nReview about ( " + StoreNameReview + " ) store ");
                        myWriter.write("\n----------------------------------------------------");
                        myWriter.write("\nFastest delivery review:");
                        switch (fastest_delivery) {
                            case 1:
                                myWriter.write("\nToo long delivery days");
                                break;
                            case 2:
                                myWriter.write("\nOn time delivery");
                                break;
                            case 3:
                                myWriter.write("\nFastest delivery");
                                break;
                            default:

                        }
                        myWriter.write("\n----------------------------------------------------");
                        myWriter.write("\nCustomer service review:");
                        switch (customer_service) {
                            case 1:
                                myWriter.write("\nToo long response to customer");
                                break;
                            case 2:
                                myWriter.write("\nLong response to customer");
                                break;
                            case 3:
                                myWriter.write("\nOn time response to customer");
                                break;
                            default:

                        }
                        myWriter.write("\n----------------------------------------------------");
                        myWriter.write("\nQuality of items review:");
                        switch (quality_of_items) {
                            case 1:
                                myWriter.write("\nToo bad quality");
                                break;
                            case 2:
                                myWriter.write("\nGood quality");
                                break;
                            default:

                        }

                        myWriter.write("\n######################################################\n");
                        myWriter.flush();
                        myWriter.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                

            } catch (InputMismatchException e) {
                inputREVIEW.nextLine();
                System.out.println("Invalid input");
                continue;
            }
         
        }


    }

    public static ArrayList<String> ReviewOperation(String filePath, String searchTerm, int position, String delimiter) {

        int positionTerm = position - 1;
        String currentLine;
        String data[];
        ArrayList<String> returnData = new ArrayList<String>();

        try {

            FileReader fileReader = new FileReader(filePath);
            BufferedReader BufferReader = new BufferedReader(fileReader);

            while ((currentLine = BufferReader.readLine()) != null) {
                data = currentLine.split(",");
                if ((data[positionTerm].equals(searchTerm))) {
                    returnData.add(currentLine);
                }
            }

            BufferReader.close();

            fileReader.close();

            return returnData;

        } catch (Exception e) {
            System.out.println(e);

        }

        return returnData;

    }
}
