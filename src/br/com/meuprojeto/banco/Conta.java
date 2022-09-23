package br.com.meuprojeto.banco;
public class Conta {
	//criando os atributos
	private String numero;
	private float saldo;
	
	//criando os getters e setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	//criando os metodos
	public void creditar(float valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(float valor) {
		saldo = saldo - valor;
	}
	
	public Conta(String numeroDaConta, float saldoInicial){
		numero = numeroDaConta;
		saldo = saldoInicial;		
	}
	
	public static void main(String[] args) {
		//uso de classe com  array
		Conta contas[] = new Conta[100];
		
		contas[0] = new Conta("1234", 234);
		contas[0].creditar(50);
		
		
		contas[1] = new Conta("5478", 300);
		contas[1].debitar(100);
		
		contas[2] = new Conta("9875", 800);
		contas[2].debitar(36);
		
		UtilitarioContas uc = new UtilitarioContas();
		
		uc.imprimirContas(contas);
		uc.somarSaldos(contas);
		
		//System.out.println("Numero da conta: " + contas[0].numero + " Saldo da conta: " + contas[0].saldo);
		//System.out.println("Numero da conta: " + contas[1].numero + " Saldo da conta: " + contas[1].saldo);
		
		
//		Conta obj1 = new Conta("1234", 234);
//		obj1.creditar(50);
//		System.out.println("Numero da conta: " + obj1.numero + " Saldo da conta: " + obj1.saldo);
//		
//		System.out.println("=================");
//		
//		Conta obj2 = new Conta("8902", 100);
//		obj2.creditar(10);
//		System.out.println("Numero da conta: " + obj2.numero + " Saldo da conta: " + obj2.saldo);
	}
}
