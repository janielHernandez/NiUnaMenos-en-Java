package policia;

import agresiones.Agresion;
import niUnaMenos.Persona;

public class Denuncia
{
    private int nroDenuncia;
    private Persona victima;
    private Agresion agresion;
	
	public Denuncia(int nroDenuncia,Persona victima, Agresion agresion)
	{
		this.setNroDenuncia(nroDenuncia);
		this.setVictima(victima);
		this.setAgresion(agresion);
	}

	public int getNroDenuncia()
	{
		return nroDenuncia;
	}

	public void setNroDenuncia(int nroDenuncia)
	{
		this.nroDenuncia = nroDenuncia;
	}

	public Persona getVictima()
	{
		return victima;
	}

	public void setVictima(Persona victima)
	{
		this.victima = victima;
	}

	public Agresion getAgresion()
	{
		return agresion;
	}

	public void setAgresion(Agresion agresion)
	{
		this.agresion = agresion;
	}

	
}
