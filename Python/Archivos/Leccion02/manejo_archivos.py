# Declaramos una variable
try:
    archivo = open('prueba.txt','w') #la w es de write, escribir
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción\n')
    archivo.write('las letras son: \nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt texto text, \nb archivo binario, \nw+ escribir y leer')
    archivo.write('\nsaludos a todos')
    archivo.write('Con  esto terminamos')
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
   # archivo.write('todo quedo perfecto'): este es un error