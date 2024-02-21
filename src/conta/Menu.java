package conta;

import conta.model.conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;



public class Menu {

	public static void main(String[] args) {


		conta c1 = new conta(1, 123, 1, " Amanda", 25000.00f);

		c1.visualizar();
		c1.setAgencia(456);
		System.out.println(c1.getAgencia());

		if (c1.sacar(100))
			;
		System.out.println(" Saque efetuado com sucesso.O novo saldo é de R$: " + c1.getSaldo());
	
		
		c1.depositar(1000);
		System.out.println("O novo saldo é: " + c1.getSaldo());
		c1.visualizar();
		System.out.println("O  saldo é: " + c1.getSaldo());
	
		ContaCorrente cc1 = new ContaCorrente(1, 678, 1, "Anna Julia", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Julia", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
	}

}



