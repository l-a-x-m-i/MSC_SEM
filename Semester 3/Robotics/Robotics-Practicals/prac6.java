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

public class prac6 {
    prac6(){
    NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        LightSensor ls1=new LightSensor(SensorPort.S1);
        LightSensor ls2=new LightSensor(SensorPort.S2);
        robot.addPart(gear);
        robot.addPart(ls1);
        robot.addPart(ls2);
        gear.forward();
        gear.setSpeed(100);
   
        while(true)
        {
            int rightValue=ls1.getValue();
            int leftValue=ls2.getValue();
            if(leftValue < 10)
                gear.rightArc(0.05);
            if(rightValue < 10)
                gear.leftArc(0.05);
            if(leftValue > 10 && rightValue > 10)
                gear.forward();
        }
    }
    public static void main(String args[])
    {
        prac6 p =new prac6();
    }
    static
    {
        NxtContext.setStartPosition(267,232);
        NxtContext.setStartDirection(-90);
        NxtContext.useBackground("sprites/path.gif");
    }
    
}
