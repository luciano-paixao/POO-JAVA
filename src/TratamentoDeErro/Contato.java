package TratamentoDeErro;

public class Contato {
    private String nome;
    private Integer telefone;
    private Integer Identificdor;
    private Contador contador;

    public Contato(String nome, Integer telefone) {
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

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
