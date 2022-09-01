import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ourFirstServerSocket = new ServerSocket(6767);

        while (true) {
            System.out.println("Server hazirdir .....");
            Socket connection = ourFirstServerSocket.accept();

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());

            byte[] arr = readMessage(dataStream);
            Files.write(Paths.get("test.jpg"), arr);
        }
    }
    public static byte[] readMessage(DataInputStream din) throws Exception {
        int msgLen = din.readInt();//
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }
}
