#웹 프레임워크 Flask
from datetime import datetime
#플라스크를 이용해 코드를 웹으로 구현할 수 있다.
def current_time():
    now = datetime.now() #현재 시간을 출력하는 함수 
    time_string = now.strftime("%Y년 %m월 %d일 %H시 %M분 %S초")
    return f"현재 시간 : {time_string}" #문자열 포맷팅을 통해 현재 시간을 할당하여 print함수로 출력 

if __name__=='__main__':
    print(current_time)
