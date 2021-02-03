package com.FrancisExer_05_TCPExer1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.140", 10086);

        OutputStream os = s.getOutputStream();
        os.write("hello".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println(data);

        s.close();


    }
}
