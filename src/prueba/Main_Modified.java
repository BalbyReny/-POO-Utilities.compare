package prueba;

public class Main_Modified 
{
  public static void main (String [] args) 
  { 
    GenericTupla<Double,Double> point1, point2, point3; //3 GenericTuplas con valores Double para hacer la comparación.
    point1 = new GenericTupla<> (12.34,56.78);
    point2 = new GenericTupla<> (12.34,56.78);
    point3 = new GenericTupla<> (21.43,65.87);
    
    tell_if_isEqual(point1, point2); //comparar los valores de las GenericTuplas point1 y point2
    tell_if_isEqual(point1, point3); //luego comparar point1 con point3
  }
  
  static <T,U> void tell_if_isEqual (GenericTupla T, GenericTupla U)
  {
    boolean isEqual; //variable que nos dirá si los valores de las GenericTuplas que se comparen son iguales o no.
    isEqual=Utilities.compare(T,U); //llamar a la función compare desde la clase Utilities
    
    if(isEqual) //mostrar en pantalla si sí o si no (?)
        System.out.println(" "+T.toString()+" == "+U.toString()+"\n Los valores de ambas Tuplas Genéricas son iguales.\n");
    else
        System.out.println(" "+T.toString()+" != "+U.toString()+"\n Los valores de las Tuplas Genéricas son distintos.\n");
  }
}