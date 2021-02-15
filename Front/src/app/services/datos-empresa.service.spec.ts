import { TestBed, inject } from '@angular/core/testing';

import { DatosEmpresaService } from './datos-empresa.service';

describe('DatosEmpresaService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DatosEmpresaService]
    });
  });

  it('should be created', inject([DatosEmpresaService], (service: DatosEmpresaService) => {
    expect(service).toBeTruthy();
  }));
});
