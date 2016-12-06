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
    double shooterSpeed = 0;
    boolean touchState = false;
    boolean LEDState = true;

    @Override
    public void init() {

        // mapping
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        //intakeMotor2 = hardwareMap.dcMotor.get("intakeMotor2");
        shooterMotor = hardwareMap.dcMotor.get("shooterMotor");
        //colorSensor = hardwareMap.colorSensor.get ("colorSensor");
        //touch = hardwareMap.touchSensor.get("touchSensor");
        //CDI = hardwareMap.deviceInterfaceModule.get("DIM");


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
        /*if (!touchState && touch.isPressed()) {
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
*/
        // intake let go
        if (gamepad2.x) {
            intakeMotor.setPower(-1);
            //intakeMotor2.setPower(-1);
        }
        // intake
        if (gamepad2.b) {
            intakeMotor.setPower(1);
            //intakeMotor2.setPower(1);
        }

        // slower shooting
        if (gamepad2.a) {
            shooterMotor.setPower(.25);
        }
        // faster shooting
        if (gamepad2.y) {
            shooterMotor.setPower(1);
        }

        // stop shooting & intake
        if (gamepad2.right_bumper) {
            shooterMotor.setPower(0);
            intakeMotor.setPower(0);
            //intakeMotor2.setPower(0);
        }
    }
    @Override
    public void stop() {

    }
}

