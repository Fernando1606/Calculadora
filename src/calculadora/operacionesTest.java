package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	@Test
	public void sumatest() {
		operaciones op=new operaciones();
		int z=op.suma(2, 3);
		assertEquals(5, op.suma(2, 3), 0);
		assertEquals(5, op.suma(3, 2), 0);
	}
	public void restatest() {
		operaciones op=new operaciones();
		int z=op.resta(5, 3);
		assertEquals(2, op.resta(5, 3), 0);
		assertEquals(-2, op.resta(3, 5), 0);
	}
	
	public void multtest() {
		operaciones op=new operaciones();
		int z=op.multiplicacion(2, 4);
		assertEquals(8, op.multiplicacion(2, 4), 0);
		assertEquals(8, op.multiplicacion(4, 2), 0);
		assertEquals(0, op.multiplicacion(4, 0), 0);
	}
	
	
	public void divtest() {
		operaciones op=new operaciones();
		double z=op.division(10, 2);
		assertEquals(5, op.division(10, 2), 0);
		assertEquals(0.5, op.division(1, 2), 0);
		assertEquals(0, op.division(4, 0), 0);
	}
}