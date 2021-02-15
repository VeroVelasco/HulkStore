import { TestBed, inject } from '@angular/core/testing';

import { FlightsManagementService } from './flights-management.service';

describe('FlightsManagementService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FlightsManagementService]
    });
  });

  it('should be created', inject([FlightsManagementService], (service: FlightsManagementService) => {
    expect(service).toBeTruthy();
  }));
});
