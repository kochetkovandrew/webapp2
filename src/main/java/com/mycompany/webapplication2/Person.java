/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapplication2;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


/**
 *
 * @author kochetkov
 */
@Table("people")
public class Person extends Model {
    
    public String BMIString;
    
    public String getBMIString() {
        return BMIString;
    }
    
    public void setBMIString(String newBMIString) {
        BMIString = newBMIString;
    }

    
    public String bmiString() {
        // float weight = Float.parseFloat((String) this.get("weight"));
        // float height = Float.parseFloat((String) this.get("height"));
        float weight = this.getFloat("weight");
        float height = this.getFloat("height");
        // float height = Float.parseFloat((String) this.get("height"));
        if (height != 0) {
            return Double.toString(weight / (height * height));
        } else {
            return "0.0";
        }
    }
    
}

