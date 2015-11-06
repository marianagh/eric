/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seba;

/**
 *
 * @author alumnog
 */
public class SEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cuello = 1;
        int piernas = 3;
        int tronco = 3;
        
        RebaImplementacion reba= new RebaImplementacion();
        
        reba.grupoA(1, 3, 3,0);
        System.out.println(reba.grupoA(1, 5, 3,0));
        
    }
}
