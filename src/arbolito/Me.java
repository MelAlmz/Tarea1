
package arbolito;

public class Me extends DatosFamiliares //clase hija de DatosFamiliares
{ //nota como no sé ni que rayos pediste me estoy inventando la lógica que deba tener n.n
  private String apodoFamiliar; //digamos que puse esto aquí y no en datos familiares por que solo me interesa el mio 

  
  public Me (String nombre, String apellidoP, String apellidoM,int edad, String Padre,String Madre, String apodoFamiliar )//escribo todos los atributos que hereda y los propios
  {
   super(nombre, apellidoP, apellidoM,edad, Padre,Madre); //indico que ya estan inicializados
   this.apodoFamiliar = apodoFamiliar; //inicializo las propias
  }
  
  public void MostrarDatos(){
      System.out.println("nombre: " +nombre +
              "\napellido paterno: " +apellidoP +
              "\napellido materno: " +apellidoM +
              "\nedad: " +edad +
              "\nnombre del padre: " +Padre +
              "\nnombre de la madre: " +Madre +
              "\napodo familiar: " +apodoFamiliar);
  }
}
