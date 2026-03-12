package TratamentoDeErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestarAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        menu(agenda);
    }

    public static void menu(Agenda agenda){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo a Agenda");
        System.out.println("Digite 1 para consultar um contato ou 2 para adicionar");
        System.out.println("Para sair do Progama digite 3");

        try{
            int valor = leitor.nextInt();
            if(valor == 1){
                consultar(agenda);
                menu(agenda);
            }else if (valor == 2) {
                adicionar(agenda);
                menu(agenda);
            }else if (valor == 3){
                Contato con = null;
                con.getIdentificdor();
                System.exit(0);
            } else {
                System.out.println("Valor inserido inválido, tente novamente");
                System.out.println("");
                menu(agenda);
            }
        }catch (InputMismatchException e){
            System.out.println("Valor inserido inválido, tente novamente");
            System.out.println("");
            menu(agenda);
        }
    }

    public static void adicionar(Agenda agen){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do contato");
        String nome = leitor.next();
        System.out.println("Digite o numero do contato");
        String telefone = leitor.next();

        Contato con = new Contato(nome, telefone);
        try {
            agen.adicionar(con);
        } catch (AgendaCheiaExcption e) {
            System.out.println(e);
        }
    }

    public static void consultar(Agenda agen){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do contato");
        String nome = leitor.next();;

        try {
            agen.consultar(nome);
        } catch (ContaNaoExistenteExcption e) {
            System.out.println(e);
        }
    }

}