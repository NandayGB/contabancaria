package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;


public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

	ContaController contas= new ContaController;
	
	int opcao,numero,agencia,tipo,aniversario;
	String titular;
	float saldo,limite;


	
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
		
		
		while (true) {
			
			
			System.out.println (Cores.TEXT_RED);
			System.out.println("                                                     ");
			System.out.println("********BANCO NANBANK****************************");
			System.out.println("*****************************************************);                                                     ");
			System.out.println(" 1 - Criar conta);                                                     ");
			System.out.println(" 2 - Listar todas as contas  ");
			System.out.println(" 3 - Buscar conta por Numero  ");
			System.out.println(" 4 - Atualizar Dados da conta ");
			System.out.println(" 5 - Apagar Conta ");
			System.out.println(" 6 - Sacar ");
			System.out.println(" 7 - Depositar ");
			System.out.println(" 8 - Transferir valore entre contas ");
			System.out.println(" 9 - Sair ");
			System.out.println("*****************************************************);                                                     ");
			                                                 
			System.out.println("Entre com a opção desejada:    ");
			System.out.println(" **** ");
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if (opcao == 9) {
				System.out.println("\nBanco NANBANK agradece por utilizar nosso sistema de banco.\nTenha um ótimo dia e até a próxima visita!");
				
                 		leia.close();
				System.exit(0);
			}
					}

					switch (opcao) {
					case 1:
						System.out.println("\n Criar Conta");

						keyPress();
						break;
					case 2:
						System.out.println("\n Listar todas as Contas");
						contas.listarTodas();
						keyPress();
						break;
						
					case 3:
						System.out.println(Cores.TEXT_BLUE + " Buscar Conta por número");
						System.out.println(Cores.TEXT_GREEN + " Digite o número da conta:");
						numero =leia.nextInt();
						contas.procurarPorNumero(numero);
						
						keyPress();
						break;
					case 4:
						System.out.println(Cores.TEXT_BLUE + " Atualizar dados da Conta");

						keyPress();
						break;
					case 5:
						System.out.println(Cores.TEXT_RED_BOLD + "Apagar Conta");

						keyPress();
						break;
					case 6:
						System.out.println("\n Sacar");

						keyPress();
						break;
					case 7:
						System.out.println("\n Depositar");

						keyPress();
						break;
					case 8:
						System.out.println("\n Transferir");

						keyPress();
						break;
					default:
						System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
						
						keyPress();
						break;
					}
				}
			}

		    	
			}
		    
			
			public static void keyPress() {

				try {

					System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
					System.in.read();

				} catch (IOException e) {

					System.out.println("Você pressionou uma tecla diferente de enter!");

				}
			}
		}

