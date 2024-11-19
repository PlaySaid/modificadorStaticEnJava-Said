package modificadorstaticenjava;

public class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;
    
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    public static int mostrarCoches(){
        return contadorCoches;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
