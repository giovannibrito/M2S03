public class Cliente {
    private String nome;
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double altura;
    private Integer idade;
    public static void main(String[] args) {

    }
    public Cliente(String nome, double peso, double altura, Integer idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Cliente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
}
