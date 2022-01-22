import java.util.Scanner;

public class clientes {

	private String[] nomeCliente = new String [2];
	private String[] destinoCliente = new String [2];
	private double[] valorViagem = new double[2];
	

public void cadastrarNovo () {
	Scanner input = new Scanner(System.in);
	for(int i = 0; i < nomeCliente.length; i++) {
		System.out.print("Nome do " +  (i+1) + "º cliente: ");
		this.nomeCliente[i] = input.next();
		System.out.print("Destino: ");
		this.destinoCliente[i] = input.next();
		System.out.print("Digite o valor R$: ");
		this.valorViagem[i] = input.nextDouble();
		System.out.println(":::::::::::::::::::::::::::::");
		}
}

public void consultarStatus() {
		for(int i = 0; i < nomeCliente.length; i++) {
			System.out.println((i+1) + "º cliente: " + this.nomeCliente[i]);
			System.out.println("Viajará para: " + this.destinoCliente[i]);
			System.out.println(" Pelo valor: R$ " + this.valorViagem[i]);
			System.out.println(":::::::::::::::::::::::::::::");
		}
}
}
