import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // dados do primeiro veículo
        System.out.println("\nPRIMEIRO VEICULO:");
        System.out.println("\npeso(em kg): ");
        int pesoVeiculo1 = scanner.nextInt();
        System.out.println("velocidade maxima(em Km/h): ");
        int velocMaxVeiculo1 = scanner.nextInt();
        System.out.println("preço(em R$): ");
        float precoVeiculo1 = scanner.nextFloat();

        //cria o primeiro objeto Veiculo
        Veiculo veiculo1 = new Veiculo(pesoVeiculo1, velocMaxVeiculo1, precoVeiculo1);

        //dados do segundo veículo
        System.out.println("\nSEGUNDO VEICULO:");
        System.out.println("\npeso(em kg): ");
        int pesoVeiculo2 = scanner.nextInt();
        System.out.println("velocidade maxima(em Km/h): ");
        int velocMaxVeiculo2 = scanner.nextInt();
        System.out.println("preço(em R$): ");
        float precoVeiculo2 = scanner.nextFloat();

        //cria o segundo objeto Veiculo
        Veiculo veiculo2 = new Veiculo(pesoVeiculo2, velocMaxVeiculo2, precoVeiculo2);

        //exibe dados dos veiculos
        System.out.println("\nDetalhes do primeiro veículo:");
        System.out.println(veiculo1.toString());

        System.out.println("\nDetalhes do segundo veículo:");
        System.out.println(veiculo2.toString());

        //fecha o scanner
        scanner.close();
    }
}