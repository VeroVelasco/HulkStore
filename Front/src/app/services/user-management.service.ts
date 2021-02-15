import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { RestResponse } from '../domains/rest-response';
import { FrontAppRequestOptions } from '../security/front-app-request-options';

@Injectable()
export class UserManagementService {

  private commentsUrl = environment.baseUrlPath;

  constructor(private http: Http) { }

  getUserByUserNameAndPassword(userName: string, password: string): Observable<RestResponse> {
    let options = new FrontAppRequestOptions();
    return this.http.get(environment.baseUrlPath + 'userManagement/getUserByUserNameAndPassword/' + userName+'/'+password, options).map(res => {
      return res.json();
    });
  }
}
