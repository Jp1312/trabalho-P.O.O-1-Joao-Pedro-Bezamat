import java.util.Scanner;

public class EhPalindromo {
    // Método para verificar se uma string é um palíndromo
    public static boolean ehPalindromo(String str) {
        // Remover espaços em branco e converter para letras minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Verificar se a string é um palíndromo
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Não é um palíndromo
            }
            i++;
            j--;
        }
        return true; // É um palíndromo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String str = scanner.nextLine();

        if (ehPalindromo(str)) {
            System.out.println("A string \"" + str + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + str + "\" não é um palíndromo.");
        }

        scanner.close();
    }}
