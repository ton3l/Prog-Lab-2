import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

public class AcimaDaMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] partes = sc.nextLine().split(" ");
    sc.close();

    int[] nums = new int[partes.length];
    double sum = 0;

    for (int i = 0; i < partes.length; i++) {
      nums[i] = Integer.parseInt(partes[i]);
      sum += nums[i];
    }

    double media = sum / nums.length;

    for (int n : nums) {
      if (n > media) {
        System.out.print(n + " ");
      }
    }
    System.out.print("\n");
  }
}
