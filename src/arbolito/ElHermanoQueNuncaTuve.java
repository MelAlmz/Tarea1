
package arbolito;

public class ElHermanoQueNuncaTuve extends DatosFamiliares{ //clase hija de DatosFamiliares
     private String deporte; //digamos que puse esto aquí y no en datos familiares por que solo me interesa el de ella
  
     public ElHermanoQueNuncaTuve (String nombre, String apellidoP, String apellidoM,int edad, String Padre,String Madre, String deporte )//escribo todos los atributos que hereda y los propios
  {
   super(nombre, apellidoP, apellidoM,edad, Padre,Madre); //indico que ya estan inicializados
   this.deporte = deporte; //inicializo las propias
  }
    
         public void MostrarDatosH(){
      System.out.println("nombre: " +nombre +
              "\napellido paterno: " +apellidoP +
              "\napellido materno: " +apellidoM +
              "\nedad: " +edad +
              "\nnombre del padre: " +Padre +
              "\nnombre de la madre: " +Madre +
              "\ndeporte: " +deporte);
  }
}
