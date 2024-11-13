package br.com.jamazonasa;

import java.util.Arrays;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por virgulas: ");
        String nomes = s.nextLine();

        String [] nomesLista = nomes.split(",");

        Arrays.sort(nomesLista);

        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomesLista) {
            System.out.println(nome);
        }

    }
}
