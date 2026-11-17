import java.util.Scanner;
public class Ex04 {

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("Antes de ordenar:");
        exibir(v);
        System.out.println("Ordenou? " + estaOrdenado(v));

        ordenar(v);

        System.out.println("Após ordenar:");
        exibir(v);
        System.out.println("Ordenou? " + estaOrdenado(v));
    }
}

