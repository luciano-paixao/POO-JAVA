package TratamentoDeErro;

import java.util.Scanner;

public class Agenda {

    private Contato [] fichario = new Contato[5];

    public void adicionar(Contato con) throws AgendaCheiaExcption{

        if (con.getIdentificdor() > fichario.length){
            throw new AgendaCheiaExcption(con);
        }else{
            fichario [con.getIdentificdor() - 1] = con;
        }
    }

    public void consultar(String nome) throws ContaNaoExistenteExcption{

        boolean naoEncrontado = false;

        for (int i = 0; i <= fichario.length; i++){
            if (nome.equals(fichario[i].getNome())){
                System.out.println(fichario[i]);
                break;
            }else {
                naoEncrontado = true;
            }
        }
        if (naoEncrontado){
            throw new ContaNaoExistenteExcption(nome);
        }
    }

    public Contato[] getFichario() {
        return fichario;
    }
}
