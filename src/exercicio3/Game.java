package exercicio3;

public class Game {
    private String nome;
    private float preco;
    private String plataforma;
    private int classIndicativa;
    private String genero;
    private String categoria;

    public Game(String nome, float preco, String plataforma, int classIndicativa, String genero, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.plataforma = plataforma;
        this.classIndicativa = classIndicativa;
        this.genero = genero;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(int classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void visualizar(){
        System.out.println("nome do jogo:"+this.nome);
        System.out.println("preço do jogo:"+this.preco);
        System.out.println("plataforma do jogo:"+this.plataforma);
        System.out.println("classificação indicativa do jogo:"+this.classIndicativa);
        System.out.println("gênero do jogo:"+this.genero);
        System.out.println("categoria do jogo:"+this.categoria);
        System.out.println("---------------------------------------------");
    }
}
