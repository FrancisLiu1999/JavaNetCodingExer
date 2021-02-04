package com.FrancisExer_09_TCPExer5_InputFromFileOutputToFile_FeedBack;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.118", 10087);


        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_09_TCPExer5_InputFromFileOutputToFile_FeedBack\\OutputFile.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println(data);

        br.close();
        s.close();

    }
}
