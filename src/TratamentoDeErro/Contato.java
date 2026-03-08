package TratamentoDeErro;

public class Contato {
    private String nome;
    private String telefone;
    private Integer Identificdor;
    private Contador contador;

    public Contato(String nome, String telefone) {
        Identificdor = this.contador.atribuir();
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getIdentificdor() {
        return Identificdor;
    }

    public void setIdentificdor(int identificdor) {
        Identificdor = identificdor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato: \n" + this.nome + "\n Numero: " + this.telefone ;
    }
}
