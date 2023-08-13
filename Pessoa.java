public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, 1.75, 70.5);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
    }
}
