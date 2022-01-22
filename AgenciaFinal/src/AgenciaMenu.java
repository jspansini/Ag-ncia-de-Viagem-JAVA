import java.util.Scanner;

public class AgenciaMenu {

	public static void main(String[] args) {
		
		clientes cl1 = new clientes();
		destinos de1 = new destinos();

		Scanner entrada = new Scanner(System.in);
		
		int opcao, continuar;
		do {
			
		System.out.println(":::::::::::::::::::::::::::: AGÊNCIA DE VIAGENS :::::::::::::::::::::::::::::::\n");
		System.out.println("                             ESCOLHA UMA OPÇÃO            \n");
		
		System.out.println("[1] CADASTRAR NOVO CLIENTE - [2] CADASTRAR DESTINOS - [3] - ENCERRAR PROGRAMA\n");
		opcao = entrada.nextInt();
		
		}while (opcao >= 4);
		
			switch (opcao) {
		
				case 1:
					System.out.println("::: SEJA BEM VINDO AO CADASTRO DE NOVOS CLIENTES :::\n");
					cl1.cadastrarNovo();
					System.out.println("::: DESEJA CONSULTAR CADASTROS? [1]SIM - [2]NÃO :::\n");
					continuar = entrada.nextInt();
					
					if (continuar == 1 ) {
						System.out.println("STATUS DE CADASTROS ATUAIS....");
						cl1.consultarStatus();
					}else {
						System.out.println("Obrigada, volte sempre!");
					}
					break;
					
				case 2: 
					System.out.println("::: SEJA BEM VINDO AO CADASTRO DE NOVOS DESTINOS :::\n");
					de1.cadastrarDestino();
					
					System.out.println("::: DESEJA CONSULTAR DESTINOS SALVOS? [1]SIM - [2]NÃO :::\n");
					continuar = entrada.nextInt();
					
					if (continuar == 1 ) {
						System.out.println("STATUS DE CADASTROS ATUAIS....");
						de1.consultarDestinos();
					}else {
						System.out.println("Obrigada, volte sempre!");
					}
					break;
					
				case 3:
					System.out.println(" Ok, até mais!");
				} 
		}
	}

