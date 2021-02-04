package com.FrancisExer_08_TCPExer4_InputFromFileOutputToFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);

        Socket s=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_08_TCPExer4_InputFromFileOutputToFile\\OutputFile.txt"));

        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        ss.close();
    }
}
