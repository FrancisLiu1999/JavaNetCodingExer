package com.FrancisExer_08_TCPExer4_InputFromFileOutputToFile;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.118", 10086);


        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_08_TCPExer4_InputFromFileOutputToFile\\InputFile.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        s.close();

    }
}
