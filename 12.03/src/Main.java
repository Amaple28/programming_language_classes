import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIOS LOOPS");
        exercicio1();
        exercicio2();
        exercicio3();
    }
    private static void exercicio1() {
        Scanner scn = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int numero = -1;

        System.out.println("Exercício 1");
        while (numero != 0) {
            System.out.println("Digite um número: ");
            numero = scn.nextInt();

            if(numero != 0) {
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }

        System.out.println("Números pares: "+par);
        System.out.println(" | Números ímpares: "+impar);
    }

    private static void exercicio2() {
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        int numero = 0;
        int qtdnum = 1;

        System.out.println("Exercício 2");
        while(numero != -1){
            System.out.println("Digite o "+qtdnum+"º número: ");
            numero = scn.nextInt();

            if(numero != -1) {
                qtdnum++;
                soma += numero;
            }else {
                qtdnum--;
            }
        }

        System.out.println("A soma dos números é: "+soma);
        System.out.println("A quantidade de números informados foi: "+qtdnum);
    }

    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        float soma = 0;
        float media;
        float nota;

        for (int x = 1; x<=3; x++){
            System.out.println("Digite a "+x+"º nota:");
            nota = scn.nextFloat();
            soma+=nota;
        }
        media = soma/3;
        System.out.println("A soma das notas foi: "+soma);
        System.out.println("A média das 3 notas é: "+media);
    }
}