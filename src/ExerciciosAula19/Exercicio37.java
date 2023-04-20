package ExerciciosAula19;

public class Exercicio37 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];

        // preenche o vetor "a" com valores de 1 a 15
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // calcula o fatorial de cada elemento em "a" e armazena em "b"
        for (int i = 0; i < b.length; i++) {
            b[i] = fatorial(a[i]);
        }

        // imprime os valores de "a" e "b"
        System.out.println("Vetor a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nVetor b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    // método para calcular o fatorial de um número inteiro
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
