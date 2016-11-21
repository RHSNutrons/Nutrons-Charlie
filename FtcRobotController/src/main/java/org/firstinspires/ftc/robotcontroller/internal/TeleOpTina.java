package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**+k
 * Created by sytect & tinanguyenn on 10/17/2016.
 */

public class TeleOpTina extends OpMode {

    // declaring motors and sensors
    DcMotor leftMotor, rightMotor, intakeMotor, intakeMotor2, shooterMotor;
    ColorSensor colorSensor;
    TouchSensor touch;
    DeviceInterfaceModule CDI;
    double shooterSpeed=0;
    boolean touchState = false;
    boolean LEDState = true;

    @Override
    public void init() {

        // mapping
        leftMotor = hardwareMap.dcMotor.get("motor_1");
        rightMotor = hardwareMap.dcMotor.get("motor_2");
        intakeMotor = hardwareMap.dcMotor.get("intake_1");
        intakeMotor2 = hardwareMap.dcMotor.get("intake_2");
        shooterMotor = hardwareMap.dcMotor.get("shooter_1");
        colorSensor = hardwareMap.colorSensor.get ("color");
        touch = hardwareMap.touchSensor.get("feel");
        CDI = hardwareMap.deviceInterfaceModule.get("DIM");
    }

    @Override
    public void loop() {

        // movement
        float throttle = gamepad1.left_stick_y;
        float direction = gamepad1.left_stick_x;

        // powers
        float right = throttle - direction;
        float left = throttle + direction;
        leftMotor.setPower(left);
        rightMotor.setPower(-right);

        // touch sensor
        if (!touchState && touch.isPressed()) {
                touchState = true;
                LEDState = !LEDState;
                colorSensor.enableLed(LEDState);
        }else {
            touchState = false;
        }

        // color sensor
        colorSensor.enableLed(LEDState);

        float hsvValues[] ={0, 0, 0};

        if(colorSensor.red() > colorSensor.blue() && colorSensor.red() > colorSensor.green()) {
            CDI.setLED(1, true);
            CDI.setLED(0, false);
        }
        else if(colorSensor.blue() > colorSensor.red() && colorSensor.blue() > colorSensor.green()){
            CDI.setLED(1, false);
            CDI.setLED(0, true);
        }
        else{
            CDI.setLED(1, false);
            CDI.setLED(0, true);
        }

        // intake
        if(gamepad2.left_trigger>=0){
            intakeMotor.setPower(1);
            intakeMotor2.setPower(1);
        }

        // ramping speed
        if(gamepad1.x) {
            if(shooterSpeed == 1){
                shooterSpeed = 0;
                shooterMotor.setPower(shooterSpeed);
            }else {
                shooterSpeed += .25;
                shooterMotor.setPower(shooterSpeed);
            }
        }
    }

    @Override
    public void stop() {

    }


}

