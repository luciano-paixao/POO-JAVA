package HerancaPolimofismo.TratamentoDeErro;

public class Agenda {

    private Contato [] fichario = new Contato[5];

    public void adicionar(Contato con){
        fichario [con.getIdentificdor()] = con;
    }

    public void consultar(int iden){
        try {
            for (int i = 0; i < fichario.length; i++){

                if(iden > fichario.length){
                    throw new ContaNaoExistenteExcption(iden);
                }

                if(fichario[i].getIdentificdor() == iden){
                    System.out.println(fichario[i].getNome() + "/" + fichario[i].getTelefone());
                }
            }
        }
        catch (ContaNaoExistenteExcption ex){
            System.out.println(ex);
        }

    }


}
