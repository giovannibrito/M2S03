import java.util.ArrayList;
import java.util.OptionalDouble;

public class Clinica {
    private String nomeDono;
    private String nomeClinica;
    private String cnpj;
    private String logradouro;
    private Integer codigoClinica;
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public void main(String[] args) {
       calculaIMC(1.82, 82.5);
    }

    public double calculaIMC(double alturaMetro, double pesoKg){
        double imc = pesoKg/(alturaMetro*alturaMetro);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Excesso de peso");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade grau III");
        } else {
            System.out.println("Não foi possível calcular seu IMC");
        }
        return imc;
    }

    public double tratamento(int id) {
        double pesoAtual = this.listaClientes.get(id).getPeso();
        if (!OptionalDouble.of(pesoAtual).isPresent()) {
            System.out.println("Não foi possível encontrar o cliente");
            return -1;
        }
        double novoPeso = pesoAtual - 5;
        this.listaClientes.get(id).setPeso(novoPeso);
        return novoPeso;

    }

    public double tratamento(int id, double reducaoDesejada) {
        double pesoAtual = this.listaClientes.get(id).getPeso();
        if (!OptionalDouble.of(pesoAtual).isPresent()) {
            System.out.println("Não foi possível encontrar o cliente");
            return -1;
        }
        double novoPeso = pesoAtual - reducaoDesejada;
        this.listaClientes.get(id).setPeso(novoPeso);
        return novoPeso;
    }

    public void adicionaCliente(String nome, double peso, double altura, Integer idade) {
        listaClientes.add(new Cliente(nome, peso, altura, idade));
    }

    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Clinica(String nomeDono, ArrayList<Cliente> listaClientes) {
        this.nomeDono = nomeDono;
        this.listaClientes = listaClientes;
    }


}
