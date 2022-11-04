package exercicio2;

public class Funcionario {
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private String endereco;
    private int cargaHoraria;
    private double salario;
    private String setor;


    public Funcionario(String nome, int idade, String email, String telefone, String endereco, int cargaHoraria, double salario, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void visualizar(){
        System.out.println("nome do funcionário:"+this.nome);
        System.out.println("idade do funcionário:"+this.idade);
        System.out.println("email do funcionário:"+this.email);
        System.out.println("telefone do funcionário:"+this.telefone);
        System.out.println("endereço do funcionário:"+this.endereco);
        System.out.println("carga horária do funcionário:"+this.cargaHoraria);
        System.out.println("salário do funcionário:"+this.salario);
        System.out.println("setor do funcionário:"+this.setor);

    }
}
