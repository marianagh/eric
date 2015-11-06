/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seba;

/**
 *
 * @author alumnog
 */
public class RebaImplementacion {
    
    public int grupoA(int cuello, int tronco, int piernas, int carga){
    int a = 0;
    
    switch (cuello){
        
        case 1: 
            switch(piernas) {
                
              case 1: 
                  switch (tronco) {
                      case 1: a = 1; break;
                      case 2: a = 2; break;
                      case 3: a = 2; break;
                      case 4: a = 3; break;
                      case 5: a = 4; break;
                          }
                  break;
              case 2: 
                  
                   switch (tronco) {
                      case 1: a = 2; break;
                      case 2: a = 3; break;
                      case 3: a = 4; break;
                      case 4: a = 5; break;
                      case 5: a = 6; break;
                          }
                  break;
              case 3:
                  
                  switch (tronco) {
                      case 1: a = 3; break;
                      case 2: a = 4; break;
                      case 3: a = 5; break;
                      case 4: a = 6; break;
                      case 5: a = 7; break;
                          } 
                  break;
                  
              case 4:
                  switch (tronco) {
                      case 1: a = 4; break;
                      case 2: a = 5; break;
                      case 3: a = 6; break;
                      case 4: a = 7; break;
                      case 5: a = 8; break;  
                          }
            } break;
         
        case 2: switch(piernas) {
         
              case 1: 
                  switch (tronco) {
                      case 1: a = 1; break;
                      case 2: a = 3; break;
                      case 3: a = 4; break;
                      case 4: a = 5; break;
                      case 5: a = 6; break;
                          }
                  break;
              case 2: 
                  
                   switch (tronco) {
                      case 1: a = 2; break;
                      case 2: a = 4; break;
                      case 3: a = 5; break;
                      case 4: a = 6; break;
                      case 5: a = 7; break;
                          }
                  break;
              case 3:
                  
                  switch (tronco) {
                      case 1: a = 3; break;
                      case 2: a = 5; break;
                      case 3: a = 6; break;
                      case 4: a = 7; break;
                      case 5: a = 8; break;
                          } 
                  break;
                  
              case 4:
                  switch (tronco) {
                      case 1: a = 4; break;
                      case 2: a = 6; break;
                      case 3: a = 7; break;
                      case 4: a = 8; break;
                      case 5: a = 9; break;  
                          }
            }
            
         case 3: switch(piernas) {
                
              case 1: 
                  switch (tronco) {
                      case 1: a = 3; break;
                      case 2: a = 4; break;
                      case 3: a = 5; break;
                      case 4: a = 6; break;
                      case 5: a = 7; break;
                          }
                  break;
              case 2: 
                  
                   switch (tronco) {
                      case 1: a = 3; break;
                      case 2: a = 5; break;
                      case 3: a = 6; break;
                      case 4: a = 7; break;
                      case 5: a = 8; break;
                          }
                  break;
              case 3:
                  
                  switch (tronco) {
                      case 1: a = 5; break;
                      case 2: a = 6; break;
                      case 3: a = 7; break;
                      case 4: a = 8; break;
                      case 5: a = 9; break;
                          } 
                  break;
                  
              case 4:
                  switch (tronco) {
                      case 1: a = 6; break;
                      case 2: a = 7; break;
                      case 3: a = 8; break;
                      case 4: a = 9; break;
                      case 5: a = 9; break;  
                          }
            }
    
    }
    return a;
    }
    
    
}
