public class Calculadora {
  private double valor1;
  private double valor2;

  public Calculadora(double valor1, double valor2){
    this.valor1 = valor1;
    this.valor2 = valor2;
  }
  
  public double somar(){
    return valor1 + valor2;  
  }
  public double subtrair(){
    return valor1 - valor2;
  }
  public double multiplicar(){
    return valor1 * valor2;
  }
  public double dividir(){
    if(valor2 != 0){
      return valor1 / valor2;
    }else{
    throw new ArithmeticException("Divisão por Zero Não permitida");
    }
  }
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora(10.0, 5.0);
    System.out.println("Soma: " + calculadora.somar());
    System.out.println("Subtração: " + calculadora.subtrair());
    System.out.println("Multiplicação: " + calculadora.multiplicar());
    System.out.println("Divisão: " + calculadora.dividir());
  }
}
