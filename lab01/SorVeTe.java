
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

/*
 * 1. coletar dados
 * 2. obter a distância, multiplicando vel pelo tempo e somando pos int
 * 3. imprimir a diferença
 * */
import java.util.Scanner;

public class SorVeTe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int so1 = sc.nextInt();
    int vo1 = sc.nextInt();
    int so2 = sc.nextInt();
    int vo2 = sc.nextInt();
    int t = sc.nextInt();
    sc.close();

    int si1 = vo1 * t + so1;
    int si2 = vo2 * t + so2;

    System.out.println(Math.abs(si1 - si2));

  }
}
