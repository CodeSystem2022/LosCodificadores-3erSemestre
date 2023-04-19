try:
    10/0
    #10/0 siempre dará error
except Exception as e:
    print(f'Ha ocurrido un error: {e}')
    #Output: Ha ocurrido un error: division by zero