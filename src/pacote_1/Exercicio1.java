//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
/*
 * Este código basicamente lê um número inteiro do usuário e 
 * verifica se ele é negativo ou não. 
 * Se o número for negativo, o programa imprime "NEGATIVO"; 
 * caso contrário, imprime "NAO NEGATIVO".
 */


// Importa a classe Scanner do pacote java.util para ler entradas do usuário
package pacote_1;



import java.util.Scanner;

// Define a classe principal do programa
public class Exercicio1 {

    // Método principal que será executado quando o programa for iniciado
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Informe um numero para verificar se é negativo ou não \n");
        // Lê um número inteiro fornecido pelo usuário e armazena na variável N
        int N = sc.nextInt();
        
        // Verifica se o número é menor que zero (negativo)
        if (N < 0) {
            // Se verdadeiro, imprime "NEGATIVO"
            System.out.println("NEGATIVO");
        }
        else {
            // Se falso (ou seja, N é zero ou positivo), imprime "NAO NEGATIVO"
            System.out.println("NAO NEGATIVO");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        sc.close();
    }

}
