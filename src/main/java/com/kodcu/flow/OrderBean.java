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
@FlowScoped("order")
public class OrderBean implements Serializable {

    public OrderBean() {
        System.out.println("OrderBean has been created...");
    }
    
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getReturnValue() {
        return "/index";
    }
    
}
