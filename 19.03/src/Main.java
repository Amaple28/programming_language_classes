import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       //TAREFA02
       //exercicio01();
       //exercicio02();
       exercicio03();


   }


   private static void exercicio01() {
       //mostra os números pares múltiplos de 3 positivos até o número 1000
       //num %3==0
       //int num = 0;
       int qtd = 0;


       //for (int i = 0; i<=1000 ;i++){
           //if(num%2==0 && num%3==0){
       for (int i = 2; i<=1000 ;i+=2){
           if(i%3==0){
               //números pares e múltiplos de 3
               System.out.println(i);
               qtd++;
           }
           //num++;
       }


       System.out.println(qtd+" números no total.");


   }


   private static void exercicio02() {
       //Ler 10 num int, calcular e mostrar a soma e a média de todos
       Scanner sc = new Scanner(System.in);
       int soma=0;
       double media;
       int num;


       for (int i=1; i<=5; i++){
           System.out.println("Informe o "+i+"º número: ");
           num = sc.nextInt();
           soma+=num;
       }
       media=(double) soma/10;
       //lembrar de converter a soma pra double


       System.out.println("A soma dos números infomados é: "+soma);
       System.out.println("A média dos números informados é: "+media);


   }


   private static void exercicio03() {
       //calcular a área de 4 comodos: ler a largura e comprimento
       //de cada comodo, calcular e mostrar a area de cada um


       Scanner scn = new Scanner(System.in);
       double largura;
       double comprimento;
       double area;
       double areaTotal=0.0;


       for (int i=1; i<=4; i++){
           System.out.println("Informe a largura do "+i+"ºcômodo.");
           largura = scn.nextDouble();


           System.out.println("Informe o comprimento do "+i+"ºcômodo.");
           comprimento = scn.nextDouble();


           area = comprimento*largura;


           System.out.println("A área do "+i+"º cômodo é: "+area);
          
           areaTotal+=area;
       }
       System.out.println("A área total do imóvel é: "+areaTotal);
       System.out.println("----------------------------------");
   }


}



