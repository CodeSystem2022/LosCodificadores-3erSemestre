// Ciclo while
let contador = 0;
while (contador < 3){
    console.log(contador)
    contador++
}
console.log('Fin del ciclo while')


//Palabra reservada break
for(Let contando = 0; contando <= 10;contando++){
    if(contando % 2 == 0){
        console.log(contando); //Muestra todos los pares
        break; //rompe el ciclo
    }
}
console.log("Termina el ciclo al encontrar el primer numero par");
