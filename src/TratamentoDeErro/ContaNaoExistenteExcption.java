package TratamentoDeErro;

public class ContaNaoExistenteExcption extends Exception {
    private Integer IdentificadorInexistente;

    ContaNaoExistenteExcption(int IdenIne){
        super();
        IdentificadorInexistente = IdenIne;
    }

    @Override
    public String toString() {
        return "Este contato não existe: " +
               IdentificadorInexistente;
    }
}
