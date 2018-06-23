
public class Cliente {
	int id;
	String nome;
	FilaAssuntos filaAssuntos;
	FilaAssuntos assuntosPadrao;
	float mediaTempoAtendimento;
	int prioridade;
	
	
	public  Cliente(int id, String nome, FilaAssuntos filaAssuntos, FilaAssuntos assuntosPadrao) {
		this.id	= id;
		this.nome = nome;
		this.filaAssuntos = filaAssuntos;
		this.assuntosPadrao = assuntosPadrao;
		this.mediaTempoAtendimento = 0;
		this.prioridade = 0;
		
	}

}
