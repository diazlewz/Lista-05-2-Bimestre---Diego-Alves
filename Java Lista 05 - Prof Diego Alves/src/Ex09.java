import java.util.Scanner;
public class Ex09 {

    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int expoente;
        do {
            System.out.print("Expoente (NÃO NEGATIVO): ");
            expoente = sc.nextInt();
        } while (expoente < 0);

        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            System.out.print("Base " + (i + 1) + ": ");
            bases[i] = sc.nextInt();
        }

        exibirPotencias(bases, expoente);
    }
}

