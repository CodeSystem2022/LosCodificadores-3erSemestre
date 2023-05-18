class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50, '-'))
        self.nombre = open(self.nombre, 'r', encoding='utf8')   # Se encapsula el código dentro del método
        return self.nombre

    def __exit__(self, tipo_exception, valor_exception, traza_error):   # La taza es el texto del error
        print('Cerramos el recurso'.center(50, '-'))
        if self.nombre:                                         # Si está apuntando a un objeto, si está abierto
            self.nombre.close()                                 # Se cierra el archivo
