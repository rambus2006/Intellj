package _25Stream;

import java.io.*;
import java.util.Scanner;

public class IOStudy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("temp/hello.txt");
        int c;
        //대입문을 비교?
        /* int x,y;
         *  x=y=100;
         * x에도 100, y에도 100
         * */
        while ((c = fr.read()) != -1) {  //현재 fr.read를 통해 가져온 값(c) 효율적인 데이터 구조를 위해 int안에(4byte)안에 2바이트값을 넣는다.
            System.out.println((char) c); //fr.read()에서는 - 가 나올 수 없는 이유(파일안에는 보이지 않지만 파일 내용이 끝나면 -1을 자동으로 반환한다. ) //char 타입으로 바꾸면 문자로 나온다.
        }
        //이렇게 쓰는 게 더 효율적
        while (true) {
            c = fr.read();
            if (c == -1) break;
            System.out.println((char) c);
        }
        fr.close(); // 다 썼으면 꼭 닫아줘야 한다.

        //바이너리 데이터
        FileInputStream fis = new FileInputStream("temp/hello.txt"); //다른 스트림 (스트림 연결 ) / 이진 데이터를 가져옴
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //보조스트림 (읽어온 데이터를 글자로 변환) ,UTF-8 의 문자 집합의 글자로 변환, /조금 더 확장

        int c2;
        while (true) {
            c2 = isr.read();
            if (c2 == -1) break;
            System.out.println((char) c2);
        }
        isr.close(); //보조 스트림에 있는 것만 쓰면 된다.


        FileWriter fw = new FileWriter("temp/writer_test.txt");//파일이 없으면 만들어줌(폴더는 안만들어줌)
        fw.write('A');
        fw.write("BC");


        char[] buf = new char[1024]; //0이 1024개가 ABC다음에 채워져 있다.
        //fw.write(buf, 0, buf.length); 0 이 채워지게 함
        fw.write(buf,2,4);
        fw.close();

//        FileWriter fw1 = new FileWriter("temp/test.txt");
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            String line = sc.nextLine();
//            if(line.equals("quit")) break;
//            fw1.write(line+"\n");
//
//        }
//        fw1.close();
        
        FileOutputStream fos = new FileOutputStream("temp/test.bin"); //바이너리 데이터의 약자 bin

        byte b[]={7,51,3,4,-1,24};
        for(int i=0;i<b.length;i++){
            fos.write(b[i]);//놓친 것 복습
        }
        fos.close();

        FileInputStream fis1 = new FileInputStream("temp/test.bin");
        int b1;
        while(true){
            b1= fis1.read();
            if(b1==-1) break;
            System.out.println((byte)b1); //아까 입력한 대로 6byte 가 나온다.

        }
        fis1.close();
    }
}
