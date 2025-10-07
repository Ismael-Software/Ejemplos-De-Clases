import java.util.Scanner;

public class Persona {    
    
    String trabajo;
    String nombre;
    String apellido;
    int edad;
    
    Persona (String trabajo, String nombre, String apellido, int edad) {
        this.trabajo = trabajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    void saludar() {
        System.out.println("Hola amigos, este esta persona es un: ");
    }
    
    void mostrarInfo() {
        System.out.println(this.trabajo + "\nSu nombre es: " + this.nombre + "\nSu apellido es: " + this.apellido + "\nY su edad es: " + this.edad);
    }
    
    void comer() {
        System.out.println("Y quiere comer una sandía");
    }
    
    public static void main(String[] args) {
       
        String auxTrabajo;
        String auxNombre;
        String auxApellido;
        int auxEdad;
        
        Scanner entra = new Scanner(System.in);   //Estancia - Inicio de instanciación
        System.out.println("**********PROFESOR**********");
        System.out.print("Trabajo: "); auxTrabajo=entra.nextLine();
        System.out.print("Nombre: "); auxNombre=entra.nextLine();
        System.out.print("Apellido: "); auxApellido=entra.nextLine();
        System.out.println("Edad: "); auxEdad=entra.nextInt();
    
        System.out.println("**********ALUMNO**********");
        System.out.print("Trabajo: "); auxTrabajo=entra.nextLine();
        System.out.print("Nombre: "); auxNombre=entra.nextLine();
        System.out.print("Apellido: "); auxApellido=entra.nextLine();
        System.out.println("Edad: "); auxEdad=entra.nextInt();
        
        System.out.println("**********VENDEDOR**********");
        System.out.print("Trabajo: "); auxTrabajo=entra.nextLine();
        System.out.print("Nombre: "); auxNombre=entra.nextLine();
        System.out.print("Apellido: "); auxApellido=entra.nextLine();
        System.out.println("Edad: "); auxEdad=entra.nextInt();
        
        Persona profesor = new Persona(auxTrabajo, auxNombre, auxApellido, auxEdad);
        Persona alumno = new Persona(auxTrabajo, auxNombre, auxApellido, auxEdad);
        Persona vendedor = new Persona(auxTrabajo, auxNombre, auxApellido, auxEdad);
       
        profesor.saludar();
        profesor.mostrarInfo();
        profesor.comer();
        System.out.println();
       
        alumno.saludar();
        alumno.mostrarInfo();
        alumno.comer();
        System.out.println();
        
        vendedor.saludar();
        vendedor.mostrarInfo();
        vendedor.comer();
        System.out.println();
        
        
       
    }
}