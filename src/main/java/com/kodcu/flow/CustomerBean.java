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

    public CustomerBean() {
        System.out.println("CustomerBean has been created...");
    }
    
    
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getReturnValue() {
        return "/index";
    }    
}
