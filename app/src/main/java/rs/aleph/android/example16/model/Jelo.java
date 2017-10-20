package rs.aleph.android.example16.model;

/**
 * Created by androiddevelopment on 11.10.17..
 */

public class Jelo {

    private int id;
    private String image;
    private String naziv;
    private String opis;
    private String sastojci;
    private double kalorijskaVrednost;
    private double cena;
    private Category category;

    public Jelo() {
    }

    public Jelo(int id, String image, String naziv, String opis, String sastojci, double kalorijskaVrednost, double cena, Category category) {
        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.sastojci = sastojci;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }


    public double getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(double kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return naziv;
    }
}
