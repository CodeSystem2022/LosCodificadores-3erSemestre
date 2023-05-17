"""
    El archivo puede abrirse en modo 'a' (append, 'agregar'), es decir:
        archivo = open('prueba.txt', 'a', encoding='utf8')
    También en los modos: 'r' (read), 'w' (write), 'x' (si no existe el archivo da excepción),
    y en los mencionados en "manejo_archivos" y (por ende) en "prueba.txt".
"""

archivo = open('prueba.txt','r', encoding='utf8')
#print(archivo.read())
#print(archivo.read(15))                # Se lee esa cantidad de letras
#print(archivo.read(5))                 # Continúa la lectura desde la línea anterior
#print(archivo.readline())              # Se lee la primera línea
#print(archivo.readline())              # Otra

# Iterar el archivo, cada una de las líneas:
    
#for linea in archivo:
   # print(linea)                    
   # print(archivo.readlines()) 
   # print(archivo.readlines()[11])     # Se accede al archivo como si fuera una lista

# Anexo información, y copia a otro:
    
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close() # cerramos el segundo archivo

print('se ha terminado el proceso de leer y copiar archivos')


# Con 'a', si se ejecuta dos veces, se anexa también dos veces la información.
# Si se cambia a 'w' y se ejecuta, vuelve a tenerse una vez lo copiado,
# ya que se crea un nuevo archivo reemplazándose el contenido.