/*
 * This program allow to insert, update and delete information on the DB 
 */

/**
 *
 * @author Ingrycht Alves Antunes
 * last update 25/10/2017
 */
public class PersonalDetails {
    //create instance variables
    private int personID;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private String phone;
    private String email;

    //create no-args constructor
    public PersonalDetails() {
    }

    //create constructor to validate the data
    public PersonalDetails(int personID, String firstName, String lastName, String address1, String address2, String address3, String phone, String email) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone = phone;
        this.email = email;
    }
    //generated setters and getters to validate and retrive the data

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
}