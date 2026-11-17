import java.util.Scanner;
public class Ex05 {

    public static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";
        while (n > 0) {
            binario = (n % 2) + binario;
            n = n / 2;
        }
        return binario;
    }
    public static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        for (int i = 0; i < v.length; i++) {
            do {
                System.out.print("Número " + (i + 1) + " (NÃO NEGATIVO): ");
                v[i] = sc.nextInt();
            } while (v[i] < 0);
        }

        exibirTabela(v);
    }
}

