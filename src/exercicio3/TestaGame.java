package exercicio3;

public class TestaGame {
    public static void main(String[] args) {
        Game jogo1= new Game("GTA V",80,"PC",16,"AÇÃO","Mundo Aberto");
        Game jogo2= new Game("FIFA 23",200,"PC",10,"Simulação","Esporte");
        jogo1.visualizar();
        jogo2.visualizar();

    }
}
