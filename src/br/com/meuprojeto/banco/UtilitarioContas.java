package br.com.meuprojeto.banco;

public class UtilitarioContas {

	public void imprimirContas(Conta[] contas) {
		for(int i=0; i<contas.length; i++ ) {
			if(contas[i] != null) {
				System.out.println("Número da Conta: " + contas[i].getNumero() + " Saldo: " + contas[i].getSaldo());
			}
		}		
	}
	
	public void somarSaldos(Conta[] contas) {
		float saldoTotal = 0;
		
		for(int i=0; i<contas.length; i++ ) {
			if(contas[i] != null) {
				saldoTotal = saldoTotal + contas[i].getSaldo();
			}
		}
		System.out.println("Saldo Total: " + saldoTotal);
	}
}
