package agresiones;

public class Agresion
{
	protected String lugar;
	protected String persona;
	protected String palabrasUtilizadas[];
	protected String  palabrasGraves[] = {"matar", "asesinar"};	

	public Agresion (String lugar, String persona, String palabrasUtilizadas[] )
	{
	  this.lugar=lugar;
	  this.persona=persona;
	  this.palabrasUtilizadas=palabrasUtilizadas;
	}
	public boolean esGrave(){
		for(String palabraUtilizada:palabrasUtilizadas){
		for (int i=0;i< palabrasGraves.length; i++ ){
			if (palabrasGraves[i]==palabraUtilizada){
				return true;}				
		  }
		}
		return false;
	}
	public boolean esIgnea(){
		for(String palabraUtilizada:palabrasUtilizadas){
			if (palabraUtilizada=="fuego")
				return true;
		}
		return false;
	}
	public void agregarPalabraGrave(String palabra){
	int t = palabrasGraves.length;
	palabrasGraves[t]=palabra;		
	}
	public String getNombre(){
		return this.persona;
	}
	public String imprimirPalabrasUtilizadas(){
		int t=palabrasUtilizadas.length;
		String frase="";
		for (int i=0;i<t;i++){
	    frase = frase+" "+palabrasUtilizadas[i];
		}
		return frase;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
