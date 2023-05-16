from ManejoArchivos import ManejoArchivos

#manejo de contexto with, sintaxix simplificada, abe y cierra el archivo
with open('prueba.txt', 'r', encoding='utf8') as archivo:
    print(archivo.read())
# no hace falta ni el try, ni el finally
# en el contexto de with lo que hace ejecuta de manera automatica
# utiliza diferentes metodos:__enter__ este es el que abre
#ahora el seiguiente metodo que cierra: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())