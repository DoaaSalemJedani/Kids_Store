/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author duaas
 */
public class Registration {

    
    private static Scanner ScannerLogIn;
    public static String Phone;
    public static String password;
    public static String FirstName;
    public static String LastName;
    public static String RegistrationNumber;
    public static String CustomerOrSeller;
    public static boolean confirmation;

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

        try {
            File myObj = new File("LogInInfo.txt");
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

        System.out.println("Welcome to the store, Enter your information");

        while (true) {
            try {
                System.out.println("Your phone number: ");

                Phone = input.nextLine();

                String filename = "RegistrationInfo.txt";

                ArrayList<String> file = PhoneOperation(filename, Phone, 1, ",");

                for (int i = 0; i < file.size(); i++) {

                    file.get(i);
                    if (Phone != null) {

                        System.out.println("This Phone Number is already exist. Try again!");
                        Phone = input.nextLine();
                    }

                }

                if (Phone.length() == 10 && Phone.startsWith("05")) {

                    break;
                }

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input: Use digits 0 to 9 only");
                continue;
            }
            System.out.println("Invalid phone number.It should starts with '05' and contains 10 digits. Try again! ");

        }

        while (true) {

            try {
                System.out.println(" ");
                System.out.println("**The password must have at least 8 characters with no space**");
                System.out.println("Your password: ");
                password = input.nextLine();
                System.out.println("Enter your password again for confirmation : ");
                String PasswordValidiation = input.nextLine();

                if (password.matches(PasswordValidiation) && password.length()>=8 && !(password.contains(" "))) {
                    break;
                } 
                

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            
            System.out.println("- Make sure your password have at least 8 characters with no space");
            System.out.println("- Make sure the second password matches the first one for confirmation");
            System.out.println("Try again!");

        }

        System.out.println("Your First name: ");
        FirstName = input.nextLine();

        System.out.println("Your Last name: ");
        LastName = input.nextLine();

        Scanner inputR = new Scanner(System.in);


        while (true) {
            Scanner inputRr = new Scanner(System.in);

            try {

                System.out.println("If you have a Registration Number, press 1, if not press 2: "); 
                CustomerOrSeller = input.nextLine();
                if (CustomerOrSeller.equals("1") || CustomerOrSeller.equals("2")) break;

            } catch (InputMismatchException E) {
                inputR.hasNextLine();
               continue;
            }
           System.out.println("* Invalid input * ");


        }
        switch (CustomerOrSeller) {
            case "1" :

                while (true) {

                    try {

                        
                        System.out.println("Enter your Registration Number: ");
                        
                        RegistrationNumber = inputR.nextLine();
                        


                        String filename = "RegistrationInfo.txt";

                        ArrayList<String> file = RegistrationOperation(filename, RegistrationNumber, 5, ",");

                        for (int i = 0; i < file.size(); i++) {

                            file.get(i);
                            if (RegistrationNumber != null) {

                                System.out.println("This Registration Number is already exist. Try again!");

                                RegistrationNumber = inputR.nextLine();

                                break;

                            }

                            if (RegistrationNumber == null) {

                                break;

                            }

                        }

                    } catch (InputMismatchException e) {
                        input.nextLine();
                        System.out.println("Invalid input: Use digits 0 to 9 only");
                        continue;
                    }

                    System.out.println("Correct ");

                    break;

                }

            case "2":
                System.out.println("You are considered as customer.");
                break;
            default:

        }

        try {
            FileWriter myWriter = new FileWriter("RegistrationInfo.txt", true);
            myWriter.write(Phone + "," + password + "," + FirstName + "," + LastName + "," + RegistrationNumber
                    + "\n");

            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("LogInInfo.txt", true);
            myWriter.write(Phone + "," + password
                    + "\n");

            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> PhoneOperation(String filePath, String searchTerm, int position, String delimiter) {

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

    public static ArrayList<String> RegistrationOperation(String filePath, String searchTerm, int position, String delimiter) {

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

    public static ArrayList<String> PasswordOperation(String filePath, int searchTerm, int position, String delimiter) {

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

    public void ConfirmLogin(String Phone, String password, String filename) {

        confirmation = false;

        String TemPhone = "";
        String TemPassword = "";

        try {
            ScannerLogIn = new Scanner(new File(filename));
            ScannerLogIn.useDelimiter("[,\n]");
            while (ScannerLogIn.hasNext() && !confirmation) {
                TemPhone = ScannerLogIn.next();
                TemPassword = ScannerLogIn.next();

                if (TemPhone.trim().equals(Phone.trim()) && TemPassword.trim().equals(password.trim())) {

                    confirmation = true;

                } else {
                    confirmation=false;
                }

            }
            ScannerLogIn.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }

    }

    public void LogIn() {

        while (true) {
            Scanner inputLogIn = new Scanner(System.in);
            System.out.println("If you want to exit the program enter 'E', or press (Enter) to continue :");
            String exit = inputLogIn.nextLine().toUpperCase();

            if (exit.equals("E")) {
                break;
            }

            Scanner inputSelller = new Scanner(System.in);
            System.out.println("If you are a seller Enter 'S', if not press (Enter) to continue : ");
            String IfSeller= inputSelller.nextLine().toUpperCase();
            
            //not completed yet , need a confirm seller account method 
            
//            if(IfSeller.equals("S")) {
//               
//               break;
//            }
          
            System.out.println("Enter your phone to logIn:");
            String Phone = inputLogIn.nextLine();
            System.out.println("Enter your password to logIn:");
            String password = inputLogIn.nextLine();
            String filename = "LogInInfo.txt";

            ConfirmLogin(Phone, password, filename);
            if (confirmation == true) {

                System.out.println("You successfully logged in");
                break;

            }
            System.out.println("They Do Not Matche! Try again!");

        }

    }
}

