let x = 10; //Variable tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona)























//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla, concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto: forma 1")
console.log(persona.nombre + ', ' + persona.apellido)

//Numero 2: A traves del ciclo for in
console.log("Distintas formas de imprimir un objeto: forma 2")
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad])
}

//Numero 3: La funcion Object.value()
console.log("Distintas formas de imprimir un objeto: forma 3")
let personaArray = Object.values(persona);
console.log(personaArray)

//Numero 4: Usamos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto: forma 4")
let personaString = JSON.stringify(persona);
console.log(personaString)


































//Diferentes formas de crear objetos
//Caso numero 1
let miObjeto = new Object() //Esta es una opcion formal
//Caso numero 2
let miObjeto2 = {}; //Esta es una opcion breve y recomendada

//Caso string 1
let miCadena1 = new String('Hola');//Sintaxis formal
//Caso string 2 
let miCadena2 = 'Hola' //Esta es la sintaxis simplificada y recomendada

//Caso con numeros 1
let miNumero = new Number(1); //Sintaxis formal no recomendable
//Caso con numeros 2
let miNumero2 = 1; //Sintaxis recomendada

//Caso boolean 1
let miBoolean1 = new Boolean(false); //Formal
//Caso boolean 2
let miBoolean2 = false; //Sintaxis recomendada

//Caso arreglos 1
let miArreglo1 = new Array(); //Formal
//Caso arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//Caso function 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//Caso function 2
let miFuncion2 = function(){}; //Sintaxis simplificada y recomendada











//Uso de call
let persona4 = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto2: function(titulo, telefono){
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ' ' + telefono
    }
}

let persona5 = {
    nombre: "Carlos",
    apellido: "Lara"
}

console.log(persona4.nombreCompleto2('Lic', '1321312312312'))
console.log(persona4.nombreCompleto2.call(persona5, 'Ing', '123124543534'))