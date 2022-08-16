package Project;

import java.util.Scanner;

public class Teste {

	public static void main(String [ ] args) {
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Escolha: ");
		System.out.println("1 - CC Comum");
		System.out.println("2 - CC Premium");
		
		int esc = imput.nextInt();
		Cartao cc = null;
		switch(esc) {
		
			case 1:
				cc = (CartaoComum) new CartaoComum(11, 1234, "Joao");
			break;
			case 2:
				cc = (CartaoPremium) new CartaoPremium(12, 4321, "Maria");
			break;
			default:
				System.out.println("[!]Escolha invalida");
			break;
		
		}
		
		Produto produto = new Produto("09/08/21", "Celular", 500.00);
		int senha;
		
		while (esc < 4) {
			System.out.printf("\n");
			System.out.println("Escolha: ");
			System.out.println("1 - Bloquear");
			System.out.println("2 - Desbloquear");
			System.out.println("3 - Comprar");
			esc = imput.nextInt();
			
			switch(esc) {
				case 1: 
					System.out.println("Informe a senha: ");
					senha = imput.nextInt();
					if(cc.bloquearCartao(senha)) {
						System.out.println("Cartao Bloqueado");
					}else {
						System.out.println("[!] Senha invalida");
					}
				break;
				case 2:
					System.out.println("Informe a senha: ");
					senha = imput.nextInt();
					if(cc.bloquearCartao(senha)) {
						System.out.println("Cartao Desloqueado");
					}else {
						System.out.println("[!] Senha invalida");
					}
				break;
				
				case 3:
					System.out.println("Informe a senha: ");
					senha = imput.nextInt();
					if(cc.ralizarCompras(produto, senha)) {
						
						System.out.println("Compra realizada");
						System.out.print(cc.toString());
					}else{
						
						System.out.println("[!] Compra nao realizada!");			
					}
					
				break;
				
				default:
					esc = 4;
				break;
			}
		}
		imput.close();
	}

}
