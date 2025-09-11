import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      Mascota masscota = new mascota();
      Calculadora calculadora = new calculadora();

      boolean ejecutado = true;
       while (ejecutando){
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Saludo mascota");
            System.out.println("2. Baile mascota");
            System.out.println("3. Suma");
            System.out.println("4. Resta");
            System.out.println("5. Multiplicación");
            System.out.println("6. División");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
         
         int opcion;
         try {
           opcion = Interger.parseInt(scanner.nextLine());
           } catch (NumberFormatException e) {
                mascota.error();
                continue;
            }
            
            switch (opcion) {
                case 1:
                    mascota.saludo();
                    break;
                case 2:
                    mascota.baile();
                    break;
                case 3:
                    realizarOperacion(scanner, mascota, calculadora, "suma");
                    break;
                case 4:
                    realizarOperacion(scanner, mascota, calculadora, "resta");
                    break;
                case 5:
                    realizarOperacion(scanner, mascota, calculadora, "multiplicacion");
                    break;
                case 6:
                    realizarOperacion(scanner, mascota, calculadora, "division");
                    break;
                case 7:
                    ejecutando = false;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    mascota.error();
            }
        }
        scanner.close();
    }
    
    private static void realizarOperacion(Scanner scanner, Mascota mascota, Calculadora calculadora, String operacion) {
        try {
            System.out.print("Ingresa el primer número: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingresa el segundo número: ");
            double b = Double.parseDouble(scanner.nextLine());
            
            double resultado;
            switch (operacion) {
                case "suma":
                    resultado = calculadora.suma(a, b);
                    break;
                case "resta":
                    resultado = calculadora.resta(a, b);
                    break;
                case "multiplicacion":
                    resultado = calculadora.multiplicacion(a, b);
                    break;
                case "division":
                    resultado = calculadora.division(a, b);
                    break;
                default:
                    throw new IllegalArgumentException("Operación no válida");
            }
            mascota.darResultado(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar números válidos");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
