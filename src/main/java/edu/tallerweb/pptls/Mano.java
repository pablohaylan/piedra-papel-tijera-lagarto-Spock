package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
private Forma miForma;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.miForma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Resultado resultadoPartida=Resultado.PIERDE;
		
		if(this.miForma==otra.miForma){
			resultadoPartida = Resultado.EMPATA;
		}
		
		
		
		switch (this.miForma) 
        { 
            case PIEDRA: if (otra.miForma == Forma.TIJERA || otra.miForma == Forma.LAGARTO ) {
            	
            	resultadoPartida = Resultado.GANA;
            	
            }
                break; 

            case SPOCK: if (otra.miForma == Forma.PIEDRA || otra.miForma == Forma.TIJERA){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break; 

            case PAPEL: if (otra.miForma == Forma.SPOCK || otra.miForma == Forma.PIEDRA){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break;               

            case LAGARTO: if (otra.miForma == Forma.PAPEL || otra.miForma == Forma.SPOCK){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break; 
                
            case TIJERA: if (otra.miForma == Forma.LAGARTO || otra.miForma == Forma.PAPEL){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break;     
        } 	
		
		return  resultadoPartida;
	}

}
