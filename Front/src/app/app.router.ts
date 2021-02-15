import { ModuleWithProviders } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { FlightRequestListComponent } from './components/flight-request-list/flight-request-list.component';
import { LoginUserComponent } from './components/login-user/login-user.component';
import { StockProductosComponent } from './components/stock-productos/stock-productos.component';

const router: Routes = [

  {

    path: 'home',
    component: AppComponent,
    data: {
      title: 'Home'
    }
  },
  {

    path: 'login',
    component: LoginUserComponent,
    data: {
      title: 'Login'
    }
  },

  {

    path: 'stockProductos',
    component: StockProductosComponent,
    data: {
      title: 'Flights'
    }
  }


];

export const routes: ModuleWithProviders = RouterModule.forRoot(router, {
  // enableTracing: true, // <-- debugging purposes only

});
