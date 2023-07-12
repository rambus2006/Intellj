<!DOCTYPE html>
<html lang="en">
<?php
    //php연결코드
    $servername = "localhost";
    $username = "root";
    $password = "111111";
    $db_name = "user";   //db이름
    $conn = mysqli_connect($servername, $username, $password, $db_name, 3306);
    
    if($conn->connect_error){
        die("Connection failed".$conn->connect_error);
    }
    // function db_select($query, $param=array()){
    //     $pdo = db_get_pdo();
    //     try {
    //         $st = $pdo->prepare($query);
    //         $st->execute($param);
    //         $result =$st->fetchAll(PDO::FETCH_ASSOC);
    //         $pdo = null;
    //         return $result;
    //     } catch (PDOException $ex) {
    //         return false;
    //     } finally {
    //         $pdo = null;
    //     }
    // }
    
    // var_dump(db_select("select * from tbl_person"));
    // echo "<br />";
    // var_dump(db_select("select * from tbl_person where person_id = ?", array(1)));
    // echo "<br />";
    // var_dump(db_select("select * from tbl_person where person_id = :person_id", array('person_id' => 1)));
        
    
?>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>핏북,당신의 옷장을 책임져드립니다</title>
    <link rel="stylesheet" href="sidebars.css">
    <script src="https://kit.fontawesome.com/f7cec210fe.js" crossorigin="anonymous"></script> <!--아이콘 가져오기-->
</head>
<body>
    <header>

    </header>
    
</body>
</html>
