
package cpit_251;


public class User {

    public static String Phone;
    public static String password;
    public static String FirstName;
    public static String LastName;

    public User(String Phone, String password, String FirstName, String LastName) {
        User.Phone = Phone;
        User.password = password;
        User.FirstName = FirstName;
        User.LastName = LastName;
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

}
