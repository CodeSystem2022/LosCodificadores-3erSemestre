


































class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get _idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);//Tenemos 2 tpos de sintaxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto; //segunda sintaxis
        }
        else{
            console.log('No se pueden agregar mas prodcutos');
        }
    }//Fin del metodo agregar productos

    calcularTotal(){
        let totalVenta = 0
        for(const producto of this._productos){
            totalVenta += producto.precio
        }//Fin del ciclo for
        return totalVenta
    }//Fin del metodo calcular total

    mostrarOrden(){
        let productosOrden = ''
        for(const producto of this._productos){
            productosOrden += producto.toString() + ' '
        }//Fin del ciclo for
        console.log('Orden: ' + this._idOrden + ', Total: $' + this.calcularTotal() + ', Productos: ' + productosOrden)
    }//Fin metodo mostrar orden
}//Fin de la clase Orden

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
console.log(producto1.toString());
console.log(producto2.ToString());











