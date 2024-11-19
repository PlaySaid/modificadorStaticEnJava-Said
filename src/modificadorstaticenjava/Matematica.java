package modificadorstaticenjava;

public class Matematica {
    
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        if(num2==0){
            System.out.println("Error");
            return 0;
        }
        return num1 / num2;
    }
    public static void main(String[] args){
        double num1 = 3;
        double num2 = 4;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + Matematica.suma(num1, num2));
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + Matematica.resta(num1, num2));
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " es: " + Matematica.multiplicacion(num1, num2));
        System.out.println("La división de " + num1 + " / " + num2 + " es: " + Matematica.division(num1, num2));
    }
}
