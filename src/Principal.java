
public class Principal {

	public static void main(String[] args) {
		
		TipoAssunto naoCorrentista	= new TipoAssunto("nc", "naoCorrentista", 1);
		TipoAssunto pessoaFisica 	= new TipoAssunto("pf", "pessoaFisica", 2);
		TipoAssunto pessoaJuridica	= new TipoAssunto("pj", "pessoaJuridica", 3);

		
		
		FilaAssuntos assuntosPadrao = new FilaAssuntos(14);
		/***********************************
		 * Declarando assuntos-padrão
		 **********************************/
		Assunto a1 = new Assunto(10, naoCorrentista, "pf_abrir_conta_corrente", "abrir_conta_corrente", 15, 1);
		Assunto a2 = new Assunto(11, pessoaFisica, "pf_abrir_conta_poupança", "pf_abrir_conta_poupança", 20, 2);
		Assunto a3 = new Assunto(12, pessoaJuridica, "realizar_deposito", "realizar_deposito", 25, 3);
		Assunto a4 = new Assunto(13, pessoaFisica, "realizar_saque", "realizar_saque", 30, 4);
		
		/***********************************
		 * Armazenando assuntos padrão 
		 **********************************/
		assuntosPadrao.armazenaAssunto(a1);
		assuntosPadrao.armazenaAssunto(a2);
		assuntosPadrao.armazenaAssunto(a3);
		assuntosPadrao.armazenaAssunto(a4);
		
		/***********************************
		 * Fila de assuntos de um cliente 
		 **********************************/
		FilaAssuntos assuntosDoLuiz = new FilaAssuntos(5);
		assuntosDoLuiz.armazenaAssunto(a1);
		assuntosDoLuiz.armazenaAssunto(a3);
		assuntosDoLuiz.armazenaAssunto(a3);
		
		FilaAssuntos assuntosDoCarlos = new FilaAssuntos(5);
		assuntosDoCarlos.armazenaAssunto(a2);
		assuntosDoCarlos.armazenaAssunto(a4);
		
		FilaAssuntos assuntosDaAlana = new FilaAssuntos(5);
		assuntosDaAlana.armazenaAssunto(a2);
		
		FilaAssuntos assuntosDaKelli = new FilaAssuntos(5);
		assuntosDaKelli.armazenaAssunto(a1);
		
		FilaAssuntos assuntosDoLuizC = new FilaAssuntos(5);
		assuntosDoLuizC.armazenaAssunto(a1);
		assuntosDoLuizC.armazenaAssunto(a2);
		assuntosDoLuizC.armazenaAssunto(a3);
		//assuntosDoLuizC.armazenaAssunto(a4);
		
		
		
		FilaClientes clientes = new FilaClientes(5);
		Cliente Luiz 	= new Cliente(111, "Luiz", assuntosDoLuiz, assuntosPadrao);
		Cliente Carlos 	= new Cliente(112, "Carlos_A", assuntosDoCarlos, assuntosPadrao);
		Cliente Alana 	= new Cliente(113, "Alana_M", assuntosDaAlana, assuntosPadrao);
		Cliente Kelli 	= new Cliente(114, "Kelli_E", assuntosDaKelli, assuntosPadrao);
		Cliente LuizC 	= new Cliente(115, "Luiz_C", assuntosDoLuizC, assuntosPadrao);
		
		clientes.recepcionarCliente(Luiz);
		clientes.recepcionarCliente(Carlos);
		clientes.recepcionarCliente(Alana);
		clientes.recepcionarCliente(Kelli);
		clientes.recepcionarCliente(LuizC);
		
		assuntosPadrao.gerarEstatistica();
		clientes.atenderCliente();
		clientes.encerrarAtendimento();
		assuntosPadrao.gerarEstatistica();
		clientes.encerrarAtendimento();
		assuntosPadrao.gerarEstatistica();
		//clientes.encerrarAtendimento();
		//clientes.encerrarAtendimento();
		//clientes.atenderCliente();
		//clientes.encerrarAtendimento();
	}



}
