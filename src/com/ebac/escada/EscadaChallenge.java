package com.ebac.escada;

import java.util.Scanner;

public class EscadaChallenge {
    public EscadaChallenge() {
        int n = baseProUsuario();
        if(n < 1) {
            System.out.println("Número de degraus inválido!");
            return;
        }
        System.out.println();
        System.out.println("Existem " + subirEscadas(n) + " maneiras de subir a sua escada!");

    }

    private int baseProUsuario(){

            System.out.println("Bem-Vindo ao programa para descobrir quantas maneiras tem de subir a escada que você vai selecionar o tamanho!");

            Scanner sc = new Scanner(System.in);
            System.out.println("Pra começar, quantos degraus tem sua escada?");
            int n = sc.nextInt();
            return n;

    }

    private int subirEscadas(int n) {
        if (n == 1 || n == 2)
            return n;

        return subirEscadas(n - 1) + subirEscadas(n - 2);
    }

}
