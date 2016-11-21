package org.firstinspires.ftc.robotcontroller.internal;

/**
 * Created by sytect & tinanguyenn on 11/9/2016.
 */

public class AutonomousMan extends TeleOpTina{
    public void main() throws InterruptedException{

        //drive forward
        leftMotor.setPower(1);
        rightMotor.setPower(1);
        Thread.sleep(3000);

        //stop
        leftMotor.setPower(0);
        rightMotor.setPower(0);

        //shoot
        shooterMotor.setPower(1);
        Thread.sleep(4000);

        //stop shooter
        shooterMotor.setPower(0);

        //tap ball
        leftMotor.setPower(1);
        rightMotor.setPower(1);
        Thread.sleep(3000);
    }


}
