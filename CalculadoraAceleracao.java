import java.util.Scanner;

public class CalculadoraAceleracao {
    private double forca;
    private double massa;

    public CalculadoraAceleracao(double forca, double massa) {
        this.forca = forca;
        this.massa = massa;
    }

    public double calcularAceleracao() {
        if (massa != 0) {
            return forca / massa;
        } else {
            throw new ArithmeticException("A massa não pode ser zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força (em Newton): ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a massa (em kg): ");
        double massa = scanner.nextDouble();

        CalculadoraAceleracao calculadora = new CalculadoraAceleracao(forca, massa);

        try {
            double aceleracao = calculadora.calcularAceleracao();
            System.out.println("A aceleração adquirida pelo objeto é " + aceleracao + " m/s².");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}