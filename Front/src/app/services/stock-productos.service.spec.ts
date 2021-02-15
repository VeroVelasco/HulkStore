import { TestBed, inject } from '@angular/core/testing';

import { StockProductosService } from './stock-productos.service';

describe('StockProductosService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StockProductosService]
    });
  });

  it('should be created', inject([StockProductosService], (service: StockProductosService) => {
    expect(service).toBeTruthy();
  }));
});
