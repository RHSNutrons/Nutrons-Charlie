package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**+k
 * Created by sytect & tinanguyenn on 10/17/2016.
 */

public class TeleOpTina extends LinearOpMode {

    /* Declare OpMode members. */
    private ElapsedTime runtime = new ElapsedTime();
    // declaring motors and sensors
    DcMotor rotateMotor;
    DcMotor driveMotor;


    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        rotateMotor = hardwareMap.dcMotor.get("rotateMotor");
        driveMotor = hardwareMap.dcMotor.get("driveMotor");

        rotateMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);

        int TICKS_PER_DEGREE = 4;

        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();

            float throttle = gamepad1.left_stick_y;
            float direction = gamepad1.right_stick_x;

            //DcMotor.Direction d = ;

            if(direction > 0.3){
                //rotateMotor.setDirection(d);
            }

            driveMotor.setPower(throttle);

            idle(); // Always call idle() at the bottom of your while(opModeIsActive()) loop
        }
    }
}


