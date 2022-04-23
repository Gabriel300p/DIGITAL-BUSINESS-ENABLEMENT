package br.com.fiap.loja;

import java.math.BigDecimal;

public class Pedido {
	
	// Stategy = Padrão de projeto comportamental que permite que você defina uma família de algoritmos,
	// Coloque-os em classes separadas, e faça os objetos deles intercabiáveis.
	
	// Classes separas para organizar as suas responsabilidades.
	// Cada classe tem que ter uma responsabilidade.
	// Ou sejam, para um mesmo problema é possivel resolver de varias formas.
	
	private BigDecimal valor;
	private int TotalDeItens;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.TotalDeItens = 1;
	}

	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		TotalDeItens = totalDeItens;
	}
	
	public int getTotalDeItens() {
		return TotalDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
}
