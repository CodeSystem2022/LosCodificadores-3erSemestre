class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2);