public class CalculaNumPerfeitos {

    //método criado para verificar se um número X é perfeito
    static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int count = 0;//contador
        int num = 2;
        System.out.println("Os quatro primeiros números perfeitos são:");

        //loop pra buscar os numeros perfeitos, usando o método isPerfect acima

        while (count < 4) {
            if (isPerfect(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}