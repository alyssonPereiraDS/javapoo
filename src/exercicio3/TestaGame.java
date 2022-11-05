package exercicio3;

public class TestaGame {
    public static void main(String[] args) {
        Jogo jogo1= new Jogo("GTA V",80,"PC",16,"AÇÃO","Mundo Aberto","Rockstar Games");
        Jogo jogo2= new Jogo("FIFA 23",200,"PC",10,"Simulação","Esporte","EA Games");
        jogo1.visualizar();
        jogo2.visualizar();
        Console console1= new Console("PS5",5000,"N/A",10,"equipamento","Eletrônicos","branca");
        Console console2= new Console("Xbox",4000,"N/A",10,"equipamento","Eletrônicos","preta");
        console1.visualizar();
        console2.visualizar();
    }
}
