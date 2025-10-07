import java.util.Scanner;

public class Auto {    
    
    String modelo;
    int potencia;
    String color;
    int s_n;
    int no_puertas;
    String version;
    
    Auto (String modelo, int potencia, String color, int s_n, int no_puertas, String version) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.s_n = s_n;
        this.no_puertas = no_puertas;
        this.version = version;
    }
    
    void saludar() {
        System.out.println("Hola amigos, este es mi carro, es un: ");
    }
    
    void mostrarInfo() {
        System.out.println(this.modelo + "\nTiene una fuerza de caballos de: " + this.potencia + "\nEs de color: " + this.color + "\nY su número de serie es: " + this.s_n + "\nCon " + this.no_puertas + "puertas" + "\nY es la versión más moderna de su modelo, el cuál es: " + this.version);
    }
    
    void encender() {
        System.out.println("El auto ya está encendido, vamos a dar una vuelta");
        
    }
    
    void manejar() {
        System.out.println("Ahora el auto está en movimiento, maneja con cuidado sin hacer la Heinselwolf classic");
        
    }
    
    void acelerar() {
        System.out.println("El auto está acelerando, ve más despacio por favor");
        
    }
    
    void frenar() {
        System.out.println("El auto está frenando, echale más agua");
        
    }
    
    void choque() {
        System.out.println("Increíble, el auto chocó, todo es tu culpa Martin");
        
    }
    
    public static void main(String[] args) {
       
        String auxModelo;
        int auxPotencia;
        String auxColor;
        int auxS_N;
        int auxNo_Puertas;
        String auxVersion;
        
        Scanner entra = new Scanner(System.in);   //Estancia - Inicio de instanciación
        System.out.println("**********AUTOMÓVIL**********");
        System.out.print("El Modelo del auto es: "); auxModelo=entra.nextLine();
        System.out.print("Su Potencia es: "); auxPotencia=entra.nextInt();
        System.out.print("Es de Color: "); auxColor=entra.nextLine();
        System.out.print("Su número de serie es: "); auxS_N=entra.nextInt();
        System.out.print("Su número de puertas es: "); auxNo_Puertas=entra.nextInt();
        System.out.print("La versión de este auto es: "); auxVersion=entra.nextLine();
    
        Auto mustang = new Auto(auxModelo, auxPotencia, auxColor, auxS_N, auxNo_Puertas, auxVersion);
        
        mustang.saludar();
        mustang.mostrarInfo();
        mustang.encender();
        mustang.manejar();
        mustang.acelerar();
        mustang.frenar();
        mustang.choque();
        System.out.println();
        
        
       
    }
}