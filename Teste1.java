package com.suzano.irlan;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Teste1 - a robot by Irlan
 */
public class Teste1 extends AdvancedRobot
{

	public void run() {
		setColors(Color.red,Color.black,Color.green); // body,gun,radar

		while(true) {
			setTurnRight(90);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
	public void onHitByBullet(HitByBulletEvent e) {
		turnGunRight(180);
		ahead(100);
	}
	public void onHitWall(HitWallEvent e) {
		setBack(50);
    	setTurnRight(90);
	}
	public void onHitRobot(HitRobotEvent e) {
    setBack(50);
    setTurnRight(90);
  }
}
