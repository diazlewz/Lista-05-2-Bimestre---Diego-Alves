import java.util.Scanner;
public class Ex06 {

    public static int contarVogais(String texto) {
        String vogais = "aeiouáàâãéêíóôõú";
        String minusculo = texto.toLowerCase();
        int contador = 0;

        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void exibirContagem(String[] frases) {
        int maior = -1;
        String fraseMaior = "";

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println("Frase " + (i + 1) + ": \"" + frases[i] + "\" -> " + qtd + " vogais");

            if (qtd > maior) {
                maior = qtd;
                fraseMaior = frases[i];
            }
        }

        System.out.println("Frase com mais vogais: \"" + fraseMaior + "\" (" + maior + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }
        exibirContagem(frases);
    }
}

