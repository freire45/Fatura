package br.com.erickfreire.fatura;

public class FaturaTeste {
	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1","Monitor",3,650.00);
		
		System.out.printf("Numero da Fatura: %s%nProduto: %s%nQuantidade: %d%nValor Unitário: %.2f%nTotal da Fatura: %.2f%n", 
				fatura1.getNumero(), fatura1.getDescricao(), fatura1.getQuantidade(), fatura1.getPreco(), fatura1.getValorFatura());
	}

}
