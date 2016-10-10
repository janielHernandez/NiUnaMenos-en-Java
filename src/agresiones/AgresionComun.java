package agresiones;

public class AgresionComun extends Agresion
{
	
	public AgresionComun(String lugar, String persona,String palabrasUtilizadas[])
	{
	  super (lugar, persona, palabrasUtilizadas);
	}
	@Override
	public boolean esGrave(){
		return super.esGrave();
	}
	@Override
	public boolean esIgnea(){
		return super.esIgnea();
	}
	
	@Override
	public String toString(){
		return "Esta agresion es Común \n" + "Fue hecha en "+ lugar  + " por " + persona + "\n"+ "y las palabras utilizadas fueron" + this.imprimirPalabrasUtilizadas()+"\n";
	}
	

}
