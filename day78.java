import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "kominfo123";
        String password = "kominfoid123";
        System.out.println("Selamat datang di sistem login Kominfo Indonesia!");
        while (true) {
            System.out.print("Masukkan username: ");
            String iu = in.nextLine();
            System.out.print("Masukkan password: ");
            String ip = in.nextLine();
            if (iu.equals(username) && ip.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Try Again!");
            }
        }
    }
}
