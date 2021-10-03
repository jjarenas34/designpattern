package com.example.designpattern.abstractfactory;

import java.util.Date;
public class Customer {
    private String firstName;
    private String lastName;
    private Date brithDate;
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
    public Date getBrithDate() {
        return brithDate;
    }
    public void setBrithDate(Date brithDate) {
        this.brithDate = brithDate;
    }
}
