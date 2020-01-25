package PacoteBlackJack;
public class Humano {
   private String datadenascimento, cordolhos, nomepai, nomemae;
   protected void setdatadenascimento(String datadenascimento){
       this.datadenascimento = datadenascimento;
   }
   protected String getdatadenascimento(){
       return datadenascimento;
   }
   protected void setcordolhos(String cordolhos){
       this.cordolhos = cordolhos;
   }
   protected String getcordolhos(){
       return cordolhos;
   }
   protected void setnomepai(String nomepai){
       this.nomepai = nomepai;
   }
   protected String getnomepai(){
       return nomepai;
   }
   protected void setnomemae(String nomemae){
       this.nomemae = nomemae;
   }
   protected String getnomemae(){
       return nomemae;
   }
   Humano( String datadenascimento, String cordolhos, String nomepai, String nomemae){
       this.datadenascimento = datadenascimento;
       this.cordolhos = cordolhos;
       this.nomepai = nomepai;
       this.nomemae = nomemae;
   }
}
