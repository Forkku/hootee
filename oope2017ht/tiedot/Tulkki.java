/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oope2017ht.tiedot;

/**
 *
 * @author Forkku
 */
public class Tulkki {
   
    Hakemisto Juuri;
    
    
   public void luoHakemisto(String[] Parametri){
     
       
   }
    public void vaihdaHakemisto(String[] Parametri){
       
   }
    public void luoTiedosto(String[] Parametri){

   }
    public void nimeaUudelleen(String[] Parametri){
       
   } 
    public void listaaHakemisto(String[] Parametri){
      
   }   
    public void kopioiTiedosto(String[] Parametri){
    
   }
    public void poista(String[] Parametri){
       
   }
    public void listaa(String[] Parametri){
       
   }
      
   public String[] Splittaa(String Komento){
        
        if(Komento != null){
           String[] Splitattu = Komento.split(" ");
           
           if(Splitattu.length > 1){
               String apu1 = Splitattu[1];
               
               if(Splitattu.length == 3){
                   apu1 += " " + Splitattu[2];
               }
               String[] paluuarvo = apu1.split(" ");
               return paluuarvo;
           }else{
               return null;
           }

    }else{
                   return null;
                   }
    }
            
    
    
}
