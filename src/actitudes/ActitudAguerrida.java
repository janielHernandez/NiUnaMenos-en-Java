package actitudes;

import niUnaMenos.Persona;
import agresiones.Agresion;

public class ActitudAguerrida extends Actitud
{

   @Override
  public boolean permiteHacerDenuncia(Persona persona, Agresion agresion){
	   if (persona.algunaAgresionGrave() && persona.esFamiliar(agresion.getNombre())){
		   return true;
	   }
	   return false;
   }
   @Override
   public Actitud amenazaDeMuerte(){
		return new ActitudPaciente(5);
	}
   @Override
	public String toString(){
		return "Actitud Aguerrida";
	}
	

}
