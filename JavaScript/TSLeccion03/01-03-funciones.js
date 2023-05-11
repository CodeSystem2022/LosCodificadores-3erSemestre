

function miFuncion(a, b){
    
    return a + b;
}




let resultado = miFuncion(6, 7);
console.log(resultado)


















































//Tipos primitivos
let k = 10;
function cambiarValor(a){ //Paso por valor, la variable pasada a la funcion no sufre ningun cambio, como si se pasara unicamente una copia
    a = 20;
}

cambiarValor(k)
console.log(k)