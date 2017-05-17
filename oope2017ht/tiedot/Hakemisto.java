package oope2017ht.tiedot;

import oope2017ht.apulaiset.*;
import oope2017ht.omalista.*;

/**
 *Kimi af Forselles
 * 421938@student.uta.fi
 * Toteuttaa komennettava-rajapinnan sek� luo hakemiston.
 */


public class Hakemisto extends Tieto implements Komennettava<Tieto> {


    /* Atribuutit
     */
    private OmaLista sisalto;

    private Hakemisto yliHakemisto;


    /* Rakentajat
     */
    public Hakemisto(StringBuilder n) throws IllegalArgumentException {
        super(n);
        sisalto = new OmaLista();
    }

    public Hakemisto(StringBuilder n, Hakemisto yliKansio) {
        super(n);
        yliHakemisto = yliKansio;
        sisalto = new OmaLista();
    }

    /*Aksessorit
     */
    public OmaLista getOmaLista() {
        return sisalto;
    }

    public void setOmaLista(OmaLista lista) {
        sisalto = lista;
    }

    public Hakemisto getHakemisto() {
        return yliHakemisto;
    }

    public void setHakemisto(Hakemisto hakemisto) {
        yliHakemisto = hakemisto;
    }

    public OmaLista sisalto() {
        return sisalto;
    }

    
    //Komennettava-rajapinnan toteutetut operaatiot
    
    public Tieto hae(String nimi) {

        Tieto apu1 = null;

        if (nimi != null) {
            apu1 = new Hakemisto(new StringBuilder(nimi));
        }

        return (Tieto) sisalto.hae(apu1);

    }

    public boolean lisaa(Tieto lisattava) {

        if (lisattava != null && sisalto.hae(lisattava) == null) {
            return sisalto.lisaa(lisattava);
        } else {
            return false;
        }
    }

    public Tieto poista(String nimi) {

        Tieto apu1 = null;

        if (nimi != null) {
            apu1 = new Hakemisto(new StringBuilder(nimi));
        }

        return (Tieto) sisalto.poista(apu1);
    }

    @Override
    public String toString() {
        return super.toString() + "/ " + sisalto.koko();
    }

}
