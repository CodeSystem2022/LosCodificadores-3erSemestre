miFuncion(8, 2); //Esto se lo conoce como hosting

function miFuncion(a, b){
    console.log("Sumamos: "+ (a + b));
}

//Llamado la funcion
miFuncion(5, 4);

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