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
public class StringLongException extends Exception{
    
    String str = "";

    public StringLongException(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public String toString(){
    
        return "La palabra debe tener al menos 5 caracteres.";
        
    }
    
}
