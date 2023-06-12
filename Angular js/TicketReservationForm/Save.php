<?php
$con = new mysqli("localhost", "root", "", "angulardb");
if (mysqli_connect_errno()) {
 echo "Failed to connect to MySQL: " . mysqli_connect_error();
 exit();
}
$data = json_decode(file_get_contents("php://input"));
$name = mysqli_real_escape_string($con,$data->name);
$email = mysqli_real_escape_string($con,$data->email);
$phone = mysqli_real_escape_string($con,$data->phone);
$noofticket = mysqli_real_escape_string($con,$data->noofticket);
$destination = mysqli_real_escape_string($con,$data->destination);
$amount = mysqli_real_escape_string($con,$data->amount);
$sql="INSERT INTO `ticket`(`Name`, `Email`, `Phone`, `NoofTicket`, `Destination`, `Amount`) VALUES
('$name','$email','$phone','$noofticket','$destination','$amount')";
if ($con -> query($sql)) {
 echo("Your Ticket Booked");
}
else
{
 echo("Something issue".$con->error);
}
?> 