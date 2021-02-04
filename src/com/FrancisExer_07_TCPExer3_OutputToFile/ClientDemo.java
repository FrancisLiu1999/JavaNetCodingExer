package com.FrancisExer_07_TCPExer3_OutputToFile;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.118", 10086);

        //数据键盘录入
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //封装输出流对象，和Server配套使用
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String message;
        while ((message=br.readLine())!=null) {

            if (message.equals("886")) {
                break;
            }
            bw.write(message);
            bw.newLine();
            bw.flush();

        }
        s.close();
    }
}
