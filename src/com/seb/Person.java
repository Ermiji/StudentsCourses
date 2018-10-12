package com.seb;

public class Person {

    private String fName;
    private String lName;
    private String eAddress;
    private int idNumber;


    public Person(){
        this.fName = "";
        this.lName = "";
        this.eAddress = "";
        this.idNumber = 0;
    }

    public Person(String fName, String lName, String eAddress,
                  int idNumber){

        this.fName = fName;
        this.lName = lName;
        this .eAddress = eAddress;
        this.idNumber = idNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String toString(){
         return "ID Number: " +       idNumber + "\n" +
                " First Name: " +    fName + "\n" +
                " Last Name: " +     lName + "\n" +
                " Email name: " +    eAddress + "\n";
    }

    public String getDescription(){
        return getDescription();
    }
}
