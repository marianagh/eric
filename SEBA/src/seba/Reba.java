/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seba;

/**
 *
 * @author alumnog
 */
public class Reba {
    
    int carga;
    int puntuacion;
    int grupoA;
    int grupoB;

    public int getGrupoA() {
        return grupoA;
    }

    public void setGrupoA(int grupoA) {
        this.grupoA = grupoA;
    }

    public int getGrupoB() {
        return grupoB;
    }

    public void setGrupoB(int grupoB) {
        this.grupoB = grupoB;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
        public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public int calcularCuello(int puntuacion, int correccion){
        
        int cuello = 0;
        
        cuello = puntuacion + correccion;
        
        return cuello;
    }
    
    public int piernas (int puntuacion, int correccion){
    int piernas = 0;
    
    piernas = puntuacion + correccion;
    
    return piernas;
        
    }
    
    public int tronco(int puntuacion, int correccion) {
    
    int tronco = 0;
    
    tronco = puntuacion + correccion;
    
    return tronco;
    }

    
   
    
    
    
    
}
