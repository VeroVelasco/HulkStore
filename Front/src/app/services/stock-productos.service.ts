import { TipoProducto } from './../domains/tipo-producto';

import { StokProducto } from './../domains/stok-producto';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { RestResponse } from '../domains/rest-response';
import { FrontAppRequestOptions } from '../security/front-app-request-options';

@Injectable()
export class StockProductosService {

  private commentsUrl = environment.baseUrlPath;

  constructor(private http: Http) { }

  getAllTiposProducto(): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'stockProductos/obtenerTiposProducto', options).map(res => {
      return res.json();
    });
  }

  getProductosPorTipoProducto(codigoTipoProducto:Number): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'stockProductos/obtenerProductosPorTipo/' + codigoTipoProducto, options).map(res => {
      return res.json();
    });
  }

  obtenerStockPorProducto(codigoProducto:Number): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'stockProductos/obtenerStockPorProducto/' + codigoProducto, options).map(res => {
      return res.json();
    });
  }

  saveStockProducto(stockProducto: StokProducto): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.put(environment.baseUrlPath + 'stockProductos/guardarStockProducto', stockProducto, options).map(res => {
      return res.json();
    });
  }

}
