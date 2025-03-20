package es.ies.curavalera.Josue;


/**
 *
 * @author Josue
 * @retun Devuelve por defecto las variable de la clase Empleado.
 * @since 20/03/2025
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int N_hijos;

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", N_hijos=" + N_hijos +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getN_hijos() {
        return N_hijos;
    }

    public void setN_hijos(int n_hijos) {
        N_hijos = n_hijos;
    }

    public Empleado (String dni, String nombre, String direccion, String cargo, int N_hijos){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.cargo=cargo;
        this.N_hijos=N_hijos;
    }
    
    public double calcula_sueldo(double base){
        double total=base;
        
        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(N_hijos >=3)
            total+= N_hijos *50;
        return total;
    }
}
