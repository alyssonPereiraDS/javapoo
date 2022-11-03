package exercicio1;

public class Cliente {
    String nome;
    int idade;
    String email;
    String telefone;
    String endereco;

    public Cliente(String nome, int idade, String email, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void visualizar(){
        System.out.println("nome do cliente:"+this.nome);
        System.out.println("idade do cliente:"+this.idade);
        System.out.println("email do cliente:"+this.email);
        System.out.println("telefone do cliente:"+this.telefone);
        System.out.println("endereço do cliente:"+this.endereco);
        System.out.println("---------------------------------------------");
    }
}
