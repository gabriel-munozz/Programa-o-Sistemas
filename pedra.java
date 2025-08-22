import java.util.Scanner;
import java.util.Random;

public class pedra {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();

        int computador = r.nextInt(3) + 1;
        System.out.println("Vamos jogar! Escolha entre pedra, papel e tesoura:");
        System.out.println("1.Pedra");
        System.out.println("2.Papel");
        System.out.println("3.Tesoura");
        System.out.print("Digite o número que você quer: ");
        int usuario = entrada.nextInt();
        System.out.printf("Computador: %d\n", computador);

        if (usuario == 1 && computador == 3) {
            System.out.println("Usuário Venceu!");
        }
        else if (usuario == 3 && computador == 2) {
            System.out.println("Usuário Venceu!");
        }
        else if (usuario == 2 && computador == 1) {
            System.out.println("Usuário Venceu!");
        }
        else if (usuario == computador) {
            System.out.println("Empate!");
        }
        else {
            System.out.println("Computador Venceu!");
        }
    }
}