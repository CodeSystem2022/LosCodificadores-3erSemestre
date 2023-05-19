from dominio.Pelicula import Pelicula
from servicio.Catalogo_Peliculas import CatalogoPeliculas as cp

opcion = None
while opcion != 4: 
    try:
        print('Opciones: ')
        print('1. Agregar pelicula')
        print('2. Listar las peliculas')
        print('3. Eliminar catalogo de peliculas')
        print('4- Salir')
        opcion = int(input('Digite una opcion de menu (1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.Eliminar_peliculas()
    except Exception as e:
        print(f'ocurrio un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del Programa')
        4