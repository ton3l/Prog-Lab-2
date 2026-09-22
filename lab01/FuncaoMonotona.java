import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

public class FuncaoMonotona {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int um = sc.nextInt();
    int dois = sc.nextInt();
    int tres = sc.nextInt();
    int quatro = sc.nextInt();
    sc.close();

    if (um < dois && dois < tres && tres < quatro) {
      System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
    } else if (um > dois && dois > tres && tres > quatro) {
      System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
    } else {
      System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
    }
  }
}
