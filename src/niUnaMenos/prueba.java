package niUnaMenos;

import actitudes.Actitud;
import actitudes.ActitudAguerrida;
import actitudes.ActitudMiedosa;
import agresiones.Agresion;
import agresiones.AgresionComun;
import agresiones.AgresionFisica;

public class prueba
{

	public static void main(String[] args)
	{
	 Agresion a1 =new AgresionComun ("chacarita", "jose",new String[]{"te", "voy", "a", "matar"});
	 Agresion a2=new AgresionFisica("Caballito", "Juan",new String[]{"te", "voy", "a", "asesinar"}, "combusible" );
     Actitud am = new ActitudMiedosa();
     Actitud aa= new ActitudAguerrida();
     Persona ana = new Persona(aa);
     Persona gloria = new Persona(am);
     
     gloria.recibirAcompaniamientoDe(ana);
     gloria.recibirAmenzaDeMuerte();
     gloria.agregarFamiliar("jose");
     gloria.agregarFamiliar("juan");
     gloria.recibirUnaAgresion(a2);
    if ( gloria.seAnimaAHacerLaDenuncia(a2)){ 
    	System.out.print("hace denuncia");} else {
    		System.out.print("no hace denuncia");	
    	}
     System.out.print(gloria.toString()+ "\n");
     System.out.print(gloria.obtenerFamiliares());
     }
	
}
