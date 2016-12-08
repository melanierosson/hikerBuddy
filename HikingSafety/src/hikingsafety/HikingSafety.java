
/*
 * CIS 043 Term Project
 * Hiking Safety
 * Group 7:
 * Melanie Rosson
 * Amanda Bukur
 * Richard Inocencio
 */
//package hikingsafety;

public class HikingSafety
{
    private String fname;
    private String lname;
    private int phone;
    private boolean leader;
    private double fitLevel;
    private double gender;
    private double weight;
    private double height;
    private double age;
    private double intensity;
    private double tripLen;
    private double fitval;
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
    
    //set gender
    public void setGender(Double gender){
        this.gender = gender;
    }
    
    //retrieves the hikers last name
    public Double getGender(){
        return gender;
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
    public double BMI(){
        double w = getWeight();
        double h = getHeight();
        double bmi;
        bmi = w/(h*h);
        return bmi;
    }
    
    //set phone;
    public void setPhone(int phone){
        this.phone = phone;
    }
    //retrieve phone;
    public int getPhone(){
        return phone;
    }
    //set leader;
    public void setLeader(boolean leader){
        this.leader = leader;
    }
    //retrieve leader;
    public void getLeader(){
        return;
    }
    //set fitLevel;
    public void setfitLevel(double fitLevel){
        this.fitLevel = fitLevel;
    }
    //retrieve fitLevel;
    public double getFitLevel(){
        return fitLevel;
    }
    
    //determine and return fitness level value
    //*** we need to check that they are only entering 1-3
    public double getFitLevelVal(){
        
        double fitVal = 1;
        if (fitLevel == 1 || fitLevel == 2 || fitLevel == 3)

            if (fitLevel == 1.2)
                fitVal = 1;
            else if (fitLevel == 2)
                    fitVal = 1.1;
            else
                    fitVal = 1;
        return fitVal;
    }
    
    //set age;
    public void setAge(double age){
        this.age = age;
    }
    //retrieve age;
    public double getAge(){
        return age;
    }
    
    //determine and return age level value
    public double getAgeVal(){
        
        double ageVal = 1;

            if (age < 18)
                ageVal = 1;
            else if (age >=18 || age <25)
                ageVal = 1;
            else if (age >=26 || age <35)
                ageVal = 1;  
            else if (age >=35 || age <50)
                ageVal = 1.01; 
            else 
                ageVal = 1.02;
        return ageVal;
    }
        
    //set intensity;
    public void setIntensity(double intensity){
        this.intensity = intensity;
    }
    //retrieve intensity;
    public double getInstensity(){
        return intensity;
    }
    
    //determine and return intensity level value
    //*** we need to check that they are only entering 1-4
    public double getIntensityVal(){
        
        double intensityVal = 1;

            if (intensity ==1)
                intensityVal = 1;
            else if (intensity ==2)
                intensityVal = 1.2;
            else if (intensity ==3)
                intensityVal = 1.4;  
            else
                intensityVal = 1.5; 
        return intensityVal;
    }    
    //set tripLen;
    public void setTripLen(double tripLen){
        this.tripLen = tripLen;
    }
    //retrieve tripLen;
    public double getTripLen(){
        return tripLen;
    }
    
    //calculate the required water
    public double reqWater(){
        double calories = (2*getGender()*getFitLevelVal()*BMI()*getAgeVal()*getIntensityVal()*getTripLen());
        return calories; 
    }
    
//calculate the required calories
    public double reqCal(){
        double calories = 2500*BMI()*getIntensityVal()*getTripLen();
        return calories; 
    }
}

