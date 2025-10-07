/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Felino {    
    
    String tipo;
    int peso;
    int altura;
    String color;
    
    Felino (String tipo, int peso, int altura, String color) {
        this.tipo =tipo;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
    }
    
    void saludar() {
        System.out.println("Hola amigos, este es un Felino de tipo: ");
    }
    
    void mostrarInfo() {
        System.out.println(this.tipo + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nColor: " + this.color);
    }
    
    void comer() {
        System.out.println("Y a este Felino le gusta comer carne :)");
    }
    
    public static void main(String[] args) {
       
        String auxTipo;
        int auxPeso;
        int auxAltura;
        String auxColor;
        
        Scanner entra= new Scanner(System.in);   //Estancia - Inicio de instanciación
        System.out.println("**********FELINO**********");
        System.out.print("Tipo de Felino: "); auxTipo=entra.nextLine();
        System.out.print("Peso del Felino: "); auxPeso=entra.nextInt();
        System.out.print("Altura del Felino: "); auxAltura=entra.nextInt();
        System.out.println("Color del Felino: "); auxColor=entra.nextLine();
        
        System.out.println("**********FELINO**********");
        System.out.print("Tipo de Felino: "); auxTipo=entra.nextLine();
        System.out.print("Peso del Felino: "); auxPeso=entra.nextInt();
        System.out.print("Altura del Felino: "); auxAltura=entra.nextInt();
        System.out.println("Color del Felino: "); auxColor=entra.nextLine();
        
        System.out.println("**********FELINO**********");
        System.out.print("Tipo de Felino: "); auxTipo=entra.nextLine();
        System.out.print("Peso del Felino: "); auxPeso=entra.nextInt();
        System.out.print("Altura del Felino: "); auxAltura=entra.nextInt();
        System.out.println("Color del Felino: "); auxColor=entra.nextLine();
        
        Felino gato = new Felino(auxTipo, auxPeso, auxAltura, auxColor);
        Felino leon = new Felino(auxTipo, auxPeso, auxAltura, auxColor);
        Felino puma = new Felino (auxTipo, auxPeso, auxAltura, auxColor);
       
        gato.saludar();
        gato.mostrarInfo();
        gato.comer();
        gato.color();
        System.out.println();
        
        leon.saludar();
        leon.mostrarInfo();
        leon.comer();
        leon.color();
        System.out.println();
        
        puma.saludar();
        puma.mostrarInfo();
        puma.comer();
        puma.color();
        System.out.println();
        
       
    }
}
       