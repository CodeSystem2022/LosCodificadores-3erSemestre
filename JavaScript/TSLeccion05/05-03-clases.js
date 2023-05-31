
let persona3 = new Persona('Carla', 'Ponce');

class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos'
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.apellido = 'Gomez'
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura'
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.apellido = 'Rodriguez'
console.log(persona2.apellido);
//console.log(persona2);













nombreCompleto(){
   return this._nombre+' '+this._apellido;
}

}




























console.log(empleado1.nombreCompleto());


class Empleado extends Persona{ //Clase hija
    constructor(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
}