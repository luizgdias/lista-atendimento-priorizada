public class FilaAssuntos {
	private Assunto[] assuntos;
	private int fimFila;
	
	public FilaAssuntos(int tamanhoFila) {
		this.assuntos 			= new Assunto[tamanhoFila];
		fimFila 				= -1;
	}
	
	/****************************************************************************************************************
	 * Métodos para salvar e imprimir a fila de assuntos
	 * **************************************************************************************************************/
	public void armazenaAssunto(Assunto assuntoX) {
		if (fimFila == assuntos.length-1) {
			System.out.println("Não inserido, a fila está cheia!");
		}else {
			
			fimFila++;
			assuntos[fimFila] = assuntoX;
		}
	}
	
	public void imprimeAssuntos() {
		//System.out.println("\nTamanho da fila de assuntos: "+ assuntos.length +"\nLugares ocupados (fimFila): " + (fimFila+1));
		//System.out.print(assuntos);
		for(int x = 0; x <= fimFila; x++) {
			System.out.println("Id assunto: "+assuntos[x].id+ " / Descrição: "+ assuntos[x].descricao+" / Providência: "+ 
			assuntos[x].providencia+" / Contador: "+assuntos[x].cont);
		}
	}
	/****************************************************************************************************************
	 * 
	 * **************************************************************************************************************/
	public int calculaPrioridadeListaDeAssuntos() {
		int result = 0, contador=0;
		for(int x = 0; x <= fimFila; x++) {
			if (assuntos[x] != null) {
				result = result + assuntos[x].tipo.urgencia; 
				 contador++;
			}
			
		}
		
		System.out.println("Contador: "+contador);
		return result;
	}

	public void gerarEstatistica() {
		System.out.print("\nComando: ***Gerar Estatística***\n");
		for(int x = 0; x <= fimFila; x++) {
			System.out.println("Id assunto: "+assuntos[x].id+" Tipo " + assuntos[x].tipo.tipo+" / Descrição: "+ assuntos[x].descricao+" / Contador: "+assuntos[x].cont);
		}
		
	}
	
	public void estatistica(FilaAssuntos padrao, FilaAssuntos cliente) {
		//System.out.print("Cliente: "+cliente.fimFila);
		//System.out.print("Padrao: "+padrao.fimFila);
		//System.out.print("***Estatística Gerada***");
		
		for(int x = 0; x <= cliente.fimFila; x++) {
			for (int i = 0; i < padrao.fimFila; i++) {
				if (cliente.assuntos[x] == padrao.assuntos[i]) {
					padrao.assuntos[i].cont++;
					//System.out.println("Assunto Padrao: "+padrao.assuntos[i].descricao +"Contador do assunto: "+padrao.assuntos[i].cont);
				}
			}
			
			
		}
	}
	
}
