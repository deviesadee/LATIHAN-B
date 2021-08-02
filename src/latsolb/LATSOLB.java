/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsolb;

/**
 *
 * @author 2nd
 */
public class LATSOLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  int awal = 5;
       int beda =5 ;
       int awal =5;
        int akhir;
        
        for ( int a =5; a >=1;a--){
        for (int  b =1;  b<= a; b++){
            
            akhir = awal;
            awal += beda;
            System.out.print(" "+akhir);
        }
       System.out.println(" ");
        }

       
    }
    
}

    
    
}
