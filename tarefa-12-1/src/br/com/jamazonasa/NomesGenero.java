package br.com.jamazonasa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomesGenero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes com o gênero separado por vírgulas, como no exemplo: Maria-F, João-M. ");
        String nomesGeneros = s.nextLine();

        String[] arrayNomesGeneros = nomesGeneros.split(",");

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String par : arrayNomesGeneros) {
            String[] dados = par.split("-");

            if (dados.length == 2) {
                String nome = dados[0].trim();
                String genero = dados[1].trim();

                if (genero.equalsIgnoreCase("F")) {
                    feminino.add(nome);
                } else if (genero.equalsIgnoreCase("M")) {
                    masculino.add(nome);
                } else {
                    System.out.println("Gênero inválido");
                }
            } else {
                System.out.println("Formato Inválido. Escreva novamente.");
            }
        }

        System.out.println("Feminino: " + feminino );
        System.out.println("Masculino: " + masculino );
    }

}
