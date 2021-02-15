import { TestBed, inject } from '@angular/core/testing';

import { MsgServiceService } from './msg-service.service';

describe('MsgServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MsgServiceService]
    });
  });

  it('should be created', inject([MsgServiceService], (service: MsgServiceService) => {
    expect(service).toBeTruthy();
  }));
});
