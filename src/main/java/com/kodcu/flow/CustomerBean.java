/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.flow;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author hakdogan
 */

@Named
@FlowScoped("customer")
public class CustomerBean implements Serializable {

    private String firstName;
    private String lastName;
    private String adressLine1;
    private String adressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    
    
    public CustomerBean() {
        System.out.println("CustomerBean has been created...");
    }
    
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getReturnValue() {
        return "/index";
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

    public String getAdressLine1() {
        return adressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
