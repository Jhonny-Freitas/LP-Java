package com.JhonnyMiguelDeFreitas.Provas.P1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {

        Scanner leia = new Scanner ( System.in );

        int termos = 0, // Quantidade de termos da sequencia
                a = 2,      // Parte de cima da fracao. Sequencia de pares
                b = 1;      // Parte de baixo da fracao. Sequencia de impares

        double soma = 0.0; // Acumulador da soma das fracoes

        do {

            System.out.print("Entre com a quantidade de termos da sequencia: ");
            termos = leia.nextInt();

            if ( termos < 0 ) {

                System.out.println("\n\tQuantidade invalida!\n");

            } else {

                if ( termos == 0 ) {

                    System.out.println("\n\tFim do programa!\n");

                } else {

                    // Inicia as variaveis com seus valores padrao

                    a = 2;
                    b = 1;

                    soma = 0.0;

                    // Laco para gerar a quantidade de termos da sequencia

                    for ( int i = 1 ; i <= termos ; i++ ) {

                        // Se o termo eh impar

                        if ( i % 2 != 0 ) {

                            // Fracao positiva

                            System.out.print( " + " + a + "/" + b );

                            soma += (double) a / b;

                        } else {

                            // Fracao negativa

                            System.out.print( " - " + a + "/" + b );

                            soma -= (double) a / b;
                        }

                        // Gera o proximo valor da sequencia

                        a += 2;
                        b += 2;
                    }

                    // Imprime a soma ao final da sequancia

                    System.out.println(" =  " + soma + "\n");
                }
            }

        } while ( termos != 0 );
    }
}
