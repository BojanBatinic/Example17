package rs.aleph.android.example16.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example16.model.Category;
import rs.aleph.android.example16.model.Jelo;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class ProviderJelo {

    public static List<Jelo> getJela() {

        Category mrsnoJelo = new Category(0, "Mrsno jelo");
        Category posnoJelo = new Category(1, "Posno jelo");


        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "sopska.jpg", "Sopska salata 400g", "Osvezavajuca salata od svezeg povrca i sira", "Paradajiz, krastavac, paprika i tvrdi sir.", 190.00, 300.00, mrsnoJelo ));
        jela.add(new Jelo(1, "cezar.jpg", "Cezar salata 400g", "Obrok salata od svezeg povrca i mesa", "Paradajiz, kupus, krastavac, pilece meso, dresing i hleb u kockicama.", 210.00, 350.00, mrsnoJelo));
        jela.add(new Jelo(2, "tuna.jpg", "Tuna salata 400g", "Obrok salata od svezeg povrca i tunjevine", "Paradajiz, krastavac, paprika i tunjevina u komadicima.", 230.00, 320.00, posnoJelo));
        jela.add(new Jelo(3, "vegeterijana.jpg", "Vegeterijanska salata 400g", "Osvezavajuca salata od svezeg povrca", "Paradajiz, krastavac, paprika, tikvice i patlidzan.", 170.00, 280.00, posnoJelo));
        return jela;
    }

    public static List<String> getJelaNazivi() {

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Sopska salata 400g");
        nazivi.add("Cezar salata 400g");
        nazivi.add("Tuna salata 400g");
        nazivi.add("Vegeterijana salata 400g");
        return nazivi;
    }

    public static Jelo getJeloById(int id) {

        Category mrsnoJelo = new Category(0, "Mrsno jelo");
        Category posnoJelo = new Category(1, "Posno jelo");

        switch (id) {
            case 0:
                return new Jelo(0, "sopska.jpg", "Sopska salata 400g", "Osvezavajuca salata od svezeg povrca i sira", "Paradajiz, krastavac, paprika i tvrdi sir.", 190.00, 300.00, mrsnoJelo );
            case 1:
                return new Jelo(1, "cezar.jpg", "Cezar salata 400g", "Obrok salata od svezeg povrca i mesa", "Paradajiz, krastavac, pilece meso, dresing i hleb u kockicama.", 210.00, 350.00, mrsnoJelo);
            case 2:
                return new Jelo(2, "tuna.jpg", "Tuna salata 400g", "Obrok salata od svezeg povrca i tunjevine", "Paradajiz, krastavac, paprika i tunjevina u komadicima.", 230.00, 320.00, posnoJelo);
            case 3:
                return new Jelo(3, "vegeterijana.jpg", "Vegeterijanska salata 400g", "Osvezavajuca salata od svezeg povrca", "Paradajiz, krastavac, paprika, tikvice i patlidzan.", 170.00, 280.00, posnoJelo);
            default:
                return null;
        }
    }
}
