import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        System.out.println("Qual forma você deseja calcular ? 1-triangulo   2-circulo   3-quadrado");
        Scanner Teclado = new Scanner(System.in);
        int opc = Teclado.nextInt();
        
        switch(opc) {
        case 1: System.out.println("Qual o tamando da base do triangulo ? ");
        Double base = Teclado.nextDouble();
        System.out.println("Qual a altura do triangulo ?");
        Double altura = Teclado.nextDouble();
        
        Double Area = base*altura/2;
        System.out.println("A area do triangulo é: " + Area);
        
        
        case 2: System.out.println("Qual o raio do circulo ?");
        Double raio = Teclado.nextDouble();
        Double area;
        area = Math.PI * raio * raio;
        System.out.println("A aréa do circulo é: " + area);
        
        
        case 3: System.out.println("Qual o tamanho da base do quadrado ? ");
        Double base2 = Teclado.nextDouble();
        Double area3;
        area3 = base2*base2;
        System.out.println("A base do quadrado é:  " + area3);

            
        }
        
    }
}
