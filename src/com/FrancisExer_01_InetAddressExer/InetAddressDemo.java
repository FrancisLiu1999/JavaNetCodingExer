package com.FrancisExer_01_InetAddressExer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("木头人i");
        //InetAddress address=InetAddress.getByName("192.168.0.140");

        String name=address.getHostName();

        String ip=address.getHostAddress();

        System.out.println("主机名"+name);
        System.out.println(ip);
    }
}
