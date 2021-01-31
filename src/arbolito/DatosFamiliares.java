
package arbolito;

public class DatosFamiliares  implements Comportamientos 
{ //inicializo variables
    
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String Padre;
    private String Madre;

    //constructor *insertar código/constructor*

    public DatosFamiliares(String nombre, String apellidoP, String apellidoM, int edad, String Padre, String Madre) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.Padre = Padre;
        this.Madre = Madre;
    }

    DatosFamiliares() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        //get (se que se ponen pero no sé para qué, igual con los set)

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public String getHijaPadre() {
        return Padre;
    }
    

    public String getHijaMadre() {
        return Madre;
    }
    
    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPadre(String Padre) {
        this.Padre = Padre;
    }

    public void setMadre(String Madre) {
        this.Madre = Madre;
    }

    @Override
    public void comer() 
    {
        System.out.println("¿Aquí se supone que debo escribir algo? por que tengo hambre..."); 
        //¿qué se supone que hago con esto?
    }

    @Override
    public void comprarCositasParaMel() 
    {
        System.out.println("Me imagino que aquí tambien hace algo");
    }

    @Override
    public void ellosCorrenYoSoyGorda() 
    {
        System.out.println("Aquí igual");
    }

    @Override
    public void noSeCuantosDeboCrear() 
    {
        System.out.println("Aquí tambien");
    }
    
    
}
