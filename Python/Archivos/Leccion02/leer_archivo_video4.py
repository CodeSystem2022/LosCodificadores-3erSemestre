"""
    El archivo puede abrirse en modo 'a' (append, 'agregar'), es decir:
        archivo = open('prueba.txt', 'a', encoding='utf8')
    También en los modos: 'r' (read), 'w' (write), 'x' (si no existe el archivo da excepción),
    y en los mencionados en "manejo_archivos" y (por ende) en "prueba.txt".
"""
archivo = open('prueba.txt', 'r', encoding='utf8')
print(archivo.read())

