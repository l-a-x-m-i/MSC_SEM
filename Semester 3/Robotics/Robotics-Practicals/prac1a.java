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
public class prac1a {
     prac1a(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(200);
            g.left(90);
            g.forward(200);
            //g.right(90);
        }
        
    }
    
    public static void main (String[] args) {
        prac1a p = new prac1a();
    }
    
}
