import sqlite3
from flask import Flask, request,render_template
from sqlite3 import Error

con = sqlite3.connect('FitBook.db')
cursor_db = con.cursor()
'''
try:
    con = sqlite3.connect(':memory')
    print("DBcreated")
except Error:
    print(Error)
finally:
    con.close()'''
#테이블 생성
#cursor_db.execute("CREATE TABLE TEST_TABLE(name text,age interger)")

#데이터 추가 
cursor_db.execute("INSERT INTO TEST_TABLE VALUES(?,?)",('ali',23))
cursor_db.execute("INSERT INTO TEST_TABLE VALUES(?,?)",('흰색티셔츠1',20230623))


#데이터 조회
cursor_db.execute("SELECT * FROM TEST_TABLE")
testdata=cursor_db.fetchall()

