package org.firstinspires.ftc.teamcode.Robot.PIkachu;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;


/**
 * Created by Man / Tina on 9/21/2016.
 */

public abstract class Robomap extends LinearOpMode {
    DcMotor rightMotor;
    DcMotor leftMotor;
    DcMotor intakeMotor;
    DcMotor shooterMotor;
    CRServo ramp;
    CRServo ramp2;

   @Override
    public void runOpMode() {
        rightMotor = this.hardwareMap.dcMotor.get("dcMotorRight");
        leftMotor = this.hardwareMap.dcMotor.get("dcMotorLeft");
        intakeMotor = this.hardwareMap.dcMotor.get("dcMotorIntake");
        shooterMotor = this.hardwareMap.dcMotor.get("dcMotorShooter");
        ramp = this.hardwareMap.crservo.get("servoRamp");
        ramp2 = this.hardwareMap.crservo.get("servoRamp2");
    }
}
