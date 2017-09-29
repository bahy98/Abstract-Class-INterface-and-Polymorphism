/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line;

/**
 *
 * @author crowl
 */
public class Pengujian{
    public static void main (String[] args){
        Pengujian Line= new Pengujian();
        
        Line a = new Line(2,4,6,8);
        Line b = new Line(3,5,7,9);
        
        System.out.print("Tampilan hasil garis a: "+a+"Dengan garis b: "+b);
    }    
}
