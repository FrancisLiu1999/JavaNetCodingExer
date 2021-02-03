package com.FrancisExer_06_TCPExer2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.140", 10086);
        Scanner sc = new Scanner(System.in);
        OutputStream os = s.getOutputStream();
        String message;
        while (true) {
            message = sc.next();
            if (message.equals("886")) {
                break;
            }
            os.write(message.getBytes());

            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            String data = new String(bys, 0, len);
            System.out.println(data);

        }
    }
}
