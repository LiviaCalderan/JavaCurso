package desafio;

public class Jantar {

    public static void main(String[] args) {
        
        Comida c1 = new Comida("arroz", 0.3);
        Comida c2 = new Comida("frango", 0.4);

        Pessoa p1 = new Pessoa("Marcos Henrique", 60.0);

        System.out.println(p1.apresentação());
		
		p1.comer(c2);
		System.out.println(p1.apresentação());
		
		p1.comer(c1);
		System.out.println(p1.apresentação());

    }
    
}