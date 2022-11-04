package exercicio2;

public class Vendedor extends Funcionario{
    private float valorComissão;

    public Vendedor(String nome, int idade, String email, String telefone, String endereco, int cargaHoraria, double salario, String setor, float valorComissão) {
        super(nome, idade, email, telefone, endereco, cargaHoraria, salario, setor);
        this.valorComissão = valorComissão;
    }

    public float getValorComissão() {
        return valorComissão;
    }

    public void setValorComissão(float valorComissão) {
        this.valorComissão = valorComissão;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Valor da comissão do vendedor"+this.valorComissão);
        System.out.println("---------------------------------------------");
    }
}
