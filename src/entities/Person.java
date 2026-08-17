package entities;

import interfaces.Displayable;

public class Person implements Displayable {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;

    public Person(
            String id
            ,String firstName
            ,String lastName
            ,String dateOfBirth
            ,String gender
            ,String phoneNumber
            ,String email
            ,String address
            ) {
        setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        if (utils.HelperUtils.isEmpty(id)) {
            IO.println("ID connot be empty. Keeping the old ID.");
            return;
        }
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void displayInfo() {
        IO.println(
                "Person: " +firstName+ " "
                        +lastName+ "(id: "+id+")");
    }

    @Override
    public String displaySummary() {
        return id + " _ " + firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{id="+id+", name="+firstName+" "+lastName+"}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof Person)) return false;
        Person p = (Person) other;
        return this.id.equals(p.id);
    }
}
