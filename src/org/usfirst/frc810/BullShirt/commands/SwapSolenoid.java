package org.usfirst.frc810.BullShirt.commands;

import org.usfirst.frc810.BullShirt.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class SwapSolenoid extends InstantCommand {

	
	
	
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	protected void initialize(){
		
	}
	
	protected void execute(){
		
		RobotMap.cannonValveFill1.set(!RobotMap.cannonValveFill1.get());
		RobotMap.cannonValveFill2.set(!RobotMap.cannonValveFill2.get());
		
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}

}
