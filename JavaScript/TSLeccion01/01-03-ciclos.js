// Ciclo while
let contador = 0;
while (contador < 3){
    console.log(contador)
    contador++
}
console.log('Fin del ciclo while')

//CICLO DO WHILE
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
} while (conteo < 3);
console.log("Fin del ciclo  do while");


//Palabra reservada break
for(let contando = 0; contando <= 10;contando++){
    //console.log(contando)
    if(contando % 2 == 0){
        console.log(contando); //Muestra todos los pares
        break; //rompe el ciclo
    }
}
console.log("Termina el ciclo al encontrar el primer numero par");














//La palabra continue y Etiquetas Labels
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        //continue; //Continua a la siguiente iteracion del for
        break inicio; // ir a la siguiente iteracion
    }
    console.log(contando);  0
}
console.log("Termina el ciclo");









