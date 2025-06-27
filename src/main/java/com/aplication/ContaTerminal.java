package com.aplication;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Digite sua AGÊNCIA: ");
        int agencia = 0;
        while(true) {
            if (sc.hasNextInt()) {
                agencia = sc.nextInt();
                break;
            } else {
                System.out.println("Digite apenas números: ");
                sc.next();
            }
        }
        System.out.println("Digite número da CONTA: ");
        int conta = 0;
        while(true) {
            if (sc.hasNextInt()) {
                conta = sc.nextInt();
                break;
            } else {
                System.out.println("Digite apenas números: ");
                sc.next();
            }
        }
        System.out.println("Digite o nome do titular: ");
        String titular = sc.next();
        Double saldo = 237.48;

        System.out.println("=====================");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %s e seu saldo %s" +
                " já está disponível para saque", titular, agencia, conta, saldo);
    }
    }
