import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockProductosComponent } from './stock-productos.component';

describe('StockProductosComponent', () => {
  let component: StockProductosComponent;
  let fixture: ComponentFixture<StockProductosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockProductosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockProductosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
