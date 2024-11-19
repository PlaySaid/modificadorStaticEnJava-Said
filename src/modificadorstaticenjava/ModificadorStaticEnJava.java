package modificadorstaticenjava;

public class ModificadorStaticEnJava {

    public static void main(String[] args) {
        Coche coche1 = new Coche("Chevrolet", "Spark");
        Coche coche2 = new Coche("Nissan", "Versa");
        Coche coche3 = new Coche("Mazda", "CX-5");
        Coche coche4 = new Coche("Kia", "Sportage");

        System.out.println("Coche 1: " + coche1.getMarca() + " " + coche1.getModelo());
        System.out.println("Coche 2: " + coche2.getMarca() + " " + coche2.getModelo());
        System.out.println("Coche 3: " + coche3.getMarca() + " " + coche3.getModelo());
        System.out.println("Coche 4: " + coche4.getMarca() + " " + coche4.getModelo());
        System.out.println("Número total de coches creados: " + Coche.mostrarCoches());
    }
    
}
