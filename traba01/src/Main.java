import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        menu(); 
    }
    
    //MENU PRINCIPAL
    public static void menu() {
        Scanner scanner = new Scanner(System.in); 
        
        // enquanto a opção for diferente de 0 o programa continua
        int opcao = 0;
        do {
            // Crie um menu para a loteria 
            System.out.println("******************************");
            System.out.println("******* MENU LOTOFÁCIL *******");
            System.out.println("******************************");
            System.out.println("1 - Apostar de 0 a 100");
            System.out.println("2 - Apostar de A a Z");
            System.out.println("3 - Apostar em PAR ou ÍMPAR");
            System.out.println("0 - Sair");
            System.out.println("******************************");

            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            // switch case da opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("******************************");
                    System.out.println("***** APOSTAR DE 0 A 100 *****");
                    System.out.println("******************************");
                    apostarDe0a100();
                    break;
                case 2:
                    System.out.println("******************************");
                    System.out.println("****** APOSTAR DE A A Z ******");
                    System.out.println("******************************");
                    apostarDeAaZ();
                    break;
                case 3:
                    System.out.println("******************************");
                    System.out.println("** APOSTAR EM PAR OU ÍMPAR ***");
                    System.out.println("******************************");
                    apostarParouImpar();
                    break;
                case 0:
                    System.out.println("******************************");
                    System.out.println("SAINDO...");
                    break;
                default: 
                    System.out.println("******************************");
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcao != 0);
    }

    //APOSTAS
    public static void apostarDe0a100(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 100: ");

        int numero = scanner.nextInt();
        if (numero >= 0 && numero <= 100) {
            System.out.println("******************************");
            System.out.println("Aposta realizada, aguarde o sorteio!"); 

            sorteioDe0a100(numero);
        } else {
            System.out.println("Aposta inválida!");
        }
    }

    public static void apostarDeAaZ() {
        char letraPremiada = 'M';
        boolean letraValida = false;

        System.out.println("Digite uma letra entre A e Z: ");

        while (!letraValida) {
            try {
                char letra = (char) System.in.read();
                if(Character.isLetter(letra)){
                    letra = Character.toUpperCase(letra);
                    sorteioSleep();
                    
                    if(letra == letraPremiada){
                        System.out.println("PARABÉNS, você ganhou R$ 500,00!");
                        System.out.println("A letra sorteada foi: " + letraPremiada + " e você apostou em: " + letra);
                    }else{
                        System.out.println("QUE PENA! A letra sorteada foi: " + letraPremiada + " e você apostou em: " + letra);
                    }
                    System.out.println("******************************");
                    // Define como verdadeiro apenas após verificar e processar a entrada válida.
                    letraValida = true; 
                }else{
                    System.out.println("Aposta inválida! Por favor, digite uma letra entre A e Z.");
                    System.in.skip(System.in.available());
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler a letra!");
            }
        } 
    }

    public static void apostarParouImpar(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Loop para garantir que o usuário insira um número inteiro
        while (true) {
            System.out.println("Digite um número inteiro: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            }
        }

        sorteioSleep();
        if (numero % 2 == 0) {
            System.out.println("PARABÉNS, você ganhou R$ 100,00!"); 
        } else {
            System.out.println("QUE PENA! O número digitado é ímpar e a premiação foi para números pares.");
        } 
    }

    //SORTEIOS
    public static void sorteioSleep(){
        System.out.println("******************************");
        System.out.println("Aposta realizada, aguarde o sorteio!"); 
        System.out.println("Sorteio sendo realizado...");
        System.out.println("******************************");
        // esperar 3 segundos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sorteioDe0a100(int numeroApostado){
        sorteioSleep();

        int numeroSorteado = (int) (Math.random() * 101); 

        if (numeroApostado == numeroSorteado) {
            System.out.println("PARABÉNS, você ganhou R$ 1.000,00!");
        } else {
            System.out.println("QUE PENA! O número sorteado foi " + numeroSorteado + " e você apostou em " + numeroApostado);
        }
        System.out.println("******************************");
    } 
}