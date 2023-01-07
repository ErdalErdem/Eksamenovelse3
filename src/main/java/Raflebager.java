import java.util.ArrayList;

public class Raflebager {

    private int antalTerninger;

    ArrayList<Terning> terninger;

    public Raflebager (int antalTerninger) {
        this.antalTerninger = antalTerninger;
        terninger = new ArrayList<Terning>();
    }
    public int ryst() {
        for (int i = 0; i < antalTerninger; i++) {
            terninger.add(new Terning());
        }
        int samledeAntalØjne = 0;
        for (Terning t: terninger) {
            samledeAntalØjne += t.getØjne();

        }
        return samledeAntalØjne;
    }
    public ArrayList<Terning> se () {
        return terninger;
    }
}
