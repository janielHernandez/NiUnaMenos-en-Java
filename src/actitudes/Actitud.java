package actitudes;
import agresiones.Agresion;
import niUnaMenos.*;


public abstract class Actitud
{
  public abstract boolean permiteHacerDenuncia(Persona persona, Agresion agresion);
  public abstract Actitud amenazaDeMuerte();

}
