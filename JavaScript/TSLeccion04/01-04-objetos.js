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