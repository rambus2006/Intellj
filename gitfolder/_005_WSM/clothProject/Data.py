# 데이터베이스 이름이 "mydatabase"인 데이터베이스 만드는 코드
import mysql.connector

mydb = mysql.connector.connect(
	host="localhost",
    user="yourusername",
    password="yourpassword"
    )
 
mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE mydatabase")