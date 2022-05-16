
package cpit_251;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Seller extends User {

    public static String StoreName;
    public static String Item_Id;
    public static int addItemLimt = 50;
    public static double price_item;
    public static String ProductType;
    public static String itemName;
    public static String item_remaining;

    public Seller(String Phone, String password, String FirstName, String LastName) {
        super(Phone, password, FirstName, LastName);
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }


    public static String getItem_Id() {
        return Item_Id;
    }

    public static void setItem_Id(String Item_Id) {
        Seller.Item_Id = Item_Id;
    }

    public int getAddItemLimt() {
        return addItemLimt;
    }

    public void setAddItemLimt(int addItemLimt) {
        this.addItemLimt = addItemLimt;
    }

    public static double getPrice_item() {
        return price_item;
    }

    public static void setPrice_item(double price_item) {
        Seller.price_item = price_item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public static String getProductType() {
        return ProductType;
    }

    public static void setProductType(String ProductType) {
        Seller.ProductType = ProductType;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    public void updateStore()
    {
        try {
                FileWriter myWriter = new FileWriter("products.txt", true);
                myWriter.write(StoreName + "," + Item_Id + "," + ProductType + "," + itemName + "," + price_item + "SAR" +"\n");
                myWriter.flush();
                myWriter.close();

                FileReader Reader = new FileReader("products.txt");

                Reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public int getTotalItemsInStore()
    {
        int totalItems = 0;
        
        try {
                BufferedReader myReader = new BufferedReader(new FileReader("products.txt"));
                
                while(myReader.readLine() != null)
                {
                    totalItems += 1;
                }
                myReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        
        return totalItems;
    }

    public void AddItemToStore() throws FileNotFoundException, IOException { 

 
            File myObj = new File("products.txt");
   

        Scanner INPUTStoreName = new Scanner(System.in);
        System.out.print("\nEnter your store name: ");
        StoreName = INPUTStoreName.nextLine();
            System.out.println("The limit for adding products is 50.");
        for (int i = 1; i <= addItemLimt; i++) {

            Item_Id = i + StoreName;//join the store name and id for uniqe id  
             
            while (addItemLimt==50) {
                Scanner INPUT = new Scanner(System.in);

                try {

                    System.out.print("\nSet the name for item number " + Item_Id + " : ");
                    itemName = INPUT.nextLine().toLowerCase();

                    if (itemName.matches("^[a-z][a-z ]*[a-z]?$")) {
                        break;
                    }

                } catch (InputMismatchException E) {

                    INPUT.nextLine();
                    continue;

                }
                System.out.println("*** Invalid input: Enter A string from ( A-Z ,a-z ) *** ");
            }

            while (true) {
                Scanner INPUT_price = new Scanner(System.in);

                try {

                    System.out.print("Set the price for item number " + Item_Id + " : ");
                    price_item = INPUT_price.nextDouble();
                    break;

                } catch (InputMismatchException E) {
                    System.out.println("*** Invalid input: Enter An integer number *** ");

                    INPUT_price.hasNextDouble();
                    continue;
                }

            }

            while (true) {
                Scanner INPUT_type = new Scanner(System.in);

                try {
                    System.out.println("Set the Product Type for item number " + Item_Id + " : "
                            + "girls gifts = g | "
                            + "boys gifts = b | "
                            + "unisex gifts = u ");
                    ProductType = INPUT_type.nextLine().toLowerCase();

                    if (ProductType.equals("b") || ProductType.equals("u") || ProductType.equals("g")) {
                        break;
                    }

                } catch (InputMismatchException E) {
                    INPUT_type.hasNext();
                    continue;
                }
                System.out.println("*** Invalid input , try again *** ");

            }

            updateStore();
            Scanner INPUT_final = new Scanner(System.in);

            System.out.print("\nEnter (E) for end  if no item is remaining , if else press (ENTER): ");
            item_remaining = INPUT_final.nextLine().toLowerCase();

            if (item_remaining.equals("e")) {
                break;
            } else {
                continue;
            }
        }
    }

}