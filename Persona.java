public class Persona {    
    
    String nombre;
    String apellido;
    int edad;
    
    Persona(String nom, String ape, int e) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = e;
    }
    
    void saludar() {
        System.out.println("Hola, amigos");
    }
    
    void comer() {
        System.out.println("Tengo hambre");
    }
    
    void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad);
    }
    
    public static void main(String[] args) {
        Persona profesor = new Persona("Alejandro", "Juárez", 47);
        Persona alumno = new Persona("Daniela", "Resendiz", 17);
        Persona vendedor = new Persona("Óscar", "Ramírez", 58);
        
        profesor.mostrarInfo();
        profesor.saludar();
        profesor.comer();
        System.out.println();

        alumno.mostrarInfo();
        alumno.saludar();
        alumno.comer();
        System.out.println();

        vendedor.mostrarInfo();
        vendedor.saludar();
        vendedor.comer();
        
    }
       
       
     
 
}
