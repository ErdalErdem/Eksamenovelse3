import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg antal terninger");
        int antalTerninger = scanner.nextInt();

        Raflebager raflebager = new Raflebager(antalTerninger);

        System.out.println(raflebager.ryst());
        System.out.println(raflebager.se());
    }
}
