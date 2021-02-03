package com.FrancisExer_03_UDPExerPlus;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

//        byte[] datas= dp.getData();
//        int len=dp.getLength();
            String dataString = new String(dp.getData(), 0, dp.getLength());
            System.out.println(dataString);
        }


    }
}
