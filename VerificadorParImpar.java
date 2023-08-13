import java.util.Scanner;

public class VerificadorParImpar {
  private int numero;
  public VerificadorParImpar(int numero){
    this.numero = numero;
  }
  public String verificarParImpar(){
    if(numero % 2 == 0){
      return "par";
    }else{
      return "impar";
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    VerificadorParImpar verificador = new VerificadorParImpar(numero);
    String resultado = verificador.verificarParImpar();

    System.out.println("O número " + numero + " é " + resultado + ".");
  }
}