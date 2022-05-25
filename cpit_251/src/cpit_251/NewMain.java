/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import static cpit_251.Manager.confirmationSeller;
import static cpit_251.Registration.confirmation;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewMain {

    public static String Phone;
    public static String password;
    public static String FirstName;
    public static String LastName;
    public static String press;
    public static String CustomerChoice;
    public static String CustomerChoice2;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the store");
        Registration S = new Registration();

        while (true) {/////////////////////////////////////////////////////////////////////////////////
            try {

                System.out.print("\nIf you already have an account press 1, if not press 2: ");
                press = input.nextLine();
                if (press.equals("1") || press.equals("2")) {
                    break;
                }

            } catch (InputMismatchException E) {
                input.hasNextLine();
                continue;
            }
            System.out.println("* Invalid input * ");

        }////////////////////////////////////////////////////////////////////////////////////////////////

        switch (press) {

            case "1":
                S.LogIn();

                if (confirmationSeller == true) {

                    System.out.println("**As a seller, You can add Your Item to the store**");
                    Seller SellerOperation = new Seller(Phone, password, FirstName, LastName);
                    SellerOperation.AddItemToStore();

                } else if (confirmation == true) {
                    System.out.println("**As a customer, You can filter the items, add item to cart and send a review**");
                    Scanner inputCustomer = new Scanner(System.in);

                    while (true) {/////////////////////////////////////////////////////////////////////////////////
                        try {

                            System.out.print("\nIf you want to add a review enter 'R', or enter 'O' to start order, or 'E' to exit: ");
                            CustomerChoice = inputCustomer.nextLine().toUpperCase();

                            if (CustomerChoice.equals("R") || CustomerChoice.equals("O")||CustomerChoice.equals("E")) {
                                break;
                            }

                        } catch (InputMismatchException E) {
                            input.hasNextLine();
                            continue;
                        }
                        System.out.println("* Invalid input * ");

                    }////////////////////////////////////////////////////////////////////////////////////////////////     

                    Customer CustomerOperation = new Customer(Phone, User.password, User.FirstName, User.LastName);
                    if (CustomerChoice.equals("R")) {
                        CustomerOperation.AddReview();

                    } else if (CustomerChoice.equals("O")) {

                        String ExitOrAdd;
                        do {
                            CustomerOperation.AddItemToCart();
                            while (true) {/////////////////////////////////////////////////////////////////////////////////
                                try {

                            System.out.print("\nEnter 'M' if you want to add anoher item to cart, or 'E' to exit: ");
                            ExitOrAdd = inputCustomer.nextLine().toUpperCase();
                                    if (ExitOrAdd.equals("M") || ExitOrAdd.equals("E")) {
                                        break;
                                    }

                                } catch (InputMismatchException E) {
                                    input.hasNextLine();
                                    continue;
                                }
                                System.out.println("* Invalid input * ");

                            }////////////////////////////////////////////////////////////////////////////////////////////////


                        } while (!"E".equals(ExitOrAdd));

                        System.out.println("");

                    } else if (CustomerChoice.equals("E")) {

                    }
                }

                break;

            case "2":
                S.UserRegistration();
                if (Registration.CustomerOrSeller.equals("2")) { //customer

                    Scanner inputCustomer = new Scanner(System.in);

                    while (true) {/////////////////////////////////////////////////////////////////////////////////
                        try {

                            System.out.print("\nIf you want to add a review enter 'R', or enter 'O' to start order, or 'E' to exit: ");
                            CustomerChoice2 = inputCustomer.nextLine().toUpperCase(); //check data type
                            if (CustomerChoice2.equals("R") || CustomerChoice2.equals("O") || CustomerChoice2.equals("E")) {
                                break;
                            }

                        } catch (InputMismatchException E) {
                            input.hasNextLine();
                            continue;
                        }
                        System.out.println("* Invalid input * ");

                    }////////////////////////////////////////////////////////////////////////////////////////////////

                    Customer CustomerOperation = new Customer(Phone, password, FirstName, LastName);
                    if (CustomerChoice2.equals("R")) {
                        CustomerOperation.AddReview();

                    } else if (CustomerChoice2.equals("O")) {

                        String ExitOrAdd;
                        do {
                            CustomerOperation.AddItemToCart();

                            while (true) {/////////////////////////////////////////////////////////////////////////////////
                                try {

                                    System.out.print("\nEnter 'M' if you want to add anoher item to cart, or 'E' to exit: ");
                                    ExitOrAdd = inputCustomer.nextLine().toUpperCase(); //check data type
                                    if (ExitOrAdd .equals("M") || ExitOrAdd .equals("E")) {
                                        break;
                                    }

                                } catch (InputMismatchException E) {
                                    input.hasNextLine();
                                    continue;
                                }
                                System.out.println("* Invalid input * ");

                            }////////////////////////////////////////////////////////////////////////////////////////////////

                        } while (!"E".equals(ExitOrAdd));

                        System.out.println("");

                    } else if (CustomerChoice.equals("E")) {

                    }

                } else if (Registration.CustomerOrSeller.equals("1")) { //seller

                    Seller SellerOperation = new Seller(LastName, password, FirstName, LastName);
                    SellerOperation.AddItemToStore();

                }

                break;
        
        }
    }
}
