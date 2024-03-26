public class CriaStringNova {
    public static void main(String[] args) {
        String original = "Exemplo de uso de métodos para Strings";
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char letra = original.charAt(i);
            if (i % 2 == 0) {
                resultado.append(Character.toUpperCase(letra));
            } else {
                resultado.append(Character.toLowerCase(letra));
            }
        }

        System.out.println(resultado.toString());
    }
}

