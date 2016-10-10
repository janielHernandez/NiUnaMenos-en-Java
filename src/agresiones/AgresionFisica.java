package agresiones;

public class AgresionFisica extends Agresion
{
    private String elemento;
	public AgresionFisica(String lugar, String persona, String palabrasUtilizadas[], String elemento)
	{
		super (lugar, persona, palabrasUtilizadas);
		this.elemento=elemento;
	}
	@Override
	public boolean esGrave(){
		return true;
	}
	@Override
	public boolean esIgnea(){
		if(this.elemento=="combustible") {
			return true;
		} 
		return super.esIgnea();
	}
	@Override
	public String toString(){
		return "Esta agresion es Física \n" + "Fue hecha en "+ lugar  + " por " + persona +" con " + this.elemento + "\n"+  "y las palabras utilizadas fueron" + this.imprimirPalabrasUtilizadas();
	}
	
	
	
	

}
