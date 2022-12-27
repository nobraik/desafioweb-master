package metodos;

import org.junit.AfterClass;
import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory  {
	
	
	/// medoto para escrever um texto ou preecher uma informação
	
	
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	
	//metodo para clicar em um objeto botão icone etc..

	public void clicar( Object buttons, By elemento) {
		driver.findElement(elemento).click();
	}

	
	///metodos para finalizar o teste
	@AfterClass
	public void finalizarTeste() {

	
	}
	

	}
	

		
		
	

