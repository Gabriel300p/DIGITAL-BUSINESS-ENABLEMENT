package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class DescontoPorQuantidade extends Desconto{

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getTotalDeItens () > 10) {
			return pedido.getValor().multiply(new BigDecimal(0.5));
		}
		
		return proximo.calcular(pedido);
	}

}
