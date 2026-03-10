package TratamentoDeErro;

public class AgendaCheiaExcption extends Exception {
    private Contato contato;

    public AgendaCheiaExcption(Contato con) {
        super();
        contato = con;
    }

    @Override
    public String toString() {
        return "Não há como adicionar o contato " + contato.getNome() +
                " pois a agenda está cheia";
    }
}
