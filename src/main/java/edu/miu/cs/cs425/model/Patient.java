package edu.miu.cs.cs425.model;

public class Patient {
    //Patient’s First Name, Last Name, Contact Phone Number, Email, Mailing Address and Date of Birth
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private String dateOfBirth;

    //Constructor
    public Patient() {}
    public Patient(String firstName, String lastName, String contactPhoneNumber, String email, String mailingAddress, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

}
