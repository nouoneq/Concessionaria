// TESTANDO PARA MOSTRAR AO YURI

package Concessionaria.java.Concessionaria;

public class App {
	public static void main(String args []) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.setNome("Roberto");
		cliente1.setRg("34.149.974-2");
		cliente1.setTelefone("(91) 2989-9736");
		cliente1.setEndereco("Travessa Teófilo Conduru");
		cliente1.consultaCliente();
		
		cliente2.setNome("Sebastião");
		cliente2.setRg("46.657.781-3");
		cliente2.setTelefone("(81) 99668-5719");
		cliente2.setEndereco("Rua Cruz Alta");
		cliente2.consultaCliente();
		
		cliente3.setNome("Luiza");
		cliente3.setRg("29.187.886-6");
		cliente3.setTelefone("(81) 99986-6699");
		cliente3.setEndereco("Rua das Andorinhas");
		cliente3.consultaCliente();
	}
}
