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
public class prac3 {
    prac3(){
    NxtRobot r = new NxtRobot();
    Gear g = new Gear();
    r.addPart(g);
    g.setSpeed(100);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    
    Tools.delay(2000);
    r.exit();
  }
    public static void main(String[] args)
  {
    prac3 p =new prac3();
  }

}
