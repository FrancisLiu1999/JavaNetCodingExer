package com.FrancisExer_06_TCPExer2_OutputTocControlTable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket accept = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line = br.readLine()) !=null){


            System.out.println(line);

            OutputStream os = accept.getOutputStream();
            os.write("收到".getBytes());

        }

        ss.close();
    }
}
