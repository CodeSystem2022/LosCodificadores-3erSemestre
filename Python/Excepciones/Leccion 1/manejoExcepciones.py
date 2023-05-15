try:
    10/0
    #10/0 siempre dará error

# Para saber que tipo de excepción está llamando
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
# La clase mas genérica se coloca al final del bloque try
except Exception as e:  # Clase padre Exception
    print(f'Ha ocurrido un error: {e} - Exception')
    #Output: Ha ocurrido un error: division by zero

# Procesamiento de excepciones
resultado = None
a = 10
b = 0
try:
    resultado = a / b  # modificamos
except Exception as e:
    print(f'Ocurrió un error: {e}')

print(f'El resultado es: {resultado}')
print('seguimos...')