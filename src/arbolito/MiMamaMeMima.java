package arbolito;

public class MiMamaMeMima extends DatosFamiliares { //clase hija de DatosFamiliares

    private String trabajo; //digamos que puse esto aquí y no en datos familiares por que solo me interesa el de ella

    public MiMamaMeMima(String nombre, String apellidoP, String apellidoM, int edad, String Padre, String Madre, String trabajo)//escribo todos los atributos que hereda y los propios
    {
        super(nombre, apellidoP, apellidoM, edad, Padre, Madre); //indico que ya estan inicializados
        this.trabajo = trabajo; //inicializo las propias
    }

    public void MostrarDatosM() {
         System.out.println("nombre: " + getNombre()
                + "\napellido paterno: " + getApellidoP()
                + "\napellido materno: " + getApellidoM()
                + "\nedad: " + getEdad()
                + "\nnombre del padre: " + getHijaPadre()
                + "\nnombre de la madre: " + getHijaMadre()
                + "\ntrabajo: " + this.trabajo);
    }
}
