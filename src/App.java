import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] tabuada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual valor deseja multiplicar?");
        int valor = myObj.nextInt();

        System.out.println("Tabela de multiplicação de " + valor);
        for (int i = 0; i < tabuada.length; i++) {
            System.out.println(valor * tabuada[i]);
        }
    }
}
