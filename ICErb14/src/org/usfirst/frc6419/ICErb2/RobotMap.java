// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6419.ICErb2;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

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
    public static SpeedController driveTrainDriveMotor1;
    public static SpeedController driveTrainDriveMotor2;
    public static SpeedController driveTrainDriveMotor3;
    public static SpeedController driveTrainDriveMotor4;
    public static RobotDrive driveTrainMainChassis;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainDriveMotor1 = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "DriveMotor1", (VictorSP) driveTrainDriveMotor1);
        
        driveTrainDriveMotor2 = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "DriveMotor2", (VictorSP) driveTrainDriveMotor2);
        
        driveTrainDriveMotor3 = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "DriveMotor3", (VictorSP) driveTrainDriveMotor3);
        
        driveTrainDriveMotor4 = new VictorSP(4);
        LiveWindow.addActuator("DriveTrain", "DriveMotor4", (VictorSP) driveTrainDriveMotor4);
        
        driveTrainMainChassis = new RobotDrive(driveTrainDriveMotor2, driveTrainDriveMotor1, driveTrainDriveMotor4, driveTrainDriveMotor3);
        
        
        driveTrainMainChassis.setSafetyEnabled(true);
        driveTrainMainChassis.setExpiration(0.1);
        driveTrainMainChassis.setSensitivity(0.5);
        driveTrainMainChassis.setMaxOutput(1.0);

        //driveTrainMainChassis.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        //driveTrainMainChassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}