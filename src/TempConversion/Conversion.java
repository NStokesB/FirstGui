/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConversion;

/**
 *
 * @author NStokesBeamon
 */
public class Conversion {
    
    
    public final double conversionFah(String input){
        double temp = (Double.parseDouble(input)* 1.8) + 32;
       
        return temp;
    }
    
    public final double conversionCel(String input){
       
            double temp = (Double.parseDouble(input)-32) * 5/9;
            return temp;
        }
    }
