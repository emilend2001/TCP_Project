package utility;

public class IpAndPortUtilty {

    public static String ip;
    public static int port;
    public static void ipAndPortFinder(String ipAndPort){

        String [] arr=ipAndPort.split(":");
        ip=arr[0];
        port=Integer.parseInt(arr[1]);

    }

    public static String getIp (){
        return ip;
    }

    public static int getPort(){
        return port;
    }
}
