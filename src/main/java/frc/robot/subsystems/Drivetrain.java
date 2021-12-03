// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class Drivetrain extends SubsystemBase {
  TalonSRX firstLeft = new TalonSRX(2);
  TalonSRX firstRight = new TalonSRX(0);
  TalonSRX secondRight = new TalonSRX(1);
  TalonSRX secondLeft = new TalonSRX(3);
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    firstLeft.setInverted(true);
    secondLeft.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void testMotor(double speed){
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
}
