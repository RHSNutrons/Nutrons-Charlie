package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**+k
 * Created by sytect on 10/17/2016.
 */

public class TeleOpTina extends OpMode {

    DcMotor leftMotor, rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("motor_1");
        rightMotor = hardwareMap.dcMotor.get("motor_2");
    }

    @Override
    public void loop() {
        float throttle = -gamepad1.left_stick_y;
        float direction = gamepad1.left_stick_x;

        float right = throttle - direction;
        float left = throttle + direction;

        leftMotor.setPower(left);
        rightMotor.setPower(-right);
    }

    @Override
    public void stop() {

    }
}
