/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.flow;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

/**
 *
 * @author hakdogan
 */

public class Customer implements Serializable {
    
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "customer";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        
        flowBuilder.returnNode("returnFromCustomerFlow")
                   .fromOutcome("#{customerBean.returnValue}");
        
        return flowBuilder.getFlow();
    }
}
