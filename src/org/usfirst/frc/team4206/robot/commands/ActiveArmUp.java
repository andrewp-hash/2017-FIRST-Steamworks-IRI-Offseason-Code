package org.usfirst.frc.team4206.robot.commands;

import org.usfirst.frc.team4206.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ActiveArmUp extends Command {

    public ActiveArmUp() {
        requires(Robot.activegearfeeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Arm Up");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.activegearfeeder.armUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
