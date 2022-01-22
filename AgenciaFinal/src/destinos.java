import java.util.Scanner;

public class destinos {

	private String[] novoDestino = new String [2];
	private double[] tarifaViagem = new double[2];
	

public void cadastrarDestino () {
	Scanner input = new Scanner(System.in);
	for(int i = 0; i < novoDestino.length; i++) {
		System.out.println("Local de destino: ");
		this.novoDestino[i] = input.next();
		System.out.println("Digite o valor do ticket R$: ");
		this.tarifaViagem[i] = input.nextDouble();
		System.out.println(":::::::::::::::::::::::::::::");
		}
}

public void consultarDestinos() {
		for(int i = 0; i < novoDestino.length; i++) {
			System.out.println((i+1) + "º destino no cadastro: " + this.novoDestino[i]);
			System.out.println("Valor da passagem: R$ " + this.tarifaViagem[i]);
			System.out.println(":::::::::::::::::::::::::::::");
		}
	}
	
}