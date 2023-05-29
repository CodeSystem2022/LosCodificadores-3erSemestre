# INSTALACION DEL MODULO  POSTGRESQL
# Creamos nueva carpeta: Leccion04
# Dentro creamos otra carpeta BD. Create
# Instalamos la libreria de postgresql
# Click en terminal
# Escribimos pip install psycopg2 + enter

import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user= 'postgres', password= 'admin', host= '127.0.01', port= '5432', database= 'test_bd')
try:
    with conexion:
        with conexion.cursor()as cursor:
        sentencia = 'SELECT * FROM persona WHERE id_persona IN %s' # Placeholder
        entrada = input('Digite los id_persona a buscar (separadas por coma): ')
        llaves_primarias = (tuple(entrada.split(', ')),)
        cursor.execute(sentencia, (id_persona,))# De esta manera ejecutamos la sentencia
        registros = cursor.fetchone() # Recuperamos todos los registros que seran una lista
        for registro in registros:
            print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()