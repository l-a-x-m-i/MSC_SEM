/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotics_practical;

/**
 *
 * @author sreej
 */
import ch.aplu.robotsim.*;
public class prac1b {
     prac1b(){
        TurtleRobot t = new TurtleRobot();
        t.forward(200);
        t.left(90);
        t.forward(200);
        t.left(90);
        t.forward(200);
    }
    
    public static void main (String[] args) {
        prac1b m = new prac1b(); 
    }
}
