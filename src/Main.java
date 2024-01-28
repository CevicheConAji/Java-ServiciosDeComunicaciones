import java.net.InetAddress;
import java.net.UnknownHostException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("SALIDA PARA LOCALHOST:");
        try {
            InetAddress dir = InetAddress.getByName("localhost");
            pruebaMetodos(dir);
            System.out.println("=========================");
            System.out.println("SALIDA PARA UNA URL");

            dir = InetAddress.getByName("www.google.es");
            pruebaMetodos(dir);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pruebaMetodos(InetAddress dir){
        System.out.println("\tMetodo getName(): " + dir);
        InetAddress dir2;

        try {
            dir2 = InetAddress.getLocalHost();

            System.out.println("\tMetodo getLocalHost(): " + dir2);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\tMetodo getHostName(): " + dir.getHostName());
        System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMetodo toSting(): " + dir);
        System.out.println("\tMetodo getCAnnonicalHostName: " + dir.getCanonicalHostName());


    }
}