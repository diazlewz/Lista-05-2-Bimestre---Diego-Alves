import java.util.Scanner;
public class Ex03 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int contarPrimos(int[] v) {
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                contador++;
            }
        }
        return contador;
    }
    public static void exibirPrimos(int[] v) {
        System.out.println("Primos no array:");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        exibirPrimos(v);
        System.out.println("Quantia de primos: " + contarPrimos(v));
    }
}

