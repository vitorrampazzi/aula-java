package java.aula3103;

public class aula {
    public static void main(String[] args) {
        cliente p1 = new cliente();
        p1.setId(5);
        p1.setNome("Leandrinha");
        p1.setSaldo(10);

        
        cliente p2 = new cliente(2, "carla", 1);

        p2.depositar(30);
        p1.depositar(50);

        System.out.println(p1.getNomeFormatado());
        System.out.println(p1.getNomeFormatadoPerigoso());
        System.out.println(p2.getNomeFormatado());
        System.out.println(p2.getNomeFormatadoPerigoso());
    }
}
