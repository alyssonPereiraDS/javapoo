package exercicio1;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String email, String telefone, String endereco, String cnpj) {
        super(nome, idade, email, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ do cliente pessoa juridica:"+this.cnpj);
        System.out.println("---------------------------------------------");
    }
}
