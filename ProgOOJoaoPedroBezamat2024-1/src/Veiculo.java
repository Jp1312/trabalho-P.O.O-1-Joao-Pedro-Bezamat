public class Veiculo {
    private int peso; // em kg
    private int velocMax; // em Km/h
    private float preco; // em R$

    // Construtor sem argumentos
    public Veiculo() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }


    // Construtor que aceita argumentos de peso, velocidade máxima e preço
    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    // Métodos getters e setters para cada atributo
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Método para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Detalhes do veículo:");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Velocidade Máxima: " + velocMax + " Km/h");
        System.out.println("Preço: R$ " + preco);
    }
    public String toString() {
        return "Veiculo{" +
                "peso=" + peso +
                ", velocMax=" + velocMax +
                ", preco=" + preco +
                '}';
    }
    // Método toString para exibir os dados do veículo
    public static void main(String[] args) {
        // argumentos
        Veiculo carro = new Veiculo();
        carro.setPeso(1200);
        carro.setVelocMax(200);
        carro.setPreco(50000.00f);
        carro.exibirDetalhes();
    }
}