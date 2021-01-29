
package arbolito;

public class ElPadreQueSeFuePorLosCigarros extends DatosFamiliares{ //clase hija de DatosFamiliares
      private int añosSinPensionAlimenticia; //digamos que puse esto aquí y no en datos familiares por que solo me interesa el de el

  
  public ElPadreQueSeFuePorLosCigarros (String nombre, String apellidoP, String apellidoM,int edad, String Padre,String Madre, int añosSinPensionAlimenticia )//escribo todos los atributos que hereda y los propios
  {
   super(nombre, apellidoP, apellidoM,edad, Padre,Madre); //indico que ya estan inicializados
   this.añosSinPensionAlimenticia = añosSinPensionAlimenticia; //inicializo las propias
  }
  
    public void MostrarDatosP(){
      System.out.println("nombre: " +nombre +
              "\napellido paterno: " +apellidoP +
              "\napellido materno: " +apellidoM +
              "\nedad: " +edad +
              "\nnombre del padre: " +Padre +
              "\nnombre de la madre: " +Madre +
              "\naños sin pension alimenticia: " +añosSinPensionAlimenticia);
  }
}
