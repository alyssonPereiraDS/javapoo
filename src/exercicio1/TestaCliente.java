package exercicio1;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Alysson",21,"josealysson@gmail.com","0054312","zona rural");
        Cliente cliente2 = new Cliente("joão da silva",100,"não tem","024512","pau dos ferros");
        cliente1.visualizar();
        cliente2.visualizar();
    }
}
