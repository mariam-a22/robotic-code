DcMotor leftfront;

leftfront = hardwareMap.get(DcMotor.class, "leftfront");


//Binds leftfront to a botton
if(gamepad1.a){
  leftfront.setPower(-1);
}

else{
  leftfront.setPower(0);
}

//Bind to a joystick

double leftfrontpower;

leftfrontpower = gamepad1.right_stick_y;

leftfront.setPower(leftfrontpower);
