
package arbolito;

public class Arbolito {

    public static void main(String[] args) 
    {
     //nota 1 no tengo idea de a que te refieres con "árbol genealógico"
     //nota 2 me dio pena preguntarte porque era tarde (no me mates)
     //nota 3 intentaré aplicar lo que vimos hoy como dios me de a entender 
     //nota 4 pondré notas por todos lados para ver si estoy entendiendo la teoria y la practica 
       
        System.out.println("PRIMERO"); 
        Me me = new Me ("mel","alva","mart",22,"milo","gaby","bola"); 
        //referencia a la clase /crear objeto en base a la clase = en base a la clase 
        me.MostrarDatos();

        
        System.out.println("\nSEGUNDO"); 
        ElPadreQueSeFuePorLosCigarros P = new ElPadreQueSeFuePorLosCigarros ("milo","alva","tov",48,"jose","tere",22);
        P.MostrarDatosP();
        
        System.out.println("\nTERCERO"); 
        MiMamaMeMima Mm = new MiMamaMeMima ("gaby","mart","lop",46,"serv","ram","quien sabe que hace ahora");
        Mm.MostrarDatosM();
        
        System.out.println("\nCUARTO"); 
       ElHermanoQueNuncaTuve He = new ElHermanoQueNuncaTuve  ("alg","alva","mart",26,"milo","gaby","no hace nada :3");
        He.MostrarDatosH();        
    }
    
}
