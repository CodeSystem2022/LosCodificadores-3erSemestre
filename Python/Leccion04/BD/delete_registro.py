import psycopg2 #Esto es para conectarnos a postgres

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5432', database = 'test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona = %s'
            entrada = input('Digite el id_persona de la persona a eliminar: ')
            valores = (entrada,) #Es una tupla de valores
            cursor.execute(sentencia) #De esta manera ejecutamos la sentencia
            registros_eliminados = cursor.rowcount #Recuperamos todos los registros que seran una lista
            print(f'Los registros eliminados son: {registros_eliminados}')
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()