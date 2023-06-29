package com.apitest.controller;

import java.net.InetAddress;

public class IPDetector {
    public static String getIpAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return "IP" + localHost.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return "Error: Cannot get IP addr.";
    }
}
