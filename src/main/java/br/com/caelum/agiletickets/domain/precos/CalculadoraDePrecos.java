package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.Sessao;
import br.com.caelum.agiletickets.models.TipoDeEspetaculo;

public class CalculadoraDePrecos {

	public static BigDecimal calcula(Sessao sessao, Integer quantidade) {
		BigDecimal preco;
		
		TipoDeEspetaculo tipoEspetaculo = sessao.getEspetaculo().getTipo();
		if(tipoEspetaculo.equals(TipoDeEspetaculo.CINEMA) || tipoEspetaculo.equals(TipoDeEspetaculo.SHOW)) {
			preco = sessao.calculaPrecoCinemaShow();
		} else {
			if(tipoEspetaculo.equals(TipoDeEspetaculo.BALLET)) {
				preco = sessao.calculaPrecoBalletOrquestra();
			} else if(tipoEspetaculo.equals(TipoDeEspetaculo.ORQUESTRA)) {
				preco = sessao.calculaPrecoBalletOrquestra();
			}  else {
				preco = sessao.getPreco();
			}
		} 

		return preco.multiply(BigDecimal.valueOf(quantidade));
	}

}