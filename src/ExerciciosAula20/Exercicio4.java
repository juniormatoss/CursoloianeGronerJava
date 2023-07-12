package ExerciciosAula20;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] ags){
        String compromissos[] [] = new String [31][24];

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        boolean diavalido = false ; 
        boolean horavalida = false ;

        int opcao;
        int dia = 0;
        int hora = 0;
        while (sair == false){
           System.out.println("Digite 1 para cadastrar"); 
           System.out.println("Digite 2 para consultar"); ; 
           System.out.println("Digite 3 para sair");
           opcao = scan.nextInt();
            diavalido = false;
            horavalida = false ;
           if(opcao == 1){//Adicionar compromisso
            System.out.println("Digite o dia do mes");
                while( diavalido == false){
                    dia = scan.nextInt();
                    if(dia > 0 && dia <= 31){
                        diavalido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                System.out.println("Digite a hora do compromisso");
                while( horavalida == false){
                     hora = scan.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horavalida = true;
                    }
                    else{
                        System.out.println("hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso");
                System.out.println("");
                compromissos [dia] [hora] = scan.next();
                System.out.println("");
                System.out.println("CadasTrado Com Sucesso");
                System.out.println("");
           }
           else if(opcao == 2){//Consultar Compromisso
            while( diavalido == false){
                System.out.println("Digite o dia do mes");
                dia = scan.nextInt();
                if(dia > 0 && dia <= 31){
                    diavalido = true;
                }
                else{
                    System.out.println("Dia inválido, digite novamente");
                }
            }
            while( horavalida == false){
                System.out.println("Digite a hora do compromisso");
                 hora = scan.nextInt();
                if(hora >= 0 && dia <= 24){
                    horavalida = true;
                }
                else{
                    System.out.println("hora inválida, digite novamente");
                }
            }
            dia--;
            System.out.println("O compromisso agendado é ");
            System.out.println(compromissos [dia] [hora] = scan.next());
            
           }
           else if (opcao == 3){//Sair
            sair = true; 
           }
           else{
            System.out.println("Opção Inválida");
           }

        }

    }
}
