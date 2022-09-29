package robotics;


import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
/**
 *
 * @author admin
 */
public class RobotCircle {
    static{
      RobotContext.useBackground("C://Users//Akshay//Downloads//Robotics (2)//Robotics//Robotics//sprites/yellowpath.gif");
      RobotContext.setStartPosition(430,230);
      RobotContext.setStartDirection(-90);
    }
    public RobotCircle() {
        LegoRobot legoRobot = new LegoRobot();
        Gear gear = new Gear();
        LightSensor left = new LightSensor(SensorPort.S2);
        LightSensor right  = new LightSensor(SensorPort.S1);
        LightSensor middle = new LightSensor(SensorPort.S3);
        
        legoRobot.addPart(gear);
        legoRobot.addPart(left);
        legoRobot.addPart(right);
        legoRobot.addPart(middle);
        
        gear.forward();
        gear.setSpeed(100);
        
        double arcLength = 0.1;
        while(true){
            int rightvalue = right.getValue();
            int lightSensorDiff = rightvalue - left.getValue();
            
            if(middle.getValue() < 100){
                gear.stop();
            }
            if(lightSensorDiff > 100){
                gear.rightArc(arcLength);
            }
            else if(lightSensorDiff < -100){
                gear.leftArc(arcLength);
            }
            else{
                if(rightvalue > 500){
                    gear.forward();
                }
            }
        }
        
        
        
    }
    public static void main(String[] args){
        new RobotCircle();
    }
}
