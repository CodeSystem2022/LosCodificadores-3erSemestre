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

//AGREGAR O ELIMINAR PROPIEDADES DE LOS OBJETOS
persona.apellida = 'Betancud'; //Cambiamos dinamicamente el valor de un objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);





















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









































































//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellida: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}





console.log(persona4.nombreCompleto2('Lic.', '2635484545'));


//Metodo Apply
let arreglo =['Ing.', '547895662'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));


