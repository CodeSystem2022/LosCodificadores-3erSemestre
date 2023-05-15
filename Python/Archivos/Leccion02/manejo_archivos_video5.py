# Declaración de una variable

try:
    archivo = open('prueba.txt', 'w', encoding='utf8')     # Se crea en la misma carpeta, en modo escritura
    archivo.write("Programa con diferentes tipos de archivos, ahora en txt.\n")
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción.\n')
    archivo.write("Las letras son:\n'r': read->lee, \n'a': append->anexa, \n'w': write>escribe, \n'x' ->crea archivo,\n")
    archivo.write("'t': para texto o text, \n'b': archivos binarios, \n'w+': lee y escribe, \n'r+': escribe y lee.\n")
    archivo.write('Con esto terminamos.')
except Exception as e:
    print(e)
finally:                                                   # Siempre se ejecuta
    archivo.close()
