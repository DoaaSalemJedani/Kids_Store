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
public class User {

    private String Phone;
    private char password;
    public String FirstName;
    public String LastName;

    public User(String Phone, char password, String FirstName, String LastName) {
        this.Phone = Phone;
        this.password = password;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    


    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
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

    public void EditName(String Fname, String Lname) {

    }

    public void EditPhoneNumber(int PhoneNumber) {

    }

    private void ChangePassword(char Password) {

    }

}