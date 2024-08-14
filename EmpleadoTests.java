
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpleadoTests
{
    @Test
    public void calcularSueldo_debe_devolver_sueldo_1_test() {
        Empleado empleado = new Empleado();
       
        empleado.setHorasTrabajadas(1);
        empleado.setMontoPorHijo(1);
        empleado.setMontoPorHora(1);

        assert empleado.montoPorHora() == 1;
        assert empleado.calcularSueldo() == 1;
    }


    @Test
    public void calcularSueldo_con_2_hijos_debe_devolver_sueldo_3_test() {
        Empleado empleado = new Empleado();

        empleado.setHorasTrabajadas(1);
        empleado.setMontoPorHijo(1);
        empleado.setMontoPorHora(1);
    
        assert empleado.montoPorHora() == 1;
        assert empleado.calcularSueldo() == 3;
    }


    @Test
    public void calcularSueldo_con_4_hijos_horas_10_debe_devolver_sueldo_24() {
        Empleado empleado = new Empleado();

       
        empleado.setMontoPorHora(2);
        empleado.setMontoPorHijo(1);
        empleado.setHorasTrabajadas(10);
       
        assert empleado.montoPorHora() == 2;
        assert empleado.getHorasTrabajadas() == 10;
        assert empleado.calcularSueldo() == 24;
    }

    @Test
    public void cantidad_de_hijos_por_empleado_Test(){

        Empleado empleado = new Empleado();

        Persona hijo1 = new Persona ("Nico",2003);
        Persona hijo2 = new Persona("Maximo", 2004);

        empleado.agregarHijo(hijo1);
        empleado.agregarHijo(hijo2);

        assert empleado.cantidadDeHijos() == 2;
        
    }

    @Test
    public void calcularSueldo_debe_devolver_sueldo_500_test(){
        
        Empleado empleado = new Empleado();

        Persona hijo1 = new Persona ("Nico",2003);
        Persona hijo2 = new Persona("Maximo", 2004);

        empleado.agregarHijo(hijo1);
        empleado.agregarHijo(hijo2);

        empleado.setHorasTrabajadas(1);
        empleado.setMontoPorHijo(100);
        empleado.setMontoPorHora(300);
        
        assert empleado.calcularSueldo() == 500;


    }
 
}