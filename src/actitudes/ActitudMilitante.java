package actitudes;

import niUnaMenos.Persona;
import agresiones.Agresion;

public class ActitudMilitante extends Actitud
{
	@Override
	public boolean permiteHacerDenuncia(Persona persona, Agresion agresion){
		return true;
	}
	@Override
	public Actitud amenazaDeMuerte(){
			return new ActitudAguerrida();
		}
	 @Override
	public String toString(){
			return "Actitud Militante";
		}
		


}
