class Felino:

    def __init__(self,tipo,peso,altura,color):
        self.tipo = tipo
        self.peso = peso
        self.altura = altura
        self.color = color

    def saludar(self):
        print("Hola, este es un felino de tipo: ")

    def mostrarInfo(self):
        print(self.tipo,"\nPeso:",self.peso,"\nAltura: ",self.altura,"\nColor: ",self.color)

    def comer(self):
        print("A este Felino le gusta comer carne")


tipoGato = str(input("¿Qué tipo de Felino es?: "))
pesoGato = float(input("¿Cuál es el peso del Felino?: "))
alturaGato = float(input("¿Cuál es la altura del Felino?: "))
colorGato = str(input("¿De qué color es el Felino?: "))
gato = Felino(tipoGato,pesoGato,alturaGato,colorGato)
gato.saludar()
gato.mostrarInfo()
gato.comer()

tipoLeon = str(input("¿Qué tipo de Felino es?: "))
pesoLeon = float(input("¿Cuál es el peso del Felino?: "))
alturaLeon = float(input("¿Cuál es la altura del Felino?: "))
colorLeon = str(input("¿De qué color es el Felino?: "))
leon = Felino(tipoLeon,pesoLeon,alturaLeon,colorLeon)
leon.saludar()
leon.mostrarInfo()
leon.comer()

tipoPuma = str(input("¿Qué tipo de Felino es?: "))
pesoPuma = float(input("¿Cuál es el peso del Felino?: "))
alturaPuma = float(input("¿Cuál es la altura del Felino?: "))
colorPuma = str(input("¿De qué color es el Felino?: "))
puma = Felino(tipoPuma,pesoPuma,alturaPuma,colorPuma)
puma.saludar()
puma.mostrarInfo()
puma.comer()
