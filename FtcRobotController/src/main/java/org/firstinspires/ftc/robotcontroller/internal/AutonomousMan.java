package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 * Created by sytect & tinanguyenn on 11/9/2016.
 * nah Andreaslc1103
 */
@Autonomous(name="Automan", group="hit that")
/// this is how it should possibly look like
public class AutonomousMan extends TeleOpTina {

    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        //intakeMotor2 = hardwareMap.dcMotor.get("intakeMotor2");
        shooterMotor = hardwareMap.dcMotor.get("shooterMotor");
        //colorSensor = hardwareMap.colorSensor.get ("colorSensor");
        //touch = hardwareMap.touchSensor.get("touchSensor");
        //CDI = hardwareMap.deviceInterfaceModule.get("DIM");

    waitForStart();

    // run until the end of the match (driver presses STOP)
    while (opModeIsActive()) {
        driveForward(1, 1000);
        turnLeft(1, 300);
        driveBackWards(1, 1000);
        turnRight(1, 300);

        idle(); // Always call idle() at the bottom of your while(opModeIsActive()) loop
    }
}




public void driveForward(int Power, int Time) throws InterruptedException{
        leftMotor.setPower(Power);
        rightMotor.setPower(Power);
        Thread.sleep(Time);
    }
    public void driveBackWards(int Power, int Time)throws InterruptedException{
        leftMotor.setPower(Power);
        rightMotor.setPower(Power);
        Thread.sleep(Time);
    }

    public void turnLeft(int Power, int Time) throws InterruptedException{
        leftMotor.setPower(-Power);
        rightMotor.setPower(Power);
        Thread.sleep(Time);
    }

    public void turnRight(int Power, int Time) throws InterruptedException{
        leftMotor.setPower(Power);
        rightMotor.setPower(-Power);
        Thread.sleep(Time);
    }

    public void shoot(int Power, int Time) throws InterruptedException{
        shooterMotor.setPower(Power);
        Thread.sleep(Time);
    }
    public void runIntake(int Power, int Time)throws InterruptedException{
        intakeMotor.setPower(Power);
        intakeMotor.setPower(Power);
        Thread.sleep(Time);
    }

}

