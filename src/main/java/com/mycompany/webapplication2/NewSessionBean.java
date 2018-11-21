/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapplication2;

import javax.ejb.Stateless;

/**
 *
 * @author kochetkov
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
       @Override
    public String calculateBMIString(float height, float weight) {
        return Double.toString(calculateBMI(height, weight));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public float calculateBMI(float height, float weight) {
        if (height != 0) {
            return weight / (height * height);
        } else {
            return (float) 0.0;
        }
    }

}
