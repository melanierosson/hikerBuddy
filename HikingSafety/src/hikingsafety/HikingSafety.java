/*
 * CIS 043 Term Project
 * Hiking Safety
 * Group 7:
 * Melanie Rosson
 * Amanda Bukur
 * Richard Inocencio
 */
package hikingsafety;

public class HikingSafety
{
    private String fname;
    private String lname;
    private double weight;
    private double height;
//    private double bmi;
    
public HikingSafety(String fname, String lname, double weight, double height)
{
    this.fname = fname;
    this.lname = lname;
    this.weight = weight;
    this.height = height;
}
    //sets hikers first name
    public void setFname(String fname){
        this.fname = fname;
    }
    
    //retrieves the hikers first name
    public String getFname(){
        return fname;
    }
    
        //sets hikers last name
    public void setLname(String lname){
        this.lname = lname;
    }
    
    //retrieves the hikers last name
    public String getLname(){
        return lname;
    }
    
        //sets hikers height
    public void setHeight(double height){
        this.height = height;
    }
    
    //retrieves the hikers height
    public double getHeight(){
        height = height*0.025;
        return height;
    }
    
            //sets hikers height
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    //retrieves the hikers height
    public double getWeight(){
        weight = weight*0.45;
        return weight;
    }
    
    //calculates the bmi
    public double bmiCalculator (double w, double h){
        double bmi = w/(h*h);
        return bmi;
    }
    
    
}
