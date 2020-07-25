import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){
            Random r = new Random();
            int zamisljeniBroj = r.nextInt(3);
            System.out.println("Koji broj sam zamislio?");
            Scanner sc = new Scanner(System.in);
            int pokusajPogodka = sc.nextInt();
            if (pokusajPogodka==zamisljeniBroj){
                System.out.println("Bravo pogodili ste, zamisljeni broj je bio: "+zamisljeniBroj+" !");
                continue;
            } else {
                System.out.println("Vise srece drugi put!");
            }
        }

















    }
}
