package actitudes;

import niUnaMenos.Persona;
import agresiones.Agresion;

public class ActitudPaciente extends Actitud
{
    private int tolerancia;
    public ActitudPaciente(int tolerancia){
 	   this.tolerancia=tolerancia;
    }
	@Override
	public boolean permiteHacerDenuncia(Persona persona, Agresion agresion){
		if (persona.cantidadDeAgresiones(agresion.getNombre())> tolerancia){
			return true;
		}
		return false;	
	}
	@Override
	public Actitud amenazaDeMuerte(){
		tolerancia=tolerancia * 2;
		return this;
	}
	public int getTolerancia()
	{
		return tolerancia;
	}
	public void setTolerancia(int tolerancia)
	{
		this.tolerancia = tolerancia;
	}
	@Override
	public String toString(){
		return "Actitud Paciente \n" +"Nivel de tolerancia " + this.tolerancia;
	}
	
	

}
