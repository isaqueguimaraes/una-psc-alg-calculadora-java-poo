import java.util.Scanner;

public class Calculadora {
  private double numeroUm;
  private double numeroDois;

  public Calculadora(double numeroUm, double numeroDois) {
    this.numeroUm = numeroUm;
    this.numeroDois = numeroDois;
  }

  public double getNumeroUm() {
    return numeroUm;
  }

  public void setNumeroUm(double numeroUm) {
    this.numeroUm = numeroUm;
  }

  public double getNumeroDois() {
    return numeroDois;
  }

  public void setNumeroDois(double numeroDois) {
    this.numeroDois = numeroDois;
  }

  public double somar() {
    return numeroUm + numeroDois;
  }

  public double subtrair() {
    return numeroUm - numeroDois;
  }

  public double multiplicar() {
    return numeroUm * numeroDois;
  }

  public String dividir() {
    if (numeroDois == 0) {
      return "Impossível realizar uma divisão por zero.";
    }
    return String.valueOf(numeroUm / numeroDois);
  }

  public double potencia() {

    if (numeroDois == 0) {
      return 1;
    }
    return Math.pow(numeroUm, numeroDois);
  }

  public String raizQuadrada() {
    if (numeroUm < 0) {
      return "Não existe raiz de número negativo.";
    }
    return String.valueOf(Math.sqrt(numeroUm));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String opcao;

    do {
      System.out.println("\n--- CALCULADORA ---");
      System.out.print("Digite o primeiro número: ");
      double numeroUm = scanner.nextDouble();

      System.out.print("Digite o segundo número: ");
      double numeroDois = scanner.nextDouble();

      Calculadora calc = new Calculadora(numeroUm, numeroDois);

      System.out.println("\nResultados:");
      System.out.println("Soma: " + calc.somar());
      System.out.println("Subtração: " + calc.subtrair());
      System.out.println("Multiplicação: " + calc.multiplicar());
      System.out.println("Divisão: " + calc.dividir());
      System.out.println("Potência: " + calc.potencia());
      System.out.println("Raiz quadrada do primeiro número: " + calc.raizQuadrada());

      System.out.print("\nDigite 'Q' para sair ou qualquer outra tecla para continuar: ");
      opcao = scanner.next();
    } while (!opcao.equalsIgnoreCase("Q"));

    System.out.println("\nPrograma encerrado.");
    scanner.close();
  }
}