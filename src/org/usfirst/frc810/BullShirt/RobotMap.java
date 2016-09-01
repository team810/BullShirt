// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.BullShirt;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveLeftFront;
    public static SpeedController driveRightFront;
    public static SpeedController driveLeftBack;
    public static SpeedController driveRightBack;
    public static RobotDrive driveRobotDrive;
    public static Compressor cannonCompressor;
    public static Solenoid cannonValve;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveLeftFront = new Spark(0);
        LiveWindow.addActuator("Drive", "LeftFront", (Spark) driveLeftFront);
        
        driveRightFront = new Spark(1);
        LiveWindow.addActuator("Drive", "RightFront", (Spark) driveRightFront);
        
        driveLeftBack = new Spark(2);
        LiveWindow.addActuator("Drive", "LeftBack", (Spark) driveLeftBack);
        
        driveRightBack = new Spark(3);
        LiveWindow.addActuator("Drive", "RightBack", (Spark) driveRightBack);
        
        driveRobotDrive = new RobotDrive(driveLeftFront, driveLeftBack,
              driveRightFront, driveRightBack);
        
        driveRobotDrive.setSafetyEnabled(true);
        driveRobotDrive.setExpiration(0.1);
        driveRobotDrive.setSensitivity(0.5);
        driveRobotDrive.setMaxOutput(1.0);

        cannonCompressor = new Compressor(0);
        
        
        cannonValve = new Solenoid(0, 0);
        LiveWindow.addActuator("Cannon", "Valve", cannonValve);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
