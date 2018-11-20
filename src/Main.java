import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: java -jar DnsLookup.jar <IP name>");
            System.exit(0);
        }

        lookup(args);
    }


    static void lookup(String[] args) {
        InetAddress hostAddress;

        try {
            hostAddress = InetAddress.getByName(args[0]);
            System.out.println(hostAddress.getHostAddress());
        } catch (UnknownHostException uhe) {
            System.err.println("Unknown host: " + args[0]);
        }
    }

}
