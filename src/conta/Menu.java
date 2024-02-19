package conta;

import conta.model.conta;

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
	}

}
