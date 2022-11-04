package exercicio1;

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica cliente1= new PessoaFisica("Alysson",21,"josealysson@gmail.com","0054312","zona rural","03365475");
        PessoaFisica cliente2 = new PessoaFisica("joão da silva",100,"não tem","024512","pau dos ferros","7115424");
        PessoaJuridica cliente3 = new PessoaJuridica("Meli",20,"meli@123","025462512","SP","04547");
        PessoaJuridica cliente4 = new PessoaJuridica("Generation",5,"generation@123","654897","SP","12245820");
        cliente1.visualizar();
        cliente2.visualizar();
        cliente3.visualizar();
        cliente4.visualizar();
        
    }
}
