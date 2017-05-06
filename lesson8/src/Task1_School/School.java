/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_School;

/**
 *
 * @author Stanislav
 */
public class School {
    private String name;
    
    School(String name){
        setSchoolName(name);
    }
    
    public void setSchoolName(String name){
        this.name = name;
    }

    
    
    public String getSchoolName(){
        return name;
    }
    
}  
