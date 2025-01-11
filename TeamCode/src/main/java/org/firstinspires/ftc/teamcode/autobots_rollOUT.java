package org.firstinspires.ftc.teamcode;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;


import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="AUTOBOTS roll out")
public class autobots_rollOUT extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        //init other mots
        DcMotor mot6 = hardwareMap.get(DcMotor.class, "mot6");
        DcMotor mot7 = hardwareMap.get(DcMotor.class, "mot7");
        DcMotor vipside = hardwareMap.get(DcMotor.class, "vipside");
        DcMotor vipmain = hardwareMap.get(DcMotor.class, "vipmain");
        mot6.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        vipmain.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        vipmain.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        mot6.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        mot6.setDirection(DcMotorSimple.Direction.REVERSE);
        vipside.setDirection(DcMotorSimple.Direction.REVERSE);

        PinpointDrive drive = new PinpointDrive(hardwareMap, new Pose2d(0, 0, 0));

        int x = 90;
        waitForStart();
        if (isStopRequested()) return;
        //while loop for stuff
        mot6.setTargetPosition(0);
        vipmain.setTargetPosition(0);/*
        while (opModeIsActive()) {

            if(mot6.getCurrentPosition()> mot6.getTargetPosition()-10 &&mot6.getCurrentPosition()< mot6.getTargetPosition()+10){
                mot6.setPower(.1);
            }
            else if (mot6.getCurrentPosition()> mot6.getTargetPosition()-50 &&mot6.getCurrentPosition()< mot6.getTargetPosition()+50){
                mot6.setPower(.1);
            }
            else if (mot6.getCurrentPosition()> mot6.getTargetPosition()-100 &&mot6.getCurrentPosition()< mot6.getTargetPosition()+100){
                mot6.setPower(.2);
            }
            else if (mot6.getCurrentPosition()> mot6.getTargetPosition()-200 &&mot6.getCurrentPosition()< mot6.getTargetPosition()+200){
                mot6.setPower(.5);
            }
            else{
                mot6.setPower(1);
            }


            if(mot6.getCurrentPosition()>mot6.getTargetPosition()) {
                mot7.setPower(-mot6.getPower());
            }else if (mot6.getCurrentPosition()<mot6.getTargetPosition()) {
                mot7.setPower(mot6.getPower());
            }

            if(vipmain.getCurrentPosition()> vipmain.getTargetPosition()-20 &&vipmain.getCurrentPosition()< vipmain.getTargetPosition()+20){
                vipmain.setPower(0);
            }
            else if (vipmain.getCurrentPosition()> vipmain.getTargetPosition()-50 &&vipmain.getCurrentPosition()< vipmain.getTargetPosition()+50){
                vipmain.setPower(.1);
            }
            else if (vipmain.getCurrentPosition()> vipmain.getTargetPosition()-100 &&vipmain.getCurrentPosition()< vipmain.getTargetPosition()+100){
                vipmain.setPower(.2);
            }
            else if (vipmain.getCurrentPosition()> vipmain.getTargetPosition()-200 &&vipmain.getCurrentPosition()< vipmain.getTargetPosition()+200){
                vipmain.setPower(.5);
            }
            else{
                vipmain.setPower(1);
            }

            vipmain.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            if(vipmain.getCurrentPosition()>vipmain.getTargetPosition()) {
                vipside.setPower(-vipmain.getPower());
            }else if (vipmain.getCurrentPosition()<vipmain.getTargetPosition()) {
                vipside.setPower(vipmain.getPower());
            }


            telemetry.addData("vipermain", vipmain.getCurrentPosition());
            telemetry.addData("target vipermain", vipmain.getTargetPosition());
            telemetry.addData("mot6", vipmain.getCurrentPosition());
            telemetry.addData("target mot6", mot6.getTargetPosition());
        }*/

            /*
                Stuff that needs to be added tp calculations, add 13 degrees to the turning
             */
        Actions.runBlocking(
                drive.actionBuilder(new Pose2d(0, 0, 0))  // Start the action builder at the initial pose
                        .strafeTo(new Vector2d(50, 0))
                        .turn(Math.PI)
                        .waitSeconds(5)
                        .build()
        );








            }
        }





