package org.firstinspires.ftc.robotcontroller.internal.PIkachu.test;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by Tina & Man on 9/22/2016.
 */

public class java extends OpMode {
    public DcMotorController dc_drive_controller;

    public DcMotor leftMotor;
    public DcMotor rightMotor;

    @Override
    public void init () {
        dc_drive_controller = hardwareMap.dcMotorController.get("drive_controller");
        leftMotor = hardwareMap.dcMotor.get("Drive_left");
        rightMotor = hardwareMap.dcMotor.get("drive_right");
    }

    @Override
    public void loop () {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
}

