# Manejo de contexto with: sintaxis simplificada que abre y cierra el archivo,
# no hace falta el try ni el finally.
# En el contexto de with se ejecutan de manera automática los métodos como:
# __enter__(donde se abre el archivo),
# __exit__(con el que se cierra)

#with open('prueba.txt', 'r', encoding='utf8') as archivo:
#    print(archivo.read())

from ManejoArchivos import ManejoArchivos

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
