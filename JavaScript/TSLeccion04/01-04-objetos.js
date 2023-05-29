let x = 10; //Variable tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 28,
    idioma: 'es',
    get lang() {
    return this.idioma.toUppercase();
    },
    set lang(lang) {
        this.this.idioma = lang.toUppercase();
    },
    get nombreEdad() {
    return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    }
    nombreCompleto: function(){ //metodo o funcion de Js
        return this.nombre+' '+this.apellido
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona)
console.log(persona.nombreCompleto());Carlos Gil

//DIFERENTES FORMAS DE CREAR UN OBJETO


let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821'
console.log(persona2.telefono);














//AGREGAR O ELIMINAR PROPIEDADES DE LOS OBJETOS
persona.apellida = 'Betancud'; //Cambiamos dinamicamente el valor de un objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);
}


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

console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);




//VIDEO 3: CONSTRUCTORES DE OBJETOS(CLASE 5){


            
            
//Agregamos Métodos al constructor del objeto(Video 4)
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

 








//Mostramos el objeto padre utilizando la funcion (Video 4)
console.log(padre.nombreCompleto()); //Utilizamos la funcion










//Mostramos objeto madre utilizando la funcion(video 4)
console.log(madre.nombreCompleto());

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

    nombre: 'Juan',
    apellida: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: "Carlos",
    apellido: "Lara"
}

console.log(persona4.nombreCompleto2('Lic', '1321312312312'))
console.log(persona4.nombreCompleto2.call(persona5, 'Ing', '123124543534'))

console.log(persona4.nombreCompleto2('Lic.', '2635484545'));


//Metodo Apply
let arreglo =['Ing.', '547895662'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
