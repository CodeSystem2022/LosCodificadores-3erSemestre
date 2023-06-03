import psycopg2 as bd
# psicopg2 as db otra manera de importar psycopg2
from logger_base import log
import sys

class Conexion:








    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion = bd.connect(host= cls._HOST,
                                           user= cls._USERNAME,
                                           password= cls._PASSWORD,
                                           port= cls._DB_PORT,
                                           database= cls._DATABASE)
                log.debug(f'Conexión exitosa: {cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.error(f'Ocurrio un error: {e}')
                sys.exit()
        else:
            return cls._conexion
            