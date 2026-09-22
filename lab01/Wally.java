import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

public class Wally {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nomes = { "" };
    List<String> possible = new ArrayList<>();

    while (!nomes[0].equals("wally")) {
      nomes = sc.nextLine().split(" ");
      String toPrint = null;

      for (String nome : nomes) {
        if (nome.length() == 5) {
          toPrint = nome;
        }
      }
      if (toPrint == null) {
        toPrint = "?";
      }

      possible.add(toPrint);
    }

    possible.remove(possible.size() - 1);

    for (String nome : possible) {
      System.out.println(nome);
    }
    sc.close();
  }
}
