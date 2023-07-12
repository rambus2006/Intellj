<?php 
    $servername = "localhost";
    $username = "root";
    $password = "111111";
    $db_name = "user";   //db이름
    $conn = new mysqli($servername, $username, $password, $db_name, 3306);
    if($conn->connect_error){
        die("Connection failed".$conn->connect_error);
    }
    echo " ";
    
    ?>