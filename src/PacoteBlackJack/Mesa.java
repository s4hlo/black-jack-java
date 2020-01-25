package PacoteBlackJack;
import java.util.Scanner;
public class Mesa {
    private Jogador jogador1, jogador2;
    private Baralho deck;
    Mesa(){
        this.jogador1 = new Jogador("01/01/2018","azul", "josé","maria","12345678912","solterio","brasileiro"," ", "Pessoa2@email.com") ;
        this.jogador2 = new Jogador("01/01/2018","azul", "josé","maria","12345678912","aolterio","brasileiro"," ", "Pessoa1@email.com");
        this.deck = new Baralho();
    }
    Mesa(Jogador jogador1,Jogador jogador2){
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.deck = new Baralho();
    }
    public String getNomeJogador1(){
        return jogador1.getnome();
    }
    public String getNomeJogador2(){
        return jogador2.getnome();
    }
    public void listarCartas(){
        deck.listarCartas();
    }
    public void embaralhar(){
        deck.embaralhar();
    }
    public void imprimeDadosJogador1(){
        jogador1.imprimeDadosJogador();
    }
    public void imprimeDadosJogador2(){
        jogador2.imprimeDadosJogador();
    }
    public void exibirCarta(Carta x){
        deck.exibirCarta(x);
    }
    public Carta pegarCarta() throws ExcecaoBaralhoVazio{
        return deck.pegarCarta();
    }
    public void mostrarPlacar(){
        System.out.println("-----PLACAR-----");
        System.out.println(getNomeJogador1() + ":" + jogador1.getPontos());
        System.out.println(getNomeJogador2() + ":" + jogador2.getPontos());
        System.out.println("----------------");
    }
    public void jogar(){
        System.out.println("-----BLACKJACK-----");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do Jogador 1:");
        jogador1.setnome(leitor.nextLine());
        System.out.println("Digite o nome do Jogador 2:");
        jogador2.setnome(leitor.nextLine());
        System.out.println("-----INSTRUÇÕES-----");
        System.out.println("Para começar digite 1 para puxar uma carta ou 2 para passar a vez.");
	embaralhar();
	int h = 0;
        int j = 0;
        while (true){
            //----------------------------------------------------------jogada 1
            do{
                
                while(true){
                    System.out.println("Vez de " + getNomeJogador1() + ":");
                    Scanner entrada = new Scanner(System.in);
                    String hl = entrada.nextLine();
                    try {              
                        h = Integer.parseInt(hl);                        
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Valor inválido");
                    }
                }               
                switch (h) {
                    case 1:
                        try {
                            jogador1.adicionarCartaSacada(pegarCarta());
                            mostrarPlacar();
                        } catch (ExcecaoBaralhoVazio ex) {
                            System.out.println(ex.getMessage());
                            mostrarPlacar();
                            if (jogador1.getPontos() > jogador2.getPontos()) {
                                System.out.print(getNomeJogador1() + ": ");
                                jogador1.mensagemVitoria();
                                System.exit(0);
                            } else if (jogador1.getPontos() < jogador2.getPontos()){
                                System.out.print(getNomeJogador2() + ": ");
                                jogador2.mensagemVitoria();
                                System.exit(0);
                            } else {
                                System.out.println("O jogo empatou");
                                System.exit(0);
                            }       
                        }
                        break;
                    case 2:
                        System.out.println("Não puxou");
                        mostrarPlacar();
                        break;
                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            }while(h != 1 && h != 2);
            //analisar resultado
            if(jogador1.getPontos() == 21){
                System.out.print(getNomeJogador1() + ": ");
                jogador1.mensagemVitoria();
                break;
            } else if(jogador1.getPontos() > 21){
                System.out.print(getNomeJogador2() + ": ");
                jogador2.mensagemVitoria();
                break;			
            }            
            //-------------------------------------------------nao puxou 2 vezes
            if (j + h == 4) {
                if (jogador1.getPontos() > jogador2.getPontos()) {
                    System.out.print(getNomeJogador1() + ": ");
                    jogador1.mensagemVitoria();
                    break;
                } else if (jogador1.getPontos() < jogador2.getPontos()){
                    System.out.print(getNomeJogador2() + ": ");
                    jogador2.mensagemVitoria();
                    break;
                } else {
                    System.out.println("O jogo empatou");
                    break;
                }                  
            }
            //----------------------------------------------------------jogada 2
            do {
                while(true){
                    System.out.println("Vez de " + getNomeJogador2() + ":");
                    Scanner entrada = new Scanner(System.in);
                    String jl = entrada.nextLine();
                    try {              
                        j = Integer.parseInt(jl);                        
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Valor inválido");
                    }
                }       
                switch (j) {
                    case 1:
                        try {
                            jogador2.adicionarCartaSacada(pegarCarta());
                            mostrarPlacar();
                        } catch (ExcecaoBaralhoVazio ex) {
                            System.out.println(ex.getMessage());
                            mostrarPlacar();
                            if (jogador1.getPontos() > jogador2.getPontos()) {
                                System.out.print(getNomeJogador1() + ": ");
                                jogador1.mensagemVitoria();
                                System.exit(0);
                            } else if (jogador1.getPontos() < jogador2.getPontos()){
                                System.out.print(getNomeJogador2() + ": ");
                                jogador2.mensagemVitoria();
                                System.exit(0);
                            } else {
                                System.out.println("O jogo empatou");
                                System.exit(0);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Não puxou");
                        mostrarPlacar();
                        break;
                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            }while(j != 1 && j != 2);                       
            //analisar resultado
            if(jogador2.getPontos() == 21){
                System.out.print(getNomeJogador2() + ": ");
                jogador2.mensagemVitoria();
                break;
            } else if(jogador2.getPontos() > 21){
                System.out.print(getNomeJogador1() + ": ");
                jogador1.mensagemVitoria();
                break;			
            }  
            //-------------------------------------------------nao puxou 2 vezes
            if (j + h == 4) {
                if (jogador1.getPontos() > jogador2.getPontos()) {
                    System.out.print(getNomeJogador1() + ": ");
                    jogador1.mensagemVitoria();
                    break;
                } else if (jogador1.getPontos() < jogador2.getPontos()){
                    System.out.print(getNomeJogador2() + ": ");
                    jogador2.mensagemVitoria();
                    break;
                } else {
                    System.out.println("O jogo empatou");
                    break;
                }                  
            }                                 
        }        
    }
}
