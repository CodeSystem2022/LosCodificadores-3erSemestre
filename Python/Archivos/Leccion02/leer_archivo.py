
archivo = open('prueba.txt','r', encoding='utf8')# las letas son: 'r' read, 'a' append, 'w' write, 'x'
#print(archivo.read())
#print(archivo.read(5))# leemos esa cantidad de letras
#print(archivo.readline())#lee la primera linea

# vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
   # print(linea) # iteramos todos los elementos del archivo
   # print(archivo.readlines()) accedemos al archivo como si fuera una lista
    #print(archivo.readlines()[11])
# anexamos informacion, copiamos a otro
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close() # cerramos el segundo archivo

print('se ha terminado el proceso de leer y copiar archivos')
