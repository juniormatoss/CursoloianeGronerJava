package ExerciciosAula20;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] ags) {
        String compromissos[][][] = new String[12][31][24];

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        boolean diavalido = false;
        boolean horavalida = false;
        boolean mesvalido = false;

        int opcao;
        int dia = 0;
        int hora = 0;
        int mes = 0;
        while (sair == false) {
            diavalido = false;
            horavalida = false;
            mesvalido = false;
            System.out.println("Digite 1 para cadastrar");
            System.out.println("Digite 2 para consultar");
            System.out.println("Digite 3 para sair");
            opcao = scan.nextInt();
            if (opcao == 1) {// Adicionar compromisso
                System.out.println("Digite o mes");
                while (mesvalido == false) {
                    mes = scan.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        mesvalido = true;
                    } else {
                        System.out.println("Mes inválido, digite novamente");
                    }
                }
                System.out.println("Digite o dia do mes");
                while (diavalido == false) {
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diavalido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                System.out.println("Digite a hora do compromisso");
                while (horavalida == false) {
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horavalida = true;
                    } else {
                        System.out.println("hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso");

                compromissos[dia][hora][mes] = scan.next();
                System.out.println("CadasTrado Com Sucesso");
            } else if (opcao == 2) {// Consultar Compromisso
                System.out.println("Digite o mes");
                while (mesvalido == false) {
                    mes = scan.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        mesvalido = true;
                    } else {
                        System.out.println("Mes inválido, digite novamente");
                    }
                }
                System.out.println("Digite o dia do mes");
                while (diavalido == false) {
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diavalido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                while (horavalida == false) {
                    System.out.println("Digite a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && dia <= 24) {
                        horavalida = true;
                    } else {
                        System.out.println("hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é ");
                System.out.println(compromissos[dia][hora][mes] = scan.next());

            } else if (opcao == 3) {// Sair
                sair = true;
            } else {
                System.out.println("Opção Inválida");
            }

        }

    }
}
