package PacoteBlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Baralho {
    private List<Carta> cartas= new ArrayList<Carta>();;
    Baralho(){
        //-----------------------------------------------------------------Ouros
        cartas.add(new Carta("A", "Ouros", 1 ));
        for (int c = 1;c < 10;c++){
            cartas.add(new Carta(Integer.toString(c+1),"Ouros", c+1));
        }
        cartas.add(new Carta("j", "Ouros", 10));
        cartas.add(new Carta("Q", "Ouros", 10));
        cartas.add(new Carta("k", "Ouros", 10));
        //-------------------------------------------------------------------Paus
        cartas.add(new Carta("A", "Paus", 1 ));
        for (int c = 14;c < 23;c++){
            cartas.add(new Carta(Integer.toString(c-12),"Paus", c-12));
        }
        cartas.add(new Carta("j", "Paus", 10));
        cartas.add(new Carta("Q", "Paus", 10));
        cartas.add(new Carta("k", "Paus", 10));
        //----------------------------------------------------------------- -Copas
        cartas.add(new Carta("A", "Copas", 1 ));
        for (int c = 27;c < 36;c++){
            cartas.add( new Carta(Integer.toString(c-25),"Copas", c-25));
        }
        cartas.add(new Carta("j", "Copas", 10));
        cartas.add(new Carta("Q", "Copas", 10));
        cartas.add(new Carta("k", "Copas", 10));
        //------------------------------------------------------------------Espada
        cartas.add( new Carta("A", "Espada", 1 ));
        for (int c = 40;c < 49;c++){
            cartas.add( new Carta(Integer.toString(c-38),"Espada", c-38));
        }
        cartas.add(new Carta("j", "Espada", 10));
        cartas.add(new Carta("Q", "Espada", 10));
        cartas.add(new Carta("k", "Espada", 10));
    }
    public void exibirCarta(Carta x){
        System.out.println(x.getnumero() + " " + x.getnaipe() + " " + x.getvalor());
    }
    public void listarCartas(){
        for (int c = 0;c < cartas.size() ;c++){
            System.out.println(cartas.get(c).getnumero() + " " + cartas.get(c).getnaipe() + " " + cartas.get(c).getvalor());
        }
    }
    protected void embaralhar(){
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            //Carta temp = cartas.remove(ran.nextInt(52));
            cartas.add(cartas.remove(ran.nextInt(cartas.size())));
        }
        //Collections.shuffle(cartas);
    }
    protected Carta pegarCarta() throws ExcecaoBaralhoVazio{
        if (cartas.size() > 0){
            Carta c = cartas.remove(0);
            return c;
        } else {
            throw new ExcecaoBaralhoVazio();
        }
    }
}
