package com.JhonnyMiguelDeFreitas.Provas.P1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        int secreto = 1,
            numero = 1,
            tentativa = 1;

        String resposta = "";

        do {

            // Inicia com a primeira tentativa

            tentativa = 1;

            // Gera o numero secreto de 1 ate 10 de forma aleatoria

            secreto = (int)(Math.random() * 10) + 1;

            System.out.println("Numero secreto: " + secreto );

            do {

                // Valida a entrada do usuario limitando a valores de 1 ate 10

                do {

                    System.out.print("Adivinhe o numero secreto: " );
                    numero = leia.nextInt();

                    if ( numero < 1 || numero > 10 ) {

                        System.out.println("\n\tNumero invalido!\n\tEntre com um valor de 1 ate 10.\n");
                    }

                } while ( numero < 1 || numero > 10 );

                // Testa se o usuario acertou seu "chute"

                if ( numero == secreto ) {

                    System.out.println("\n\tParabens! Voce acertou na " + tentativa + "a tentativa!\n");

                } else {

                    System.out.println("\n\tErro, tentativa " + tentativa + " de 3\n");

                    tentativa++;

                    if ( tentativa > 3 ) {

                        System.out.println("\n\tAcabaram as tentativas! Voce perdeu!\n");

                    }
                }

                // Repete enquanto nao acertou e ainda ha tentativas

            } while ( numero != secreto && tentativa <= 3 );

            // Verifica se o usuario quer jogar novamente

            System.out.print("Jogar novamente [S/N]: ");
            resposta = leiaStr.nextLine();

        } while ( resposta.equalsIgnoreCase("s") );
    }
}
