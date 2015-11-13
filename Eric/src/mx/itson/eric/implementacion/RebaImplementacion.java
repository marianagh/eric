package mx.itson.eric.implementacion;

import mx.itson.eric.interfaces.IReba;

/**
 * Implementa los metodos de la interfaz IReba.
 * @author Mariana Garcia
 *
 */

public class RebaImplementacion implements IReba{
	
	/*
	 * Calcula la puntuación de las piernas.
	 * @param puntuacion Puntuación de la posición de las piernas. 
	 * @param correccion Corrección de la posición de las piernas.
	 * @return El valor de la puntuación de las piernas.
	 */
	@Override
	public int calcularPiernas(int puntuacion, int correccion) {
			int piernas = 0;
		    
		    piernas = puntuacion + correccion;
		    
		    return piernas;
	}
	/*
	 * Calcula la puntuación del cuello.
	 * @param puntuacion Puntuación de la posición del cuello. 
	 * @param correccion Corrección de la posición del cuello.
	 * @return El valor de la puntuación del cuello.
	 */
	@Override
	public int calcularCuello(int puntuacion, int correccion) {
		int cuello = 0;
        
        cuello = puntuacion + correccion;
        
        return cuello;
	}
	/*
	 * Calcula la puntuación del tronco.
	 * @param puntuacion Puntuación de la posición del tronco. 
	 * @param correccion Corrección de la posición del tronco.
	 * @return El valor de la puntuación del tronco.
	 */
	@Override
	public int calcularTronco(int puntuacion, int correccion) {
		int tronco = 0;
	    
	    tronco = puntuacion + correccion;
	    
	    return tronco;
	}
	/*
	 * Calcula el valor del analisis de cuello piernas y tronco.
	 * @param cuello Puntuación del cuello. 
	 * @param piernas Puntuación de las piernas.
	 * @param tronco Puntuación del tronco.
	 * @return El valor del analisis en la tabla A.
	 */
	   public int grupoA(int cuello, int piernas, int tronco ){
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
		                          } break;
		            } break;
		            
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
		                          } break;
		            }
		    
		    }
		    return a;
		    }
	   /*
		 * Calcula el valor del analisis de brazos, antebrazos y muñecas.
		 * @param cuello Puntuación de los brazos. 
		 * @param piernas Puntuación de los antebrazos.
		 * @param tronco Puntuación de las muñecas.
		 * @return El valor del analisis en la tabla B.
		 */
		    public int gruboB (int antebrazo, int brazo, int muneca) {
		         int grupoB = 0;
		         
		         switch (antebrazo) {
		             case 1: switch (muneca) {
		             
		                 case 1: switch (brazo) {
		                     case 1: grupoB = 1; break;
		                     case 2: grupoB = 1; break;
		                     case 3: grupoB = 2; break;
		                     case 4: grupoB = 3; break;
		                     case 5: grupoB = 6; break;
		                     case 6: grupoB = 7; break;

		                 }break;
		                  case 2: switch (brazo) {
		                     case 1: grupoB = 2; break;
		                     case 2: grupoB = 2; break;
		                     case 3: grupoB = 4; break;
		                     case 4: grupoB = 5; break;
		                     case 5: grupoB = 7; break;
		                     case 6: grupoB = 8; break;

		                 }break;
		                   case 3: switch (brazo) {
		                     case 1: grupoB = 2; break;
		                     case 2: grupoB = 3; break;
		                     case 3: grupoB = 5; break;
		                     case 4: grupoB = 5; break;
		                     case 5: grupoB = 8; break;
		                     case 6: grupoB = 8; break;

		                 }break;
		                 
		             } break;
		             
		             case 2: switch (muneca) {
		             
		                 case 1: switch (brazo) {
		                     case 1: grupoB = 1; break;
		                     case 2: grupoB = 2; break;
		                     case 3: grupoB = 4; break;
		                     case 4: grupoB = 5; break;
		                     case 5: grupoB = 7; break;
		                     case 6: grupoB = 8; break;

		                 } break;
		                  case 2: switch (brazo) {
		                     case 1: grupoB = 2; break;
		                     case 2: grupoB = 3; break;
		                     case 3: grupoB = 5; break;
		                     case 4: grupoB = 6; break;
		                     case 5: grupoB = 8; break;
		                     case 6: grupoB = 9; break;

		                 }break;
		                   case 3: switch (brazo) {
		                     case 1: grupoB = 3; break;
		                     case 2: grupoB = 4; break;
		                     case 3: grupoB = 5; break;
		                     case 4: grupoB = 7; break;
		                     case 5: grupoB = 8; break;
		                     case 6: grupoB = 9; break;

		                 }break;
		                 
		             }break;
		         
		         }
		         
		         
		        return grupoB;
		    }
		    /*
			 * Calcula el valor de riesgo de actividad en base a los puntajes de grupo A y grupo B.
			 * @param a Puntuación de la tabla A. 
			 * @param piernas Puntuación de la tabla B.
			 * @return El valor de riesgo según la tabla C.
			 */			
			public int tablaC(int a, int b) {
				
				int[][] tablaC = new int[12][12];
				
				tablaC[0][0] = 0;
				tablaC[1][1] = 1;
				tablaC[1][2] = 1;
				tablaC[1][3] = 1;
				tablaC[1][4] = 2;
				tablaC[1][5] = 3;
				tablaC[1][6] = 3;
				tablaC[1][7] = 4;
				tablaC[1][8] = 5;
				tablaC[1][9] = 6;
				tablaC[1][10] =7;
				tablaC[1][11] = 7;
				tablaC[1][12] = 7;
				tablaC[2][1] = 1;
				tablaC[2][2] = 2;
				tablaC[2][3] = 2;
				tablaC[2][4] = 3;
				tablaC[2][5] = 4;
				tablaC[2][6] = 4;
				tablaC[2][7] = 5;
				tablaC[2][8] = 6;
				tablaC[2][9] = 6;
				tablaC[2][10] =7;
				tablaC[2][11] = 7;
				tablaC[2][12] = 8;
				tablaC[3][1] = 2;
				tablaC[3][2] = 3;
				tablaC[3][3] = 3;
				tablaC[3][4] = 3;
				tablaC[3][5] = 4;
				tablaC[3][6] = 5;
				tablaC[3][7] = 6;
				tablaC[3][8] = 6;
				tablaC[3][9] = 7;
				tablaC[3][10] = 7;
				tablaC[3][11] = 8;
				tablaC[3][12] = 8;
				tablaC[4][1] = 3;
				tablaC[4][2] = 4;
				tablaC[4][3] = 4;
				tablaC[4][4] = 4;
				tablaC[4][5] = 5;
				tablaC[4][6] = 6;
				tablaC[4][7] = 7;
				tablaC[4][8] = 8;
				tablaC[4][9] = 8;
				tablaC[4][10] = 9;
				tablaC[4][11] = 9;
				tablaC[4][12] = 9;
				tablaC[5][1] = 4;
				tablaC[5][2] = 4;
				tablaC[5][3] = 4;
				tablaC[5][4] = 5;
				tablaC[5][5] = 6;
				tablaC[5][6] = 7;
				tablaC[5][7] = 8;
				tablaC[5][8] = 8;
				tablaC[5][9] = 9;
				tablaC[5][10] = 9;
				tablaC[5][11] = 9;
				tablaC[5][12] = 9;
				tablaC[6][1] = 4;
				tablaC[6][2] = 4;
				tablaC[6][3] = 4;
				tablaC[6][4] = 5;
				tablaC[6][5] = 6;
				tablaC[6][6] = 7;
				tablaC[6][7] = 8;
				tablaC[6][8] = 8;
				tablaC[6][9] = 9;
				tablaC[6][10] = 9;
				tablaC[6][11] = 9;
				tablaC[6][12] = 9;
				tablaC[7][1] = 7;
				tablaC[7][2] = 7;
				tablaC[7][3] = 7;
				tablaC[7][4] = 8;
				tablaC[7][5] = 9;
				tablaC[7][6] = 9;
				tablaC[7][7] = 9;
				tablaC[7][8] = 10;
				tablaC[7][9] = 10;
				tablaC[7][10] = 11;
				tablaC[7][11] = 11;
				tablaC[7][12] = 11;
				tablaC[8][1] = 8;
				tablaC[8][2] = 8;
				tablaC[8][3] = 8;
				tablaC[8][4] = 9;
				tablaC[8][5] = 10;
				tablaC[8][6] = 10;
				tablaC[8][7] = 10;
				tablaC[8][8] = 10;
				tablaC[8][9] = 10;
				tablaC[8][10] = 11;
				tablaC[8][11] = 11;
				tablaC[8][12] = 11;
				tablaC[9][1] = 9;
				tablaC[9][2] = 9;
				tablaC[9][3] = 9;
				tablaC[9][4] = 10;
				tablaC[9][5] = 10;
				tablaC[9][6] = 10;
				tablaC[9][7] = 11;
				tablaC[9][8] = 11;
				tablaC[9][9] = 11;
				tablaC[9][10] = 12;
				tablaC[9][11] = 12;
				tablaC[9][12] = 12;
				tablaC[10][1] = 10; 
				tablaC[10][2] = 10;
				tablaC[10][3] = 10;
				tablaC[10][4] = 11;
				tablaC[10][5] = 11;
				tablaC[10][6] = 11;
				tablaC[10][7] = 11;
				tablaC[10][8] = 12;
				tablaC[10][9] = 12;
				tablaC[10][10] = 12;
				tablaC[10][11] = 12;
				tablaC[10][12] = 12;
				tablaC[11][1] = 11;
				tablaC[11][2] = 11;
				tablaC[11][3] = 11;
				tablaC[11][4] = 11;
				tablaC[11][5] = 12;
				tablaC[11][6] = 12;
				tablaC[11][7] = 12;
				tablaC[11][8] = 12;
				tablaC[11][9] = 12;
				tablaC[11][10] = 12;
				tablaC[11][11] = 12;
				tablaC[11][12] = 12;
				tablaC[12][1] = 12;
				tablaC[12][2] = 12;
				tablaC[12][3] = 12;
				tablaC[12][4] = 12;
				tablaC[12][5] = 12;
				tablaC[12][6] = 12;
				tablaC[12][7] = 12;
				tablaC[12][8] = 12;
				tablaC[12][9] = 12;
				tablaC[12][10] = 12;
				tablaC[12][11] = 12;
				tablaC[12][12] = 12;

				return tablaC[a][b];				
	
			}

}
		    

