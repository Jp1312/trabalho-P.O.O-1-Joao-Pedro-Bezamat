public class ContaLetrasA {
    public static void main(String[] args) {
        String frase = "Os nomes das classes em Java precisam começar com uma letra e depois destas quaisquer combinações de letras e dígitos.Como padrão,os nomes são substantivos que iniciam com uma letra maiúscula.Para as constantes é costume utilizar sempre letras maiúsculas no nome";

        int contador = contarLetraA(frase);

        System.out.println("Número de ocorrências da letra 'a': " + contador);
    }


    //metodo usado pra contar as ocorrencias da letra A
    public static int contarLetraA(String frase) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }
}