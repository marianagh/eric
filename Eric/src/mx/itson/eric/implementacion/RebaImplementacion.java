package mx.itson.eric.implementacion;

import mx.itson.eric.interfaces.IReba;

/**
 * Implementa los metodos de la interfaz IReba.
 * @author Mariana Garcia
 *
 */

public class RebaImplementacion implements IReba{

	@Override
	public int calcularPiernas(int puntuacion, int correccion) {
			int piernas = 0;
		    
		    piernas = puntuacion + correccion;
		    
		    return piernas;
	}

	@Override
	public int calcularCuello(int puntuacion, int correccion) {
		int cuello = 0;
        
        cuello = puntuacion + correccion;
        
        return cuello;
	}

	@Override
	public int calcularTronco(int puntuacion, int correccion) {
		int tronco = 0;
	    
	    tronco = puntuacion + correccion;
	    
	    return tronco;
	}
	
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

			@Override
			public int tablaC(int a, int b) {
				int c = 0;
				switch (a){
				
				case 1: switch (b) {
					case 1: c = 1; break;
					case 2: c = 1; break;
					case 3: c = 1; break;
					case 4: c = 2; break;
					case 5: c = 3; break;
					case 6: c = 3; break;
					case 7: c = 4; break;
					case 8: c = 5; break;
					case 9: c = 6; break;
					case 10: c = 7; break;
					case 11: c = 7; break;
					case 12: c = 7; break;
				} break;
				
			case 2:  switch (b) {
				case 1: c = 1; break;
				case 2: c = 2; break;
				case 3: c = 2; break;
				case 4: c = 3; break;
				case 5: c = 4; break;
				case 6: c = 4; break;
				case 7: c = 5; break;
				case 8: c = 6; break;
				case 9: c = 6; break;
				case 10: c = 7; break;
				case 11: c = 7; break;
				case 12: c = 8; break;
			} break;
			
			case 3:  switch (b) {
			case 1: c = 2; break;
			case 2: c = 3; break;
			case 3: c = 3; break;
			case 4: c = 3; break;
			case 5: c = 4; break;
			case 6: c = 5; break;
			case 7: c = 6; break;
			case 8: c = 6; break;
			case 9: c = 7; break;
			case 10: c = 7; break;
			case 11: c = 8; break;
			case 12: c = 8; break;
		} break;
		
			
				
				
				}
				return c;
			}
		    
		    
}
