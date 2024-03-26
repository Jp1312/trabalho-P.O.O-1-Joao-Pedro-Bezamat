public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3, i;

        //inicia a sequencia
        System.out.print(n1 + " " + n2 + " ");

        for (i = 2; i < 15; ++i) {
            n3 = n1 + n2; //calcula o prox numero da sequencia
            System.out.print(n3 + " "); //printa o prox numero + os espaços
            n1 = n2;
            n2 = n3;
        }
    }
}
