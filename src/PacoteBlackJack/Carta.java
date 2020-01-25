package PacoteBlackJack;
public class Carta {
    private String numero, naipe;
    private int valor;
    public void setnumero(String numero){
        this.numero = numero;
    }
    public String getnumero(){
        return numero;
    }
    public void setnaipe(String naipe){
        this.naipe = naipe;
    }
    public String getnaipe(){
        return naipe;
    }
    public void setvalor(int valor){
        this.valor = valor;
    }
    public int getvalor(){
        return valor;
    }
    Carta(){
        this.numero = "0";
        this.naipe = "fake";
        this.valor = 0;
    }
    Carta(String numero,String naipe,int valor){
        this.numero = numero;
        this.naipe = naipe;
        this.valor = valor;
    }
}
