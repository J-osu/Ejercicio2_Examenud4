package es.ies.curavalera.Josue;

/**
 *
 * @author yo misma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImprimirEmpleados();
    }
    /**
     *
     * @author Josue
     * @since 20/03/2025
     * La funcion ImprimirEmpleados se encarga de crear un nuevo empleado
     * e imprimir el resultado por pantalla.
     */
    public static void ImprimirEmpleados(){
        Empleado uno = new Empleado("1245678M","Perico de los Palotes",
                "C/del Pez,6","Empleado",3);
        System.out.println(uno.toString()+ "Sueldo: "+uno.calcula_sueldo(1200));
    }
}
