package resolucionsudoku;

public class Booleano {
    private Boolean valor;

    Booleano(Boolean v){
        this.valor=v;
    }

    Booleano(){}

    public void setValor(Boolean v){
        this.valor=v;
    }

    public Boolean getValor(){
        return this.valor;
    }
}
