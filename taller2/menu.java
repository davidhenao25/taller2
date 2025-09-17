import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      mascota mascota = new mascota(" ___\n{o,o}\n/)  )","\n \" \" ");
      calculadora calculadora = new calculadora();

      boolean salir = false;
       while (!salir){
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Saludo mascota");
            System.out.println("2. Baile mascota");
            System.out.println("3. Sumar");
            System.out.println("4. Restar");
            System.out.println("5. Multiplicar");
            System.out.println("6. Dividir");
            System.out.println("7. Salir");
            System.out.println("Selecciona una opción: ");
         
         int opcion;
         try {
           opcion = Integer.parseInt(lector.nextLine()); // Intenta leer y convertir la entrada del usuario a número entero
           } catch (NumberFormatException e) {
                mascota.error(); // Si la entrada no es válida, muestra error y repite el menú
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
                    realizarOperacion(lector, mascota, calculadora, "suma");
                    break;
                case 4:
                    realizarOperacion(lector, mascota, calculadora, "resta");
                    break;
                case 5:
                    realizarOperacion(lector, mascota, calculadora, "multiplicacion");
                    break;
                case 6:
                    realizarOperacion(lector, mascota, calculadora, "division");
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    mascota.error();
            }
        }
        System.out.println("¡Hasta pronto!");
    }
    
    private static void realizarOperacion(Scanner scanner, mascota mascota, calculadora calculadora, String operacion) {
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
            // Si el usuario escribe letras o símbolos en vez de números
            System.out.println("Error: Debes ingresar números válidos");
        } catch (ArithmeticException e) {
            // Si el usuario hace una operación inválida, como dividir por cero
            System.out.println("Error: " + e.getMessage());
        }
    }
}

