class Persona:

    def __init__(self,nombre,apellido,edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def saludar(self):
        print("hola amigos")

    def mostrarInfo(self):
        print("Nombre:",self.nombre,"\nappellido:",self.apellido,self.edad)

    def comer(self):
        print("Estoy comiendo un sandwich")

nombre = string(inp(u))

profesor = Persona("Alejandro","Juárez",34)
profesor.saludar()
profesor.mostrarInfo()
profesor.comer()
alumno = Persona("Esteban", "Castro", 17)
vendedor = Persona("Marco Antonio", "Zapatilla", 58)

print(profesor.nombre, profesor.apellido, "-", profesor.edad)
print(alumno.nombre, alumno.apellido, "-", alumno.edad)
print(vendedor.nombre, vendedor.apellido, "-", vendedor.edad)
