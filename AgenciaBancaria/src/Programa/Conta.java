package Programa;

import utilitarios.Utilss;

public class Conta {

	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private  Pessoa pessoa;
	private Double saldo = 0.0;
	
	public Conta( Pessoa pessoa) {
		
		this.numeroConta =contadorDeContas ;
		this.pessoa = pessoa;
		contadorDeContas += 1;
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa; 
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	 
	
	
public String toString() {
		
		return 	"\nN�mero da conta :" + this.getNumeroConta() +
				"\nNome :" + this.pessoa.getNome() +
				"\nCPF :" + this.pessoa.getCpf() +
				"\nEmail: " + this.pessoa.getEmail() +
				"\nSaldo: " + Utilss.doubleToString(this.getSaldo())+
			
				"\n";
	
	}

public void depositar( double valor) {
	
	if(valor > 0) {
		setSaldo(getSaldo() + valor);
		System.out.println("Seu dep�sito foi realizado com sucesso!");
	}else {
			System.out.println("N�o foi possivel realizar o dep�sito!");
	}
}


public void sacar(double valor) {
	
		if(valor > 0 && this.getSaldo()>= valor) {
			setSaldo(getSaldo()	- valor);
			
			System.out.println(" Saque realizado com sucesso!");
			}else {
				
				System.out.println("N�o foi possivel realizar o  saque!");
			}
}


public void transferir(Conta contaParaDeposito, double valor) {
	if(valor > 0 && this.getSaldo()>= valor) {
		setSaldo(getSaldo()- valor);
		
		contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
		
		System.out.println(" transf�rencia realizado com sucesso!");
	}else {
		
		System.out.println("N�o foi possivel realizar a transf�rencia!");
	}
		
	
}



}
