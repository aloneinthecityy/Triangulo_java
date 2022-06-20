/*Faça um programa em Java, chamado “Main05.java” que:
- leia 3 valores inteiros nas variáveis “lado1”, “lado2” e “lado3”,
respectivamente, no intervalo [1-100].
- Troque os valores entre as variáveis para garantir que o “lado1” fique com o
maior valor lido.
- Verifique se o “lado1” é maior do que “lado2” + “lado3”.
- Se condição for verdadeira, exibir mensagem “Não formam um triangulo - tente
novamente!\n” e voltar a ler ao início para ler as variáveis novamente.
- Se condição for falsa, exibir mensagem “Formam um triangulo - OK!\n” e terminar o
programa. */

import java.util.Scanner; 

public class Main05 {
    
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3, soma;
        System.out.printf("Informe a medida do primeiro lado do triângulo (valor inteiro): ");
        lado1 = ler.nextInt();
        System.out.printf("a medida do segundo lado:");
        lado2 = ler.nextInt();
        System.out.printf("a medida do terceiro lado: ");
        lado3 = ler.nextInt();
        
        soma = lado2 + lado3;
        
        if(lado1 > 100 || lado1 < 0){
             System.out.printf("Apenas valores entre 0 e 100 são aceitos. Digite o valor do lado1 novamente: ");
             lado1 = ler.nextInt();
        } if(lado2 > 100 || lado2 < 0){
             System.out.printf("Apenas valores entre 0 e 100 são aceitos. Digite o valor do lado2 novamente: ");
             lado2 = ler.nextInt();
        }
         if(lado3 > 100 || lado3 < 0){
             System.out.printf("Apenas valores entre 0 e 100 são aceitos. Digite o valor do lado3 novamente: ");
             lado3 = ler.nextInt();
        }
        
        if(lado1 < lado2 || lado1<lado3){
                lado1 = lado1 ^ lado2;
                lado2 = lado1 ^ lado2;
                lado1 = lado1 ^ lado2;
                lado1 = lado1 ^ lado3;
                lado3 = lado1 ^ lado3;
                lado1 = lado1 ^ lado3;
                
            // agora lado1 deve valer o valor de lado2
            // lado2 deve valer o valor de lado1
            // lado1 deve valer o valor de lado3
            // lado3 deve valer o valor de lado1
        }
    
        if(lado1 > soma){
             System.out.printf("Os lados não formam um triângulo, tente novamente!");
        }
        else{
            System.out.printf("Os lados formam um triângulo - OK!\n");
            }
            
            System.out.printf("O valor de 'lado1' foi trocado para o maior valor recebido, portanto, 'lado1' vale %d agora", lado1);
    }
}
