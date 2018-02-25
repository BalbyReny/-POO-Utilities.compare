package prueba;

public class Utilities 
{
    public static <T,U> boolean compare (GenericTupla T, GenericTupla U) 
    {
        //return T==U;
        //return T.equals(U);
        return T.toString().equals(U.toString()); //¿Por qué sólo me funciona así?
    }
}
