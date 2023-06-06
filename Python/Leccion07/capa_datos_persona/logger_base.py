# docs.python.org/howto/logging.html, página web para la configuración de logging

import logging as log 
# log = logging, también podría hacerse


#Llamamos una configuracion basica
log.basicConfig(level=log.DEBUG,                            # %s = parámetro posicional
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',                      # datefmt = date format
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])

if __name__ == '__main__':
    
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel warning')
    log.error('Mensaje a nivel error')
    log.critical('Mensaje a nivel critical')
    
    