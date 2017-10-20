package rs.aleph.android.example16.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example16.model.Category;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class ProviderCategory {
    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Mrsna jela"));
        categories.add(new Category(1, "Posna jela"));
        return categories;
    }

    public static List<String> getCategoryNaziv() {
        List<String> nazivi = new ArrayList<>();
        nazivi.add("Mrsna jela");
        nazivi.add("Posna jela");
        return nazivi;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Mrsna jela");
            case 1:
                return new Category(1, "Posna jela");
            default:
                return null;
        }
    }
}
