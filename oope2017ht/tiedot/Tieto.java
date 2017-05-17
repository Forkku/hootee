package oope2017ht.tiedot;

/**
 *Kimi af Forselles
 * 421938@student.uta.fi
 * Abstrakti yliluokka Tiedon nimen tarkistukseen, sek‰ comparable-rajapinnan toteutus
 */
public abstract class Tieto implements Comparable<Tieto> {

    //Attribuutit
    protected final String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._";
    protected final String EROTIN = " ";
    private StringBuilder nimi;

    //Rakentaja
    public Tieto() {
        nimi = new StringBuilder("");
    }

    public Tieto(StringBuilder n) throws IllegalArgumentException {
        nimi(n);
    }

    //Kopiorakentaja
    public Tieto(Tieto t) {
        if (t instanceof Tieto) {
            //tehd‰‰n uusi osaolio.
            nimi(new StringBuilder(t.nimi()));
        }else
        throw new IllegalArgumentException();
    }

    //Aksessorit
    public StringBuilder nimi() {
        return nimi;
    }

    public void nimi(StringBuilder n) throws IllegalArgumentException {

        int pisteita = 0;
        int virhe = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c == '.') {
                pisteita++;

            }
            if (s.indexOf(c) == -1) {
                virhe++;
            }

        }
        if (virhe == 0 && pisteita <= 1) {
            nimi = n;
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return nimi.toString();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Tieto n = (Tieto) obj;
            String apu1 = nimi.toString();
            String apu2 = n.nimi().toString();
            return apu1.equals(apu2);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(Tieto o) {

        String apu1 = nimi.toString();
        String apu2 = ((Tieto) o).nimi.toString();
        return apu1.compareTo(apu2);
    }

}
