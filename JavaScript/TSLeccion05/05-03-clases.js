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