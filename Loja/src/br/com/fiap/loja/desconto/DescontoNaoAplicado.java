package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class DescontoNaoAplicado extends Desconto{

	public DescontoNaoAplicado() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ZERO;
	}

}
