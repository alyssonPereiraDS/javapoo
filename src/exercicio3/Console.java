package exercicio3;

public class Console extends Game{
    private String cor;

    public Console(String nome, float preco, String plataforma, int classIndicativa, String genero, String categoria, String cor) {
        super(nome, preco, plataforma, classIndicativa, genero, categoria);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Cor do console:"+this.cor);
        System.out.println("---------------------------------------------");
    }
}
