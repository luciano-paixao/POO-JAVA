package TratamentoDeErro;

import java.util.Scanner;

public class Agenda {

    private Contato [] fichario = new Contato[5];

    public void adicionar(Contato con) throws AgendaCheiaExcption{

        if (con.getIdentificdor() > fichario.length){
            throw new AgendaCheiaExcption(con);
        }else{
            fichario [con.getIdentificdor()] = con;
        }


    }

    public void consultar(int iden){
        try {
            for (int i = 0; i < fichario.length; i++){

                if(iden > fichario.length){
                    throw new ContaNaoExistenteExcption(iden);
                }

                if(fichario[i].getIdentificdor() == iden){
                    System.out.println(fichario[i].getNome() + "/" + fichario[i].getTelefone());

//                    if (contatos != null) {
//                        for (RelacionamentoEntreClasses.exemplo1.Contato c : contatos) {
//                            if((c.getNome().equals(nome))){
//                                info += c.obterInfo() + "\n";
//                            }
//                        }
//                    }

                }
            }
        }
        catch (ContaNaoExistenteExcption ex){
            System.out.println(ex);
        }

    }


}
