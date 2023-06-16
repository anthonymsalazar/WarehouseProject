import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatagoniaComponent } from './patagonia.component';

describe('PatagoniaComponent', () => {
  let component: PatagoniaComponent;
  let fixture: ComponentFixture<PatagoniaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PatagoniaComponent]
    });
    fixture = TestBed.createComponent(PatagoniaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
