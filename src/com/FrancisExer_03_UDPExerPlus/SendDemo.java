package com.FrancisExer_03_UDPExerPlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            //打包数据
            byte[] bys = line.getBytes(StandardCharsets.UTF_8);

            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.140"), 10086);

            ds.send(dp);
        }
        ds.close();
    }
}
