package ch19.sec05.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public class EchoServer {
    private static ServerSocket serverSocket = null;
    private static ExecutorService executorService =
            Executor.newFixedThreadPool(10);

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("--------------------------------------------------");

        //TCP 서버 시작
        startServer();

        //키보드 입력
        Scanner scanner = new Scanner(System.in);
    }
}
