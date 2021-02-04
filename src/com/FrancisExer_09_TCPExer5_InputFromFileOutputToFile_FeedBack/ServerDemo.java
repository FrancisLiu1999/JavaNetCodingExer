package com.FrancisExer_09_TCPExer5_InputFromFileOutputToFile_FeedBack;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10087);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_09_TCPExer5_InputFromFileOutputToFile_FeedBack\\InputFile.txt"));

        String line;
        while ((line = br.readLine()) != null) {

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();
    }
}
