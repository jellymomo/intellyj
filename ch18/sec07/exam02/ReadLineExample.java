package ch18.sec07.exam02;

import ch18.sec07.exam01.BufferExample;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
        );

        int lineNO = 1;
        while (true) {
            String str = br.readLine();

        }

    }
}
