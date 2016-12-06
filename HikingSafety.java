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
public class HikingSafety {

    private String fname;
    private String lname;
    private int weight;
    private int height;
    
    public static void main(String[] args) {
        
    }
    
//    //sets hikers first name
//    public void setFname(String fname){
//        this.fname = fname;
//    }
//    
//    //retrieves the hikers first name
//    public String getFname(){
//        return fname;
//    }
//    
//        //sets hikers last name
//    public void setLname(String lname){
//        this.lname = lname;
//    }
//    
//    //retrieves the hikers last name
//    public String getLname(){
//        return lname;
//    }
    
        //sets hikers height
    public void setHeight(int height){
        this.height = height;
    }
    
    //retrieves the hikers height
    public int getHeight(){
        return height;
    }
    
            //sets hikers height
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    //retrieves the hikers height
    public int getWeight(){
        return weight;
    }
    
    //calculates the bmi
    public int bmi (int w, int h){
        int bmi = w/h*h;
        return bmi;
    }
    
}

