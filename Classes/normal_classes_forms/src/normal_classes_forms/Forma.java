/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normal_classes_forms;

/**
 *
 * @author alexruedadev
 */
public class Forma {
    private String color= "red";
    private boolean filled = true;
    
    Forma(){
    }
    Forma(String color, boolean filled){
    this.color = color;
    this.filled = true;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
    this.color = color;
    }
    
    public boolean isFilled(){
    return true;
    }
    
    public void setFilled(boolean filled){
    
    }
}
