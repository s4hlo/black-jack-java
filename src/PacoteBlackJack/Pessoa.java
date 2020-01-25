package PacoteBlackJack;
public class Pessoa extends Humano {
    private String cpf, estadocivil, nacionalidade;
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getcpf(){
        return cpf;
    }
    public void setestadocivil(String estadocivil){
        this.estadocivil = estadocivil;
    }
    public String getestadocivil(){
        return estadocivil;
    }
    public void setnacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getnacionalidade(){
        return nacionalidade;
    }
    Pessoa( String datadenascimento, String cordolhos, String nomepai, String nomemae, String cpf, String estadocivil, String nacionalidade){
        super( datadenascimento, cordolhos, nomepai, nomemae);
        this.cpf = cpf;
        this.estadocivil = estadocivil;
        this.nacionalidade = nacionalidade;
    }
    //off
    public void mensagemVitoria(){
        System.out.print("Venci!!!");
    }

}
