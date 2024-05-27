public class Main {
  public static void main(String[] args) {
    System.out.println("Uma Tv de 200 Watts fica ligada aproximadamente 5h diariamente. Determine o consumo elétrico mensal da TV.");
    System.out.println("");
    System.out.println("A potencia considerada é:");
    int potencia = 200;
    System.out.println(potencia);
    System.out.println("O tempo gasto é:");
    int tempo1 = 5;
    System.out.println(tempo1);
    System.out.println("Os dias considerados é:");
    int tempo2 = 30;
    System.out.println(tempo2);
     System.out.println("Multiplicação da potencia e tempo:");
    int calculo = (potencia * tempo1);
    
    System.out.println(calculo);
    System.out.println("Multiplicação do resultado da multiplicação da potencia e tempo pelos dias:");
      int calculo2 = (calculo * tempo2);
    System.out.println(calculo2);
    System.out.println("Divisão dos resultados da multiplicação:");
    int calculo3 = (calculo2 / 1000);

    System.out.println(calculo3);
    System.out.println("");
    System.out.println("Resultado:");
    System.out.println("30KWH");
  }
}