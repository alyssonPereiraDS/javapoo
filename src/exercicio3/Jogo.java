package exercicio3;

public class Jogo extends Game{
    private String desenvolvedora;

    public Jogo(String nome, float preco, String plataforma, int classIndicativa, String genero, String categoria, String desenvolvedora) {
        super(nome, preco, plataforma, classIndicativa, genero, categoria);
        this.desenvolvedora = desenvolvedora;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }


    public void visualizar() {
        super.visualizar();
        System.out.println("Empresa Desenvolvedora:"+this.desenvolvedora);
        System.out.println("---------------------------------------------");
    }
}
