/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaaymagicalnumber;

import java.util.Scanner;

/**
 *
 * @author Abder
 */
public class DisplaayMagicalNumber {

    /**
     * @param min
     * @param max
     * @param args the command line arguments
     * @return 
     */
 public static void displayMagicalNumber(int pIMin, int pIMax) {
     
      if (pIMin>=pIMax){
        
          System.out.println("premier entier doit étre inférieur à deuxieme entier");
        
        }
        for (int i = pIMin + 1; i < pIMax; i++) {

            if (i % 3 == 0) {

                System.out.println("H");

            } else if (i % 5 == 0) {
                System.out.println("S");
                
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez premier entier");
        while (!sc.hasNextInt()) sc.next();
        int premierentier = sc.nextInt();
        System.out.println("entrez deuxieme entier");
        
        while (!sc.hasNextInt()) sc.next();
        int  deuxiemeentier = sc.nextInt();
       
        
       
        displayMagicalNumber(premierentier,deuxiemeentier );
    }
    
}