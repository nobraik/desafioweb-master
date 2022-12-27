package steps;

import drivers.DriversFactory;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import pages.Elementos;
import runner.Executar;

public class Documentos extends DriversFactory{

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
     Executar ex = new Executar();


     @Dado("que eu acesse a opition automacao web")
     public void queEuAcesseAOpitionAutomacaoWeb() {
    	ex.enptyProjet();
 
     }
     @Quando("eu clico em formulario")
     public void euClicoEmFormulario() {
        
     }
     @Quando("clicar em criar formulario")
     public void clicarEmCriarFormulario() {
 
     }
     @Quando("preencho campos em brancos com dado validos")
     public void preenchoCamposEmBrancosComDadoValidos() {

     }
     @Quando("se clico na option criar")
     public void seClicoNaOptionCriar() {
     
     }
     @Entao("usuario nao cadastrado")
     public void usuarioNaoCadastrado() {
 
     }



		
	}



	
