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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration {

    String Phone;
    String password;
    String FirstName;
    String LastName;
    String LogInPhone;
    String LogInPassword;

    public Registration(String Phone, String password, String FirstName, String LastName, String LogInPhone, String LogInPassword) {
        this.Phone = Phone;
        this.password = password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.LogInPhone = LogInPhone;
        this.LogInPassword = LogInPassword;
    }

    Registration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void UserRegistration() {

        try {
            File myObj = new File("RegistrationInfo.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the store, Enter your information"); //change the name

        while (true) {
            try {
                System.out.println("Your phone number: ");//make sure it's not used
                Phone = input.nextLine();
                if (Phone.length() == 10) {
                    break;
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input: Use digits 0 to 9 only");
                continue;
            }
            System.out.println("Invalid input: Not 10 digits long, Try again ");

        }

        while (true) {
            try {
                System.out.println("Your password: ");
                password = input.nextLine();
                System.out.println("Enter your password again: ");
                String PasswordValidiation = input.nextLine();

                if (password.matches(PasswordValidiation)) {
                    break;
                }

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("They Do Not Matche! Try again");

        }

        System.out.println("Your First name: ");
        FirstName = input.nextLine();

        System.out.println("Your Last name: ");
        LastName = input.nextLine();

        //if ,RegistrationNumber for seller 
        try {
            FileWriter myWriter = new FileWriter("RegistrationInfo.txt");
            myWriter.write("UserName: " + FirstName + " " + LastName + "\n"
                    + "PhoneNumber: ( " + Phone + " )\n"
                    + "Password: " + password);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void Login() throws FileNotFoundException { 

        FileReader Reader = new FileReader("RegistrationInfo.txt");
        Scanner File = new Scanner(Reader); 
        Scanner inputLogIn = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("Enter your login Information: ");
                System.out.println("Phone number: ");
                LogInPhone = inputLogIn.nextLine();
                System.out.println("Password: ");
                LogInPassword = inputLogIn.nextLine();

                if ((File.findInLine(Phone) == (LogInPhone)) || (File.findInLine(password) == (LogInPassword))) {
                    System.out.println("Welcome Back");
                    break;
                }

            } catch (InputMismatchException e) {
                inputLogIn.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("Invalid Phone number or Password. Try again! ");
        }

    }

}