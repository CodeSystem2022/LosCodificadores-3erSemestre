# Declaramos una variable
try:
    archivo = open('prueba.txt','w') #la w es de write, escribir
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo