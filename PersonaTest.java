import org.junit.Test;

public class PersonaTest {


    @Test
    public void edad_de_hijos_test(){

        Persona p1 = new Persona("Nicolas",2003);
        assert p1.getNombre()=="Nicolas";
        assert p1.getEdad() == 21;

    }

    @Test
    public void nombre_de_hijos_test(){

        Persona p1 = new Persona("Nicolas",2003);

        assert p1.getNombre()=="Nicolas";
        

    }
}
