import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

public class Blitz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d_venc_linc = sc.nextInt();
    int d_venc_cart = sc.nextInt();
    double baf = sc.nextDouble();
    sc.close();

    if (d_venc_linc >= 30 || d_venc_cart >= 30 || baf > 0.05) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
