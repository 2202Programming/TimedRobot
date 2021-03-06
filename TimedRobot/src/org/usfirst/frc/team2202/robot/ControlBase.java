package org.usfirst.frc.team2202.robot;

public abstract class ControlBase extends IControl {

	protected XboxController[] controllers;

	public ControlBase(boolean deadZone) {
		controllers=getControllers();
	}

	public abstract XboxController[] getControllers();
	
	/**
	 * getLeftJoystickX - returns the x value of the controller at
	 * controllers[port]
	 * 
	 * @param port
	 * @return
	 */
	public double getLeftJoystickX(int port) {
		return controllers[port].getLeftJoystickX();
	}

	/**
	 * getLeftJoystickY - returns the y value of the controller at
	 * controllers[port]
	 * 
	 * @param port
	 * @return
	 */
	public double getLeftJoystickY(int port) {
		return controllers[port].getLeftJoystickY();
	}

	/**
	 * getRightJoystickX - returns the x value of the right joystick of
	 * controller
	 * 
	 * @return
	 */
	public double getRightJoystickX(int port) {
		return controllers[port].getRightJoystickX();
	}

	/**
	 * getLeftJoystickY - returns the y value of the right joystick of
	 * controller
	 * 
	 * @return
	 */
	public double getRightJoystickY(int port) {
		return controllers[port].getRightJoystickY();
	}

	// turns left and right
	public double getLeftJoystickX() {
		return controllers[0].getLeftJoystickX();
	}

	/**
	 * getLeftJoyStickY - returns the y value of the left joystick of controller
	 * 0
	 * 
	 * @return
	 */
	public double getLeftJoystickY() {
		return controllers[0].getLeftJoystickY();
	}

	/**
	 * getRightJoystickX - returns the x value of the right joystick of
	 * controller 0
	 * 
	 * @return
	 */
	public double getRightJoystickX() {
		return controllers[0].getRightJoystickX();
	}

	/**
	 * getLeftJoystickY - returns the y value of the right joystick of
	 * controller 0
	 * 
	 * @return
	 */
	public double getRightJoystickY() {
		return controllers[0].getRightJoystickY();
	}
}
