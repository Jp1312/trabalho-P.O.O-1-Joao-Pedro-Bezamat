public class EncontrarNumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 100:");

        // Loop para verificar cada número de 1 a 100
        for (int i = 2; i <= 100; i++) {
            boolean ehPrimo = true;

            // Verifica se o número é divisível por algum número além de 1 e ele mesmo
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            // Se o número for primo, imprime-o
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}