/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit_251;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public static boolean confirmationSeller;

    public static ArrayList<String> RegistrationNumberOperation(String filePath, String searchTerm, int position, String delimiter) {

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

    public boolean ConfirmSellerAcc() {

        confirmationSeller = false;
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nWrite the Registration Number to confirm your account as a seller: ");
        String RegistrationNumber = input.nextLine();
        
        if(isValidSeller(RegistrationNumber))
        {
            System.out.println("You successfully logged in");
            return confirmationSeller = true;
        }
        else
        {
            System.out.println("The Registration Number is not exist. YOU HAVE TO TRY TO LOGIN AGAIN!!! ");
            return confirmationSeller;
        }
    }
    
    public boolean isValidSeller(String registrationNumber)
    {
        boolean res = false;
        String filename = "RegistrationInfo.txt";
        
        ArrayList<String> file = RegistrationNumberOperation(filename, registrationNumber, 5, ","); 

        for (int i = 0; i < file.size(); i++) {

            file.get(i);
            if (registrationNumber != null) {
                 res = true;
            } 
        }
        
        return res;
    }

}
