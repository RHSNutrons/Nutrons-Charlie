package org.firstinspires.ftc.robotcontroller.internal.PIkachu;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


/**
 * Created by Man / Tina on 9/21/2016.
 */

public abstract class Robomap extends OpMode {
    DcMotor rightMotor;
    DcMotor leftMotor;
    DcMotor intakeMotor;
    DcMotor shooterMotor;
    CRServo ramp;
    CRServo ramp2;

   @Override
    public void init() {
        rightMotor = this.hardwareMap.dcMotor.get("dcMotorRight");
        leftMotor = this.hardwareMap.dcMotor.get("dcMotorLeft");
        intakeMotor = this.hardwareMap.dcMotor.get("dcMotorIntake");
        shooterMotor = this.hardwareMap.dcMotor.get("dcMotorShooter");
        ramp = this.hardwareMap.crservo.get("servoRamp");
        ramp2 = this.hardwareMap.crservo.get("servoRamp2");
    }
    @Override
    public void loop() {
        rightMotor.setPower(0);
        leftMotor.setPower(0);
    }
@Override
    public void stop(){
    }
}
