import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private int montoPorHora;
    private int getMontoPorHijo;

    private List<Persona> hijos; // array del tipo Persona

    //Manejo de la lista
    public Empleado (){
        hijos= new ArrayList<>();
    }
    
    public void agregarHijo(Persona hijo){
        hijos.add(hijo);
    }

    public List<Persona> hijos(){
        return hijos;
    }

    public int cantidadDeHijos(){
        return hijos().size();
    }



    public void setNombre(String valor) {
        nombre = valor;
    }


    public String getNombre(){
        return nombre;
    }


    public int calcularSueldo() {
        return montoPorHora() * getCantidadHoras()
                + hijos.size() * getMontoPorHijos();
    }


    public int montoPorHora() {
        return getMontoPorHora();
    }


    private int getCantidadHoras() {
        return getHorasTrabajadas();
    }


    private int getMontoPorHijos() {
        return getMontoPorHijo();
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public int getMontoPorHora() {
        return montoPorHora;
    }


    public void setMontoPorHora(int valor) {
        this.montoPorHora = valor;
    }


    public int getMontoPorHijo() {
        return getMontoPorHijo;
    }

      
    public void setMontoPorHijo(int getMontoPorHijo) {
        this.getMontoPorHijo = getMontoPorHijo;
    }
   

    
    
}
