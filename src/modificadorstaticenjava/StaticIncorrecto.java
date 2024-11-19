package modificadorstaticenjava;

public class StaticIncorrecto {
        
    private int numeroNoEstatico = 10;
    private static int numeroEstatico = 20;

    public static void metodoEstatico() { 
        System.out.println("Valor no estático: " + numeroNoEstatico);
    }

    public void metodoNoEstatico() {
        System.out.println("Valor estático: " + numeroEstatico);
    }
 }
