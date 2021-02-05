package com.FrancisExer_10_TCPExer6_ServerThreadExer;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;

    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //BufferedWriter bw=new BufferedWriter(new FileWriter(""));
            //解决名称冲突
            int count = 0;
            File file = new File("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_10_TCPExer6_ServerThreadExer\\copy[" + count + "].java");
            while (file.exists()) {
                count++;
                file = new File("C:\\Users\\liume\\Desktop\\hrmup\\JavaNetCodingExer\\src\\com\\FrancisExer_10_TCPExer6_ServerThreadExer\\copy[" + count + "].java");

            }

            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }


            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("上传成功");
            bwServer.newLine();
            bwServer.flush();

            s.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
