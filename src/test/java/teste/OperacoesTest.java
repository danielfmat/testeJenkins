package teste;



import org.junit.Assert;
import org.junit.Test;

public class OperacoesTest {
	
	@Test
	public void somaTest(){		
		Operacoes op = new Operacoes(3,3);
		int ret = op.soma();
		Assert.assertEquals(6, ret);
	}
	
	
	@Test
	public void subTest(){
		Operacoes op = new Operacoes(5,3);
		int ret = op.subtracao();
		//testeDaniel
		Assert.assertEquals(2, ret);
	}

			@Test
	public void testFull(){
		Operacoes op = new Operacoes(5,3);
		int ret = op.subtracao();
		//testeDaniel
		Assert.assertEquals(2, ret);
		Operacoes op = new Operacoes(3,3);
		int ret = op.soma();
		Assert.assertEquals(6, ret);
	}


}
