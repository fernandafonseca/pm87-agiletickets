package br.com.caelum.agiletickets.models;

public enum TipoDeEspetaculo {
	
	CINEMA(0.10, 0.05,0), 
	SHOW(0.10, 0.05,0), 
	TEATRO(0, 0, 0), 
	BALLET(0.20, 0.50, 60), 
	ORQUESTRA(0.20, 0.50, 60);

	private double percentualAumento;
	private double percentualLotacao;
	private int    duracao;
	
	private TipoDeEspetaculo(double percentualAumento,double percentualLotacao, int duracao) {
		this.percentualAumento = percentualAumento;
		this.percentualLotacao = percentualLotacao;
		this.duracao = duracao;
	}

	
}
