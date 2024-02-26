package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(1.4);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(145);
        System.out.println(caixaB.abrir());

        CaixaNumero<Double> caixaC = new CaixaNumero<>();
        caixaC.guardar(1.4);
        System.out.println(caixaC.abrir());
    }
}
