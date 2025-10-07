class Auto:

    def __init__(self,potencia,modelo,color,s_n,no_puertas,version):
        self.potencia = potencia
        self.modelo = modelo
        self.color = color
        self.s_n = s_n
        self.no_puertas = no_puertas
        self.version = version

    def saludar(self):
        print("Hola, qué tal muchachos. Este es mi auto: ")

    def mostrarInfo(self):
       print(self.modelo,"\nCon una fuerza de caballos (o potencia para los chavos) de: ",self.potencia,"\nY un color: ",self.color,"\nSu número de serie es: ",self.s_n,"\nY tiene ",self.no_puertas,"puertas","\nPor último, esta es una versión actualizada, la cuál es: ",self.version)
    
    def encender(self):
        print("El auto está encendido, vamos a dar una vuelta")

    def manejar(self):
        print("El auto está en movimiento, maneja con cuidado sin aplicar la Heinselwolf clasicc")
    
    def acelerar(self):
        print("El auto esta acelerando, espero y no se acabe la batería")
    
    def frenar(self):
        print("El auto esta frenando, echenle más agua")

    def choque(self):
        print("Increíble, el auto chocó, todo es tu culpa Martin")

    def __str__ (self): #Para imprimir todo sin necesidad de escribir cada variable
        return f"Auto(modelo={self.modelo}, potencia={self.potencia}, color={self.color}, s_n={self.s_n}, no_puertas={self.no_puertas}, version={self.version})"
    
potenciaAuto1 = int(input("¿Cuál es la potencia o los caballos de fuerza del Auto?: "))
modeloAuto1 = str(input("¿Cuál es el modelo del Auto?: "))
colorAuto1 = str(input("¿De qué color es el Auto?: "))
s_nAuto1 = str(input("¿Cuál es el número de serie del Auto?: "))
versionAuto1 = str(input("¿Cuál es la versión del Auto?: "))
no_puertasAuto1 = int(input("¿Cuántas puertas tiene el Auto?: "))
mustang = Auto(potenciaAuto1,modeloAuto1,colorAuto1,s_nAuto1,no_puertasAuto1,versionAuto1)
mustang.saludar()
mustang.mostrarInfo()
mustang.encender()
mustang.manejar()
mustang.acelerar()
mustang.frenar()
mustang.choque()
    