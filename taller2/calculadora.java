import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int n, a, b;
        System.out.println("ingrese 2 numeros ");
        a = lector.nextInt();
        b = lector.nextInt();
        System.out.println("ingrese una opcion: \n1.suma\n2.resta\n3.multiplicacion\n4.division");
        n = lector.nextInt();
        switch (n) {
            case 1:
                System.out.println("la suma es: " + (a + b));
                break;
            case 2:
                System.out.println("la resta es: " + (a - b));
                break;
            case 3:
                System.out.println("la multiplicacion es: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("la division es: " + (a / b));
                } else {
                    System.out.println("error: division por cero");
                }
                break;
            default:
                System.out.println("opcion no valida");
        }
    
    }

    
}
