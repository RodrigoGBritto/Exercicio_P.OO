package funcoes.aplicacao;

import funcoes.entidades.Exercicio00;

import java.util.Scanner;

public class
App {

    static void main() {
        Exercicio00 exemplo = new Exercicio00();
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------Sejam bem vindos ao Nosso Curso de POO----------:");
        System.out.println("Qual Função você deseja executar?");
        System.out.println("01 -- 02 -- 03 -- 04 -- 125 -- 127 -- 128 -- 129 --130?");
        int escolha;
        escolha = entrada.nextInt();
        switch (escolha) {
            case 01:
                System.out.println("Aló Mundo! ");
                exemplo.aloMundo();
                break;

            case 02:
                System.out.println("Digite um numero inteiro:");
                int numero = entrada.nextInt();
                exemplo.mostrarNumeroInteiro(numero);
                break;

            case 03:
                System.out.println("Digite um numero real:");
                float numeroReal = entrada.nextFloat();
                exemplo.mostrarNumeroReal(numeroReal);
                break;

            case 04:
                System.out.println("Digite um nome:");
                String nome = entrada.next();
                exemplo.mostrarNome(nome);
                break;

            case 125:
                System.out.println("Voce Escolheu a Funcao maior de dois numeros!!!");
                System.out.println("Entre com primeiro valor:");
                float n1 = entrada.nextFloat();
                float n2 = entrada.nextFloat();
                System.out.println("O maior valor eh: " + exemplo.maiorDeDois(n1, n2));
                break;

            case 127:
                System.out.println("Voce Escolher a Funcao para converter Temperaturas!!!");
                System.out.println("Entre com o valor da temperatura em Fahrenheit:");
                double F = entrada.nextDouble();
                System.out.println("O valor em Celsius e: " + exemplo.fahrenheitParaCelsius(F));
                break;

            case 128:
                System.out.println("Voce Escolher a Funcao para calcular o volume de um cilindro!!!");
// código
                break;

            case 129:
                System.out.println("Voce Escolher a Funcao para calcular o volume de uma esfera!!!");
// código
                break;
            case 130:
// código
                System.out.println("Voce Escolher a Funcao para calcular Calcule e retorne o IM (Índice de Massa Corporal!!!");
                break;
            default:
                System.out.println("Digite uma escolha valida");
                System.out.println("01 -- 02 -- 03 -- 04 -- 125 -- 127 -- 128 -- 129 --130?");
        }

    }
}