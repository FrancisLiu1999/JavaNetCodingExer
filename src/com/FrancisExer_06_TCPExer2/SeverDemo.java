package com.FrancisExer_06_TCPExer2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        while (true) {


            byte[] bys = new byte[1024];
            int len = is.read(bys);
            String data = new String(bys, 0, len);
            System.out.println(data);

            OutputStream os = accept.getOutputStream();
            os.write("收到".getBytes());

        }


    }
}
