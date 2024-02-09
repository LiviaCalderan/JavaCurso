package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        
        Calculo soma = (x, y) -> { return x + y; }; //lambda - função anonima
        //quando coloca o par de chaver o return é obrigatorio
        System.out.println(soma.excutar(2, 3));

        soma = (x, y) -> x * y; //implicito - deixa o codigo mais compacto
        System.out.println(soma.excutar(2, 3));

        System.out.println(soma.legal());
        System.out.println(Calculo.massa());
    }
}
