let nowDate = new Date();

//먼저 윤달을 계산해야한다.
let year = nowDate.getFullYear();
let lastDay = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
let month = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

//아래의 조건문이 윤달을 계산하는 방법이다.
if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
    lastDay[1] = 29;
} else {
    lastDay[1] = 28;
}

//이번달을 구해야한다. 달이 -1로 나오는데 0부터 시작하기 때문이다.
let thisMonth = new Date(nowDate.getFullYear(), nowDate.getMonth()).getMonth();
//그리고 지난달의 마지막 요일 인덱스를 변수로 지정한다.
let prevMonthDay = new Date(nowDate.getFullYear(), thisMonth).getDay();

let thisDate = month[thisMonth];
let date = lastDay[thisMonth];

//*실제 달력 만드는 코드
//문자열로 마크업을 시작한다.
//문자열 자체를 반복문을 이용해 만들어 준다. 
let tag = "<tr>";

if(nextData===this.$proA.innerHTML){
    let count = 0;
    //지난달의 마지막 요일 인덱스까지 빈배열로 반복문 시작
    for (let j = 0; j < thisMonthDay; j++) {
        tag += `<td></td>`;
        count++;
    }
    
    //지난달의 마지막 요일 이후부터 이번달의 마지막일까지 반복
    for (let i = 1; i <= date; i++) {
    	//7일씩 tr로 묶기
        if (count % 7 === 0) {
            tag += "<tr>";

        }
        //조건은 쉬는 날을 지정. 따로 classname을 부여. count시작
        if(((thisDate==="Jan"&& i===1)||(thisDate==="Feb"&& (i===11||i===12||i===13))||(thisDate==="Mar"&& i===1)||(thisDate==="May"&& (i===5||i===19))||(thisDate==="Aug"&& (i===20||i===21||i===22)))||(count % 7 === 0||count % 7 === 6)){
            tag += `<td class="xday"><p>${i}</p></td>`;
            count++;
        }else if(count%7===2||count%7===4){
            tag += `<td class="Ahalf"><p>${i}</p></td>`;
            count++;
        }
        else{
            tag += `<td class="pickday"><p>${i}</p></td>`;
            count++;
        }
        //7일이 끝나면 tr태그 닫기
        if (count % 7 === 0) {
            tag += "</tr>";
            }

    }

}