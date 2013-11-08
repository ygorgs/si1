package conversor;
import static org.junit.Assert.*;

import org.junit.Test;



public class TesteLab1 {

	@Test
	public void test() {
		Conversor a = new Conversor();
		assertEquals("dez", a.converte(10));
		assertEquals("vinte e um", a.converte(21));
		assertEquals("noventa e nove", a.converte(99));
		assertEquals("cinquenta", a.converte(50));
		assertEquals("cem", a.converte(100));
		assertEquals("duzentos", a.converte(200));
		assertEquals("quinhentos e dois", a.converte(502));
		assertEquals("cento e setenta e seis", a.converte(176));
		assertEquals("duzentos e quarenta", a.converte(240));
		assertEquals("mil", a.converte(1000));
		assertEquals("mil e um", a.converte(1001));
		assertEquals("mil e cinquenta e dois", a.converte(1052));
		assertEquals("mil e cem", a.converte(1100));
		assertEquals("mil cento e dezesseis", a.converte(1116));
		assertEquals("mil novecentos e noventa e nove", a.converte(1999));
		assertEquals("dois mil", a.converte(2000));
		assertEquals("nove mil e nove", a.converte(9009));
		assertEquals("cinco mil e cinquenta e cinco", a.converte(5055));
		assertEquals("cinco mil quinhentos e cinquenta e cinco", a.converte(5555));
		assertEquals("dez mil", a.converte(10000));
		assertEquals("dez mil e quinhentos", a.converte(10500));
		assertEquals("dezenove mil", a.converte(19000));
		assertEquals("novecentos e noventa e nove mil", a.converte(999000));
	}

}
