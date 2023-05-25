#INSERTAR VARIOS REGISTROS

import psycopg2  # Esto es para poder  conectarnos a Postgre

conexion = psycopg2.connect(user='postgres', password='Admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES(%s, %s, %s)'
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Canto', 'mcanto@mail.com'),
                ('Marcelo', 'Cuenca', 'cuencaM@mail.com')
            ) # es una tupla de tuplas
            # conexion.commit() esto se utiliza para guardar los cambios en la BD
            cursor.executemany(sentencia, valores)  # De esta manera ejecutamos la sentencia
            registros_insertados = cursor.rowcount  # Recuperamos todos los registros que serán una lista
            print(f'Los registros insertados son: {registros_insertados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:

    conexion.close()