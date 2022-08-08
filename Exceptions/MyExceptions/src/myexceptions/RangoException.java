/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptions;

/**
 *
 * @author alexs
 */
public class RangoException extends Exception{
    
    private int num;

    public RangoException(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String toString(){
    
        return "ERROR: El numero tiene que ser entre 5 y 10";
        
    }
    
}
