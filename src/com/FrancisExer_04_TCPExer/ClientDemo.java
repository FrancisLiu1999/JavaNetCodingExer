package com.FrancisExer_04_TCPExer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.0.140",10086);

        OutputStream os = s.getOutputStream();
        os.write("hello".getBytes(StandardCharsets.UTF_8));

        s.close();


    }
}
