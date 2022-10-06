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

public class prac2 {
     prac2(){
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        
        m1.forward();
        m2.forward();

        Tools.delay(2000);
        m1.stop();
        Tools.delay(1050);

        m1.forward();
        Tools.delay(2000);
        
        
        m2.stop();
        Tools.delay(2000);
        m2.forward();
        Tools.delay(2000);
        r.exit();
    }
    
    public static void main(String args[]){
        prac2 p =new prac2();
    }
    
}
