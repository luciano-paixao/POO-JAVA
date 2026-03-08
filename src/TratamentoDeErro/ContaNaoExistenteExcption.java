package TratamentoDeErro;

public class ContaNaoExistenteExcption extends Exception {
    private String conatoNaoExistente;

    ContaNaoExistenteExcption(String nome){
        super();
        conatoNaoExistente = nome;
    }

    @Override
    public String toString() {
        return "Este contato não existe: " +
                conatoNaoExistente;
    }
}
