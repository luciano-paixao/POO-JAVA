package TratamentoDeErro;

import java.util.Scanner;

public class TestarAgenda {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo a Agenda");
        System.out.println("Digite 1 para consultar um contato ou 2 para adicionar");
        int valor = leitor.nextInt();

        Agenda agenda = new Agenda();

        if(valor == 1){

        }else if (valor == 2) {
            adicionar(agenda);
        }else {
            System.out.println("Valor inserido inválido");
        }
    }

    public static void adicionar(Agenda agen){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do conatato");
        String nome = leitor.next();
        System.out.println("Digite o numero do contato");
        String telefone = leitor.next();

        Contato con = new Contato(nome, telefone);
        try {
            agen.adicionar(con);
        } catch (AgendaCheiaExcption e) {
            throw new RuntimeException(e);
        }
    }

    public static void consultar(Agenda agen){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do contato");
        String nome = leitor.next();;

        try {
            agen.consultar(nome);
        } catch (ContaNaoExistenteExcption e) {
            throw new RuntimeException(e);
        }
    }

}