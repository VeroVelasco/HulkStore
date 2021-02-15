import { Component, OnInit } from '@angular/core';
import { User } from '../../domains/user';
import { UserManagementService } from '../../services/user-management.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css'],
  providers: [UserManagementService]
})
export class LoginUserComponent implements OnInit {
  user: User;
  showError: boolean = false;
  infoMessage: string;

  constructor(public userService: UserManagementService, private _router: Router) { }

  ngOnInit() {
    this.user = new User();
  }

  onLogin() {
    console.log('ingresa en login');
    this.getUserData();
  }

  getUserData() {
    this.userService.getUserByUserNameAndPassword(this.user.userName, this.user.password).subscribe(
      res => {
        if (res.error) {
          this.showError = true;
          this.infoMessage = 'Error at login';
          return;
        }
        this.user = res.response;
        if (this.user != null) {
          if (this.user.role.nameRole === 'SUPERVISOR') {
            this._router.navigate(['/flightRequestList']);
          }
        }
        else {
          this.user = new User();
          this.showError = true;
          this.infoMessage = 'Error at login';
        }
      },
      err => {
        this.showError = true;
        this.infoMessage = 'Error at login';
      });
  }
}
