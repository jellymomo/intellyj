package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {  //예외던지기가 있으나 예시라 사용되지는 않았음
        write("총 정리하면, 이 코드는 문자 변환 스트림을 사용하여 텍스트 파일에 문자열을 쓰고 읽는 방법을 보여주는 예시입니다. 입출력 스트림을 조합하여 문자 인코딩 변환이나 텍스트 데이터의 처리를 효율적으로 수행할 수 있습니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception{
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");  //      FileOutputStream에 OutputStreamWriter
        Writer writer = new OutputStreamWriter(os, "UTF-8");  //       보조 스트림을 연결
        writer.write(str);   //
        writer.flush();      //  OutputStreamWriter 보조 스트림을 이용해서 문자 출력
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[300];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);  //char 배열에서 읽은 문자수만큼 문자열로 변환
        return str;
    }
}
