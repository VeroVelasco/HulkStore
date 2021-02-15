import { BaseRequestOptions } from "@angular/http";

export class FrontAppRequestOptions extends BaseRequestOptions{

    constructor() {
        super();
        let headers = new Headers();
        this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json , */*');
    }
}
