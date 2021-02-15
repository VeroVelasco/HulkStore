import { StokProducto } from './../../domains/stok-producto';
import { TipoProducto } from './../../domains/tipo-producto';
import { Producto } from './../../domains/producto';
import { Component, OnInit } from '@angular/core';
import { StockProductosService } from 'app/services/stock-productos.service';
import { TipoMovimiento } from 'app/domains/tipo-movimiento.enum';

@Component({
  selector: 'app-stock-productos',
  templateUrl: './stock-productos.component.html',
  styleUrls: ['./stock-productos.component.css'],
  providers: [StockProductosService]
})
export class StockProductosComponent implements OnInit {
  producto:Producto;
  tipoProducto:TipoProducto;
  showError: boolean = false;
  listaProductos:Producto;
  listaTiposProducto:TipoProducto;
  stokProducto:StokProducto;
  cantidad:number;
  stockActual:number;
  infoMessage:String;
  showInfoMessage:boolean;

  constructor(public stockProductosService: StockProductosService) { }

  ngOnInit() {
    this.obtenerTiposProducto();
  }

  onChange() {
    this.obtenerProductos();
  }

  onAgregarStock(){
    debugger
    this.stokProducto = new StokProducto();
    this.stokProducto.producto = this.producto;
    this.stokProducto.fechaMovimiento = new Date();
    this.stokProducto.stock = this.cantidad;
    this.guardarStockProducto(this.stokProducto);
  }

  onObtenerStock(){
    this.obtenerStockPorProducto();
  }

  limpiarDatos(){
    this.producto = null;
    this.tipoProducto = null;
    this.cantidad = 0;
  }

  obtenerTiposProducto() {
    this.stockProductosService.getAllTiposProducto().subscribe(
      res => {
        if (res.error) {
          this.showError = true;
          return;
        }
        this.listaTiposProducto = res.response;
      },
      err => {
        this.showError = true;
      });
  }

  obtenerProductos() {
    this.stockProductosService.getProductosPorTipoProducto(this.tipoProducto.codigo).subscribe(
      res => {
        if (res.error) {
          this.showError = true;
          return;
        }
        this.listaProductos = res.response;
      },
      err => {
        this.showError = true;
      });
  }

  obtenerStockPorProducto(){
    this.stockProductosService.obtenerStockPorProducto(this.producto.codigo).subscribe(
      res => {
        if (res.error) {
          this.showError = true;
          return;
        }
        this.stokProducto = res.response;
        this.stockActual = this.stokProducto.stock;
      },
      err => {
        this.showError = true;
      });
  }

  guardarStockProducto(stockProducto: StokProducto) {
    this.stockProductosService.saveStockProducto(stockProducto).subscribe(
      res => {
        if (res.error) {
          this.showError = true;
          return;
        }
        debugger
        this.infoMessage='Se agregó satisfactoriamente el stock';
        this.showInfoMessage = true;
        this.limpiarDatos();
      },
      err => {
        this.showError = true;
      }
    );

  }

}
