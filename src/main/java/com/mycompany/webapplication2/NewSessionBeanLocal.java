/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapplication2;

import javax.ejb.Local;

/**
 *
 * @author kochetkov
 */
@Local
public interface NewSessionBeanLocal {
    String calculateBMIString(float height, float weight);
    float calculateBMI(float height, float weight);
}
