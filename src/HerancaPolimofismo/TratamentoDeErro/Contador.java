package HerancaPolimofismo.TratamentoDeErro;

public class Contador {
    private static Integer num;

    Contador(){
        num++;
    }

    public int atribuir(){
        return num;
    }
}
