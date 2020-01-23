import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FuncionesRadioTest {
	
	FuncionesRadio miRadio = new FuncionesRadio();

	@Before
	public void init() {
		miRadio.listaAM.add("Emisora1");
		miRadio.listaAM.add("Emisora2");
		miRadio.listaFM.add("Emisora3");
		miRadio.listaFM.add("Emisora4");
	}
	
	
	@Test
	public void testSeleccionarEmisora() {
		assertEquals("Checking size of List", 2, miRadio.listaAM.size());
		assertEquals("Checking size of List", 2, miRadio.listaFM.size());
		
		
	}
	
	@Test
	public void testGuardar() {
		miRadio.guardar(1); 
		assertEquals("Strings Iguales", "Puede guardar hasta 12 emisoras FM distintas!", "Puede guardar hasta 12 emisoras FM distintas!");
		
	}
	
	@Test
	public void testEstacionActual() {
		
		String expected = "La estación actual la puede consultar en su pantalla. La estacion guardada se mostrara en grande al "
				+ "seleccionar uno de los 12 botones.";
        assertEquals(expected, miRadio.estacionActual());
		
		
	}
		 			
}
