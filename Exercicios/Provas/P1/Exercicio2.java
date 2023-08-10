package com.JhonnyMiguelDeFreitas.Provas.P1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {

        Scanner leia = new Scanner ( System.in );

        int termos = 0,    // Quantidade de termos da sequencia
                a = 0,         // Primeiro termo de fibonacci
                b = 1,         // Segundo termo de fibonacci
                c = 1,         // Terceiro termo de fibonacci
                contador = 0;  // Conta divisores exatos para primo

        String saida = ""; // Acumula o inverso da sequencia

        do {

            System.out.print("Entre com a quantidade de termos da sequencia: ");
            termos = leia.nextInt();

            if ( termos < 0 ) {

                System.out.println("\n\tQuantidade invalida!\n");

            } else {

                if ( termos == 0 ) {

                    System.out.println("\n\tFim do programa!\n");

                } else {

                    // Inicializa as variaveis com seus valores padrao

                    saida = "";

                    a = 0;
                    b = 1;
                    c = a + b;

                    // Laco para gerar a quantidade de termos solicitada

                    for ( int i = 1 ; i <= termos ;    ) {

                        // Zera o contador de divisores para o primo

                        contador = 0;

                        // Laco para contar a quantidade de divisores exatos
                        // do termo de Fibonacci para verificar se eh primo, tb.

                        for ( int j = 1 ; j <= a ; j++ ) {

                            // Testa se o termo Fibonacci

                            if ( a % j == 0 ) {

                                contador++;
                            }
                        }

                        // Se contar apenas 2 divisores exatos, o termo eh primo

                        if ( contador == 2 ) {

                            saida = a + " " + saida; // Onde a "magica" da inversao acontece!!!
                            i++;  // Se o termo de Fibonacci for primo, vai para o proximo
                        }

                        // Faz a movimentacao dos valores das variaveis para gerar
                        // o proximo termo de Fibonacci

                        a = b;
                        b = c;
                        c = a + b;
                    }

                    // Imprime a saida da sequencia ja invertida

                    System.out.println("\n\tSaida: " + saida + "\n");
                }
            }

            // Executa enquanto nao for digitado 0 para o termos

        } while ( termos != 0 );
    }
}
