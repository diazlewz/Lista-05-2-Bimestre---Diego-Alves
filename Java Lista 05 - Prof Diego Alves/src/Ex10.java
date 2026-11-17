import java.util.Scanner;
public class Ex10 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número (1 a 30): ");
        int n = sc.nextInt();

        if (n < 1 || n > 30) {
            System.out.println("Quantidade inválida. Repita o processo.");
            return;
        }

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = fibonacci(i);
        }

        exibir(v);
        System.out.println("Soma: " + somar(v));
    }
}

