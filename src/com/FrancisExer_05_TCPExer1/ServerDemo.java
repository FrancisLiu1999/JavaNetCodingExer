package com.FrancisExer_05_TCPExer1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println(data);

        OutputStream os = s.getOutputStream();
        os.write("收到".getBytes(StandardCharsets.UTF_8));


        ss.close();


    }
}
