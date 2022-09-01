package main;

import service.TCPClient;
import utility.UserUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        UserUtil.login();
        TCPClient.startTCPClient();

    }
}
