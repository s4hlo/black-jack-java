package PacoteBlackJack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Jogador extends Pessoa {
    private String nome, email;
    private List<Carta> cartasSacadas = new ArrayList<Carta>();
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return email;
    }
    Jogador(String datadenascimento, String cordolhos, String nomepai, String nomemae, String cpf, String estadocivil, String nacionalidade,String nome, String email){
        super(datadenascimento, cordolhos, nomepai, nomemae,cpf, estadocivil, nacionalidade);
        this.nome = nome;
        this.email = email;
    }
    protected void imprimeDadosJogador(){
        System.out.print(getnome() + getemail() + getdatadenascimento() + getcordolhos() + getnomepai() + getnomemae() + getcpf() + getestadocivil() + getnacionalidade());
    }
    protected int getPontos(){
        int soma = 0;
        for (int i = 0;i < cartasSacadas.size() ; i++ ) {
            soma = soma + cartasSacadas.get(i).getvalor();
        }
        return soma;
    }
    public void adicionarCartaSacada(Carta c){
        cartasSacadas.add(c);
    }
    //off
    public  void mensagemVitoria(){
        System.out.print("Venci!O outro jogador é muito noob!");
    }

}
