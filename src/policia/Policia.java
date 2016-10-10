package policia;
import java.util.ArrayList;

import agresiones.Agresion;
import niUnaMenos.Persona;

public class Policia
{
	 private ArrayList<Denuncia> denuncias = new ArrayList<Denuncia>();
	private int nroDenuncia=0;  

	public void recibirDenuncia(Persona persona, Agresion agresion){
		nroDenuncia=+1;
		this.agregarDenuncia(new Denuncia(nroDenuncia,persona, agresion ));		
	}
	public void agregarDenuncia(Denuncia denuncia){
	 denuncias.add(denuncia);
	}

}
