import { Producto } from './producto';
import { TipoMovimiento } from './tipo-movimiento.enum';
export class StokProducto {

    id:number;
    producto: Producto;
    stock: number;
    fechaMovimiento:Date;
    tipoMovimiento:TipoMovimiento

}
