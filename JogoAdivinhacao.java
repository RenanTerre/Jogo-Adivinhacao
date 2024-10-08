import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numeroComputador = random.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 5;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Você tem " + maxTentativas + " tentativas para adivinhar o número entre 1 e 100.");

        while (tentativas < maxTentativas) {
            tentativas++;
            System.out.print("Tentativa " + tentativas + ": Digite seu palpite: ");
            int palpite = ler.nextInt();

            if (palpite == numeroComputador) {
                acertou = true;
                break;
            } else if (palpite < numeroComputador) {
                System.out.println("O número é maior que " + palpite);
            } else {
                System.out.println("O número é menor que " + palpite);
            }
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou o número " + numeroComputador + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Suas tentativas acabaram. O número era " + numeroComputador + ".");
        }

    }
}

