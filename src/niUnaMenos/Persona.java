package niUnaMenos;

import java.util.ArrayList;

import policia.Policia;
import actitudes.Actitud;
import actitudes.ActitudMilitante;
import agresiones.Agresion;

public class Persona
{   
   private Actitud actitud;
  //private String familiares[];
   private ArrayList<String> familiares = new ArrayList<String>();
   private ArrayList<Agresion> agresiones = new ArrayList<Agresion>();
  // private Agresion[] agresiones;
   
   public Persona(Actitud actitud){
	   this.actitud=actitud;
	   }
   public boolean algunaAgresionGrave(){
	   for(Agresion agresion: agresiones){
		   if (agresion.esGrave()){
			   return true;
		   }
	   }
	   return false;
   }

   public int cantidadDeAgresiones(String agresor){
	   int cont=0;
	   for(Agresion a: agresiones){
		   if (a.getNombre()==agresor)
			   cont++;
		   
	   }
	   return cont;
   }
   
   public void hacerLaDenuncia(Agresion agresion){
		(new Policia()).recibirDenuncia(this,agresion);
		 
   }
   public void recibirUnaAgresion(Agresion agresion){
	   if (this.seAnimaAHacerLaDenuncia(agresion))
		   this.hacerLaDenuncia(agresion);
	   
	   this.agregarAgresion(agresion);
	  }
   public boolean seAnimaAHacerLaDenuncia(Agresion agresion){
	   	 return agresion.esGrave() && this.esFamiliar(agresion.getNombre()) && actitud.permiteHacerDenuncia(this,agresion);  
   }
   public boolean esFamiliar(String nombre){
	   for (String familiar: familiares){
		   if(familiar==nombre)
			   return true;
	   }
	   return false;
   }
   public void agregarFamiliar(String familiar){
		//int t = familiares.length;
		familiares.add(familiar);		
		}
   public void agregarAgresion(Agresion agresion){
	   //int t = agresiones.length;
		agresiones.add(agresion);		
		}
   public void participarDeOrganizacionSocial(){
		this.actitud = new ActitudMilitante();
	}
   public Actitud actitud(){
	   return actitud;
   }
   public void recibirAcompaniamientoDe(Persona unaPersona){
		this.actitud = unaPersona.actitud();
	}
   public void recibirAmenzaDeMuerte(){
	   this.actitud=actitud.amenazaDeMuerte();
   }
   public String obtenerFamiliares(){
	   String listaFamiliares= "Familiares: \n";
	   for(int i=0;i<familiares.size(); i++){
		   listaFamiliares+= familiares.get(i) + "\n";
	   }
	   return listaFamiliares;
   }
   @Override
   public String toString(){
	   return "Esta persona tiene una "+ actitud.toString();
   }
}









