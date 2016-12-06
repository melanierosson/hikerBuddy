/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hikingsafety;

/**
 *
 * @author amandabukur
 */
public class HikingSafetyTest {
    
    public static void main(String[] args) {
        HikingSafety hiker1 = new HikingSafety("Bob", "Watt", 125.0, 63.0);
        
       System.out.printf("%s %s has a BMI of %f%n", hiker1.getFname(), hiker1.getLname(), hiker1.bmiCalculator());
    }
}
