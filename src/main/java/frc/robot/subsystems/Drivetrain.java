// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj.Talon;

public class Drivetrain extends SubsystemBase {
  WPI_TalonSRX firstLeft = new WPI_TalonSRX(2);
  WPI_TalonSRX firstRight = new WPI_TalonSRX(0);
  WPI_TalonSRX secondRight = new WPI_TalonSRX(1);
  WPI_TalonSRX secondLeft = new WPI_TalonSRX(3);
 

  public DifferentialDrive drive = new DifferentialDrive(new SpeedControllerGroup(firstLeft,secondLeft), new SpeedControllerGroup(firstRight, secondRight));

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    firstLeft.setInverted(true);
    secondLeft.setInverted(true);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /*public void testMotor(double speed){
    firstLeft.set(TalonSRXControlMode.PercentOutput, speed);
    firstRight.set(TalonSRXControlMode.PercentOutput, speed);
    secondLeft.set(TalonSRXControlMode.PercentOutput, speed);
    secondRight.set(TalonSRXControlMode.PercentOutput, speed);
  }

  public void fourMotors(double firstLeftOutput, double secondLeftOutput, double firstRightOutput, double secondRightOutput){
    firstLeft.set(TalonSRXControlMode.PercentOutput, firstLeftOutput);
    firstRight.set(TalonSRXControlMode.PercentOutput, firstRightOutput);
    secondLeft.set(TalonSRXControlMode.PercentOutput, secondLeftOutput);
    secondRight.set(TalonSRXControlMode.PercentOutput, secondRightOutput);
  }
  */
  public void drive (double x, double turn){
    drive.arcadeDrive(x,turn);
    System.out.println(x);
    System.out.println(turn);
  }
  
}
