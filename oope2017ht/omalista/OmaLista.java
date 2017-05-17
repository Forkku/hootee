package oope2017ht.omalista;

import oope2017ht.apulaiset.*;
import fi.uta.csjola.oope.lista.*;

/**
 *Kimi af Forselles
 * 421938@student.uta.fi
 * Toteuttaa Ooperoiva-rajapinnan k�ytt�en LinkitetynListan valmiita operaatioita
 */

public class OmaLista extends LinkitettyLista implements Ooperoiva {

    public Object hae(Object haettava) {

        Object apu1 = null;

        if (haettava != null) {
            for (int i = 0; i < koko; i++) {

                if (haettava.equals(alkio(i))) {

                    apu1 = alkio(i);

                }
            }
        }
        return apu1;
    }

    @SuppressWarnings("unchecked")
    public boolean lisaa(Object uusi) {

        boolean onnistui = false;

        int lisaysInd = 0;

        Comparable lisattava = (Comparable) uusi;

        if (uusi != null) {
            if (koko > 0) {

                while (lisaysInd < koko && !onnistui) {

                    if (lisattava.compareTo(alkio(lisaysInd)) < 0) {
                        lisaa(lisaysInd, lisattava);
                        onnistui = true;
                    }

                    lisaysInd++;
                }
                if (onnistui == false) {
                    lisaaLoppuun(lisattava);
                    onnistui = true;
                }
            } else {
                lisaaAlkuun(lisattava);
                onnistui = true;
            }
        }
        return onnistui;
    }

    public Object poista(Object poistettava) {

        boolean loytyi = false;

        Object apu1 = null;

        if (poistettava != null) {
            for (int i = 0; i < koko; i++) {

                if (poistettava.equals(alkio(i))) {

                    apu1 = alkio(i);
                    loytyi = true;
                    poista(i);
                }
            }
        }
        if (loytyi) {
            return apu1;
        } else {
            return null;
        }
    }
}
