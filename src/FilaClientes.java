public class FilaClientes {
	private Cliente[] clientes;
	//private FilaAssuntos assuntos;
	private int fimFila;
	
	public FilaClientes(int tamFila) {
		this.clientes = new Cliente[tamFila];
		//this.assuntos = new FilaAssuntos();
		fimFila = -1;
	}
	
/****************************************************************************************************************
* Métodos para recepcionar e imprimir a fila de clientes
* 1) O método recepcionar recebe o cliente e sua lista de assuntos e os coloca na fila;
* 2) O método imprimeClientes mostra como está a fila de clientes naquele momento;
****************************************************************************************************************/
	public void recepcionarCliente(Cliente clienteX) {
		System.out.println("\nComando: ***Recepcionar Cliente***\n");
		if (fimFila == clientes.length-1) {
			System.out.println("A fila de clientes está cheia!");
		}else {
			fimFila++;
			//System.out.println(clienteX.id);
			//System.out.println(clienteX.nome);
			//clienteX.filaAssuntos.imprimeAssuntos();
			clienteX.prioridade = clienteX.filaAssuntos.calculaPrioridadeListaDeAssuntos();
			clientes[fimFila] = clienteX;
			imprimeFilaClientes();
		}
	}
	
	public void imprimeFilaClientes() {
		//System.out.println("\nTamanho da fila de clientes: "+ clientes.length +"\nLugares ocupados (fimFila): " + (fimFila+1));
		for(int x = 0; x <= fimFila; x++) {
			System.out.println("Id cliente: "+clientes[x].id+ " / Nome Cliente: "+ clientes[x].nome+" / Prioridade: "+clientes[x].prioridade);
		}
	}
	
/****************************************************************************************************************
* Métodos para atender o primeiro cliente da fila
* 1) A fila deve ser ordenada de acordo com a prioridade de cada cliente;
* 2) Deve ser realizado um heap na fila de clientes, ordenando de acordo com clientes[x].prioridade 
* 	Métodos criados:
* 		atenderCliente(): invoca outro método responsável por ordenar a fila de acordo com determinado característica
* 		descer(): responsável por ordenar a fila de acordo com a característica clientes[x].prioridade
****************************************************************************************************************/
	
	public void atenderCliente() {
		System.out.println("\nComando: ***Atender Cliente***");
		System.out.println("***Lista em ordem de atendimento***");
		for (int i = clientes.length/2; i >= 0; i--) {
			descer(i);
		}
		imprimeFilaClientes();
		
	}
	
	private void descer(int i) {
		int filho = 2*i+1;
		if (filho <= clientes.length ) {
			if (filho < clientes.length - 1) {
				if (clientes[i].prioridade > clientes[filho].prioridade) {
					filho = filho + 1;
				}
				if (clientes[i].prioridade < clientes[filho].prioridade) {
					Cliente aux = clientes[i];
					clientes[i] = clientes[filho];
					clientes[filho] = aux;
					descer(filho);
				}
			}
		}
	}
	
/****************************************************************************************************************
* Métodos para encerrar o atendimento do cliente atendido
* 
****************************************************************************************************************/	
	public void encerrarAtendimento() {
		System.out.println("\nComando: ***Encerrar Atendimento***");
		if (fimFila < 0) {
			System.out.println("Todos os clientes já foram atendidos!");
		}else {
			incrementaEstatistica(clientes[0].assuntosPadrao, clientes[0].filaAssuntos);
			clientes[0] = null;
		}
		
		for(int x = 0; x < fimFila; x++) {
			clientes[x] = clientes[x+1];
		}
		clientes[fimFila] = null;
		--fimFila;
		imprimeFilaClientes();
	}

	private void incrementaEstatistica(FilaAssuntos assuntosPadrao, FilaAssuntos filaAssuntos) {
		filaAssuntos.estatistica(assuntosPadrao, filaAssuntos);
	}
	

}

