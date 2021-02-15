import { Component, OnInit } from '@angular/core';
import { TestService } from '../../services/test.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css'],
  providers: [TestService]
})
export class TestComponent implements OnInit {

  constructor(public testService: TestService) { }

  ngOnInit() {
    this.obtenerTestHello();
  }

  obtenerTestHello() {
    this.testService.testServiceHello().subscribe(
      res => {

        if (res.error) {
          console.log("Error");
          return;
        }
        console.log("El resultado es "+res.response);

      },
      err => {
        console.log("Error");
      }
    );

  }

}
