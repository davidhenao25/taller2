public class mascota {
    private String mascota1 = " ___\n{o,o}\n/)  )";
    private String mascota2="\n \" \" ";
    private String nombre;
    
    public mascota(String mascota1, String mascota2, String nombre){
        this.mascota1 = mascota1;
        this.mascota2= mascota2;
        this.nombre = nombre;
    }
    
    void saludo(){
        System.out.println(mascota1 + " Hola " + nombre + ", soy Buhito y hoy te acompañaré " + mascota2 );
    }
    
    void baile(){
        for(int i=0; i<3; i++){
           System.out.println(mascota1 + mascota2);
           System.out.println(" ___\n{o,o}\n(  (\\\n \" \"  ");
        }
    }
    
    void error(){
       System.out.println("Parece que seleccionaste una opción inválida"); 
    }
    
    void darResultado(double resultado){
        System.out.println(mascota1 + "El resultado es: " + resultado + mascota2);

    }
}
