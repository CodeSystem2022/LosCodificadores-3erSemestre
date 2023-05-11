from NumerosIgualesException import NumerosIgualesException

resultado = None            # Variable creada fuera del bloque try-except. Valdrá también fuera de él.

try:
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo número: '))
    if a==b:
        raise NumerosIgualesException('Son números iguales')    # Permite acceder a una excepción.
    resultado = a/b
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroCivisionError - Ocurrió un error: {type(e)}')
except Exception as e:              # La clase más general al final.
    print(f'Exception - Ocurrió un error: {type(e)}')
else:                               # Es opcional. Se ejecuta si no lo hace ninguna excepción.
    print('No se arrojó ninguna excepción')
finally:                            # Se ejecuta siempre.
    
