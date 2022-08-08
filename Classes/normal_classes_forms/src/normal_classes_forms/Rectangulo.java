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
public class Rectangulo {
    private double width = 1.0;
    private double length = 1.0;
    
    
    Rectangulo(){
    }
    Rectangulo(double width, double length){
        
    }
    Rectangulo(double width, double length, String color, boolean filled){
    this.width = width;
    this.length = length;
    }
    public double getWidth(){
    return width;
    }
    public void setWidth(double width){
    this.width = width;
    }
    public double getLength(){
    return length;
    }
    public void setLenght(double length){
    this.length = length;
    }
    public double getArea(){
    double area = width*length;
    return area;
    }
    public double getPerimetro(){
    double perimetro = (width*2)+(length*2);
    return perimetro;
    }
    public String toString(){
    return null;
    }
    
    
    
    
}
