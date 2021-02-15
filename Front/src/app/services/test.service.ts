import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs/Observable';
import { RestResponse } from '../domains/rest-response';
import { FrontAppRequestOptions } from '../security/front-app-request-options';

@Injectable()
export class TestService {

  private commentsUrl = environment.baseUrlPath;


  constructor(private http: Http) { }

  testServiceHello(): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'test/hello', options).map(res => {
      return res.json();
    });
  }


}
