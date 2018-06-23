
public class Assunto {
	int id;
	TipoAssunto tipo;
	String descricao;
	String providencia;
	int duracaoAtendimentoAssunto;
	int prioridade;
	int cont;
	
	public Assunto(int id, TipoAssunto tipo, String descricao, String providencia, int duracaoAtendimento ,int prioridade) {
		this.id 				= id;
		this.tipo				= tipo;
		this.descricao 			= descricao;
		this.providencia 		= providencia;
		this.duracaoAtendimentoAssunto = duracaoAtendimento;
		this.prioridade 		= prioridade;
		this.cont				= 0;
		
	}

}
