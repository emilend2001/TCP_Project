package service;

import utility.InputUtil;
import utility.IpAndPortUtilty;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPClient {
    public static void startTCPClient () throws Exception {

        String filePath =InputUtil.requireText("Faylin kecidini daxil edin");
        String ipAndPort=InputUtil.requireText("Serverin ip ve portunu daxil edin ");

        IpAndPortUtilty.ipAndPortFinder(ipAndPort);

        Socket socket = new Socket(IpAndPortUtilty.getIp(), IpAndPortUtilty.getPort());
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
        System.out.println("File ugurla gonderildi");
    }
}
