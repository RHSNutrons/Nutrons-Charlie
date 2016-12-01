package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 * Created by sytect & tinanguyenn on 11/9/2016.
 * nah Andreaslc1103
 */
@Autonomous(name="Automan", group="hit that")
/// this is how it should possibly look like
public class AutonomousMan extends TeleOpTina{
    public void main() throws InterruptedException{
        runIntake();
        driveForward();
        runIntake();
        invert();
        runIntake();
        driveForward();
        invert();
        runIntake();
        turnRight();


    }
    @Override
    public void stop(){

    }

}
