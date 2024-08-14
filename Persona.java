public class Persona {
    
    private String nombre;
    private int añoDeNacimiento;

    public Persona(String nombre, int añoDeNacimiento){
        this.nombre=nombre;
        this.añoDeNacimiento=añoDeNacimiento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setAñoNacimiento(int añoDeNacimiento){
        this.añoDeNacimiento=añoDeNacimiento;
    }

    public int getAñoDeNacimiento(){
        return añoDeNacimiento;
    }

    public int getEdad(){
        return  2024 - añoDeNacimiento;
    }

}
