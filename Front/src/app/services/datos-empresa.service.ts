import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { RestResponse } from '../domains/rest-response';
import { FrontAppRequestOptions } from '../security/front-app-request-options';

@Injectable()
export class DatosEmpresaService {

  private commentsUrl = environment.baseUrlPath;

  constructor(private http: Http) { }

  obtenerDatos(): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'datosEmpresa/', options).map(res => {
      return res.json();
    });
  }
  
}
