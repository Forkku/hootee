/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oope2017ht.tiedot;


import oope2017ht.apulaiset.In;
/**
 *
 * @author Forkku
 */
public class Ui {
    
    //Tervehdys, joka tulostetaan ohjelman käynnistyessä.
    private final String Tervehdys = "Welcome to SOS.";
    //Kehote
    private final String Kehote = "/>";
    //Virhe
    private final String Virhe = "Error!";
    //Ohjelman loppuessa tulostettava viesti
    private final String Lopetus = "Sheel terminated.";
    
    private String Komento = "";
    
    private boolean jatka = true;
    
    public void aloita() {
    System.out.println(Tervehdys);
    System.out.print(Kehote);
   
    }
    Tulkki tulkki = new Tulkki();
    
    
    public void suorita(){
  
        while(jatka == true){
    Komento = In.readString();
    String[] SplitattuKomento = tulkki.Splittaa(Komento);
   
    
    
       if(Komento.startsWith("md")){
         tulkki.luoHakemisto(SplitattuKomento);
     }   
     else if(Komento.startsWith("cd")){
         tulkki.vaihdaHakemisto(SplitattuKomento);
     }
      else if(Komento.startsWith("mf")){
         tulkki.luoTiedosto(SplitattuKomento);
     }
      else if(Komento.startsWith("mv")){
        tulkki.nimeaUudelleen(SplitattuKomento);
     }
      else if(Komento.startsWith("ls")){
         tulkki.listaaHakemisto(SplitattuKomento);
     } 
      else if(Komento.startsWith("cp")){
         tulkki.kopioiTiedosto(SplitattuKomento);
     } 
      else if(Komento.startsWith("rm")){
         tulkki.poista(SplitattuKomento);
     }
      else if(Komento.startsWith("find")){
         tulkki.listaa(SplitattuKomento);
     }
      else if(Komento.equals("exit")){
           System.out.println(Lopetus);
           jatka = false;
      }else{
           System.out.println(Virhe);
      }
     
  
     
        
        
    }
}
}