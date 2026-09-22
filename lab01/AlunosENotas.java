import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Elton Nascimento - 20260016289
 */

public class AlunosENotas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] aluno = { "" };
    List<Integer> notas = new ArrayList<>();
    int sum = 0;

    while (true) {
      aluno = sc.nextLine().split(" ");
      if (aluno[0].equals("-"))
        break;
      int notaAluno = Integer.parseInt(aluno[1]);
      sum += notaAluno;
      notas.add(notaAluno);
    }
    sc.close();

    int maior = notas.get(0);
    int menor = notas.get(0);
    int media = sum / notas.size();
    int acima = 0;
    int abaixo = 0;
    for (Integer nota : notas) {
      if (nota > maior) {
        maior = nota;
      }
      if (nota < menor) {
        menor = nota;
      }
      if (nota >= 700) {
        acima++;
      } else {
        abaixo++;
      }
    }

    System.out.println("maior: " + maior);
    System.out.println("menor: " + menor);
    System.out.println("media: " + media);
    System.out.println("acima: " + acima);
    System.out.println("abaixo: " + abaixo);
  }
}
