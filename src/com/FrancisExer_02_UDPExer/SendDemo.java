package com.FrancisExer_02_UDPExer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import java.nio.charset.StandardCharsets;

public class SendDemo {
        public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();

        //打包数据
        byte[] bys="hello,udp".getBytes(StandardCharsets.UTF_8);

        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.0.140"),10086);

        ds.send(dp);

        ds.close();
    }
}
