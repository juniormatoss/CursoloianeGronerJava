package ExerciciosAula15;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o produto 1");
        String produtoum = scan.next();
        System.out.println("Digite o valor do produto 1");
        double valorProdutoum = scan.nextDouble();
        System.out.println("Digite o produto 2");
        String produtodois = scan.next();
        System.out.println("Digite o valor do produto 2");
        double valorProdutodois = scan.nextDouble();
        System.out.println("Digite o produto 3");
        String produtotrez = scan.next();
        System.out.println("Digite o valor do produto 3");
        double valorProdutotrez = scan.nextDouble();
        String produtoMaisBarato = produtoum;
        double valorMaisBarato = valorProdutoum;
        if(valorProdutodois < valorMaisBarato){
            produtoMaisBarato = produtodois;
            valorMaisBarato = valorProdutodois;
        }
        if((valorProdutotrez < valorProdutodois) && (valorProdutotrez < valorProdutoum)){
            produtoMaisBarato = produtotrez;
            valorMaisBarato = valorProdutotrez;
        }
        System.out.println(produtoMaisBarato);
        System.out.println(valorMaisBarato);

    }

}
