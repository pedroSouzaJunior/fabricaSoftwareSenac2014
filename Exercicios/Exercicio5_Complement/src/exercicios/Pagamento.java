package exercicios;

public class Pagamento {

	public static void main(String[] args) {
	
	String tipoDePagamento = "TresVezes";
	double desc_AVista, desc_Cheque, desc_TresVezes, desc_SeisVezes, desc_DozeVezes,
	valorCompra, parcelaTres,parcelaSeis,parcelaDoze;
	
	valorCompra = 1000;
	
		desc_AVista = valorCompra - (0.15 * valorCompra);
		desc_Cheque = valorCompra - (0.10 * valorCompra);
		desc_TresVezes = valorCompra - (0.05 * valorCompra);
		desc_SeisVezes = valorCompra;
		desc_DozeVezes = valorCompra + (0.08 * valorCompra);

		parcelaTres = desc_TresVezes / 3;
		parcelaSeis = desc_SeisVezes / 6;
		parcelaDoze = desc_DozeVezes / 12;
	
		if (tipoDePagamento == "Avista")
			System.out.println("valor da compra: " + valorCompra+ " valor a Pagar: " + desc_AVista);
		else if (tipoDePagamento == "Cheque")
			System.out.println("valor da compra: " + valorCompra+ " valor a Pagar: " + desc_Cheque);
		else if (tipoDePagamento == "TresVezes") {
			System.out.println("valor da compra: " + valorCompra);
			System.out.println("valor a Pagar: " + desc_TresVezes+ " 3 parcelas de: " + parcelaTres);
		}
		else if (tipoDePagamento == "SeisVezes") {
			System.out.println("valor da compra: " + valorCompra);
			System.out.println("valor a Pagar: " + desc_SeisVezes+" 6 parcelas de: "+parcelaSeis);
		}
		else if (tipoDePagamento == "DozeVezes") {
			System.out.println("valor da compra: " + valorCompra);
			System.out.println("valor a Pagar: " + desc_DozeVezes+" 12 parcelas de: "+parcelaDoze);
		}
	
	}

}
