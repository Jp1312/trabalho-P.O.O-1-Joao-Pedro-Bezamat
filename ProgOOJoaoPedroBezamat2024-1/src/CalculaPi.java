public class CalculaPi {
    public static void main(String[] args) {
        int n = 100000; // número de termos
        double pi = calcularPI(n);
        System.out.println("Valor aproximado de PI: " + pi);
    }

    public static double calcularPI(int n) {
        double pi = 0;
        boolean adicionar = true;

        for (int i = 1; i <= n; i += 2) {
            if (adicionar) {
                pi += 1.0 / i;
            } else {
                pi -= 1.0 / i;
            }
            adicionar = !adicionar;
        }

        return 4 * pi;
    }
}