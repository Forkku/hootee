package oope2017ht.tiedot;

/**
 *Kimi af Forselles
 * 421938@student.uta.fi
 * Luokka tiedoston nimen ja koon asettamiseen
 */
public class Tiedosto extends Tieto {

    //Attribuutit
    private int koko;

    //Rakentaja
    public Tiedosto(StringBuilder n, int k) throws IllegalArgumentException {
        super(n);
        koko(k);
    }

    //Kopiorakentaja
    public Tiedosto(Tiedosto t) throws IllegalArgumentException {
        super(t);
        if (t instanceof Tiedosto) {
            koko = t.koko;
        } else {
            throw new IllegalArgumentException();
        }
        koko(t.koko());
    }

    //Aksessorit
    public int koko() {
        return koko;
    }

    public void koko(int k) throws IllegalArgumentException {

        if (k > 0) {
            koko = k;
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return super.toString() + EROTIN + koko;
    }

}
