package actitudes;

import niUnaMenos.Persona;
import agresiones.Agresion;

public class ActitudMiedosa extends Actitud
{

	@Override
	public boolean permiteHacerDenuncia(Persona persona, Agresion agresion){
		return false;
	}
	@Override
	public Actitud amenazaDeMuerte(){
		return this;		
	}
	@Override
	public String toString(){
		return "Actitud Miedosa";
	}
	
	
	
	
	
}
